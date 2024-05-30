import java.io.IOException;

// public class Excptn{
// public static void main(String[] args) {
//     try {
//         int a=40;
//         int b=0;
//         if (b==0) {

//             throw new ArithmeticException("\t\tCannot Divide By Zero.");
//         } else {
//            System.out.println(a/b);
//         }
//     } catch (Exception e) {
//         System.out.println(e.getMessage());
//     }
//     finally{
//         System.out.println("End Of Program");
//     }
// }
// }
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class Excptn {

//   public static void main(String[] args) {
//     System.out.println();
//     System.out.println("\t\t\t\t\t\t\tLOGIN FORM FOR CUSTOMER ");
//     Login login = new Login();
//     login.getCustomerDetails();
//   }
// }

// class Login {

//   static Scanner sc = new Scanner(System.in);
//   private String Name;
//   private int Age;

//   public void getCustomerDetails() throws InputMismatchException {
//     while (true) {
//       System.out.println("Enter The Details \n1. Name  \n2.Age");
//       try {
//         Name = sc.next();
//         Age = sc.nextInt();
//         System.out.println(Name + "\t" + Age);
//         break;
//       } catch (InputMismatchException e) {
//         System.out.println("Invalid Input.");
//         System.out.println("Please Enter Yuour Name First and Then Age.");
//         sc.nextLine();
//       }
//     }
//   }
// }
// // class Demo {
// //   public void method() {
// //     try {
// //       System.out.println("Dividing : " + 100 / 0);
// //     } catch (ArithmeticException e) {
// //       // System.err.println(e);    --->Works fine
// //       System.out.println(e.getMessage());
// //     } finally {
// //       System.out.println("In Finally Block. ");
// //     }
// //     for (int i = 0; i < 10; i++) {
// //       System.out.println("Hello");
// //     }
// //   }
// // }
// // class Demo {
// //   public void method() {
// //     String s = null;
// //     try {
// //       System.out.println(s.length());
// //     } catch (Exception e) {
// //       //   System.out.println(e.getMessage());
// //       System.out.println();
// //       System.out.println(e.getClass());
// //       System.out.println();
// //       StackTraceElement[] st = e.getStackTrace();
// //       for (StackTraceElement stackTraceElement : st) {
// //         System.out.println(stackTraceElement);
// //       }
// //       System.out.println();
// //       System.out.println("We Cannot Divide By Zero");
// //     }
// //   }
// // }

//USER DEFINED EXCEPTION
// public class Excptn {

//   public static void main(String[] args) {
//     try {
//       throw new MyException("This Is an User Defined Exception.");
//     } catch (Exception e) {
//       System.out.println(e.getMessage());
//     }
//   }
// }

// public class Excptn {

//   public static void main(String[] args) throws IOException {
//     Child c = new Child();
//     Parent d = new Parent();
//     c.method();
//     System.out.println();
//     System.out.println();
//     System.out.println();
//     d.method();
//   }
// }

// class Parent {

//   public void method() throws IOException {
//     System.out.println("Parent's Method.");
//   }
// }

// class Child extends Parent {

//   @Override
//   public void method() throws IOException {
//     System.out.println("Child's Method.");
//   }
// }

// public class Excptn {

//   public static void main(String[] args) {
//     Child c = new Child();
//     Parent d = new Parent();
//     c.method();
//     System.out.println();
//     System.out.println();
//     System.out.println();
//     d.method();
//   }
// }

// class Parent {

//   public void method() {
//     System.out.println("Parent's Method.");
//   }
// }

// class Child extends Parent {

//   @Override
//   public void method() throws ArithmeticException{ //Unchecked Type Of Exceptions
//     System.out.println("Child's Method.");
//   }
// }

public class Excptn {

  public static void main(String[] args) throws IOException {
    Child c = new Child();
    Parent d = new Parent();
    c.method();
    System.out.println();
    System.out.println();
    System.out.println();
    d.method();
  }
}

class Parent {

  public void method() throws IOException{
    System.out.println("Parent's Method.");
  }
}

class Child extends Parent {

  // @Override
  // public void method() throws Exception{ //Cannot Throw Exception Class Exception as it is Overriden Method
  //   System.out.println("Child's Method.");
  // }
  @Override
  public void method() throws IOException,OutOfMemoryError,ArithmeticException{ //Can Throw Same  Exception Or No Exception Or Any Other Exception  as it is Overriden Method
    System.out.println("Child's Method.");
  }
}
