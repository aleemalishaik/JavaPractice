/**
 * this: to refer current class instance variable
 */
// public class thiskey {
//     int rollno;
//     String name;
//     double fee;

//     thiskey(int rollno, String name, double fee) {
//         this.rollno = rollno;
//         this.name = name;
//         this.fee = fee;
//     }

//     public void display() {
//         System.out.println(rollno + "\t" + name + "\t" + fee);
//     }

//     public static void main(String[] args) {
//         thiskey obj = new thiskey(1, "Ankit", 2500.99);
//         obj.display();
//     }
// }

/**
 * this: invokes current class method
 */

// class A {
//     void m() {
//         System.out.println("hello m");
//     }

//     void n() {
//         System.out.println("hello n");
//         // m();//same as this.m()
//         this.m();
//     }
// }

// class TestThis4 {
//     public static void main(String args[]) {
//         A a = new A();
//         a.n();
//     }
// }

/**
 * this: invokes current class default constructor from parameterized
 * constructor
 */

// class test {
//     test() {
//         System.out.println("This Is A Default Constructor Called From Parameterized Constructor");
//     }

//     test(String name) {
//         this();
//         System.out.println("This Is A Parameterized Constructor Parameter : " + name);
//     }

//     public static void main(String[] args) {
//         test t = new test("Java");
//     }
// }

/**
 * this: used to pass current object as an argument
 */

// class S2 {
//     int a = 55;

//     void m(S2 obj) {
//         System.out.println("method is invoked");
//     }

//     void p() {
//         m(this);
//     }

//     public static void main(String args[]) {
//         S2 s1 = new S2();
//         s1.p();
//         s1.a = 123456789;
//         System.out.println(s1.a);
//     }
// }

/**
 * this: to pass as argument in the constructor call
 */

// class B {
//     A4 obj;

//     B(A4 obj) {
//         this.obj = obj;
//     }

//     void display() {
//         System.out.println(obj.data);// using data member of A4 class
//     }
// }

// class A4 {
//     int data = 10;

//     A4() {
//     }

//     public static void main(String args[]) {
//         A4 a = new A4();
//         B b = new B(a);
//         b.display();
//     }
// }

/**
 * this: Keyword can be used to return current class instance
 */
// public class thiskey {
//     int value = 60;

//     public thiskey meth() {
//         thiskey a = new thiskey();
//         a.value = 222;
//         return this;
//     }

//     public void display(thiskey param) {
//         System.out.println("Value = " + param.value);
//     }

//     public static void main(String[] args) {
//         thiskey ab = new thiskey();
//         ab = ab.meth();
//         ab.display(ab);
//     }
// }
