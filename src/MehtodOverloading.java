public class MehtodOverloading {

  public static void main(String[] args) {
    Example e = new Example();
    e.Method(1, 2, 3.2f);
  }
}

class Example {

  public int Method(int a) {
    System.out.println("Value Of a = " + a);
return 0;  
}

  public void Method(int a, int b) { // Change No of Arguments
    System.out.println("\n Value Of a = " + a + "\t Value Of b = " + b);
  }

  public void Method(int a, int b, float f) { // Change DataType of Arguments
    System.out.println(
      "\n Value Of a = " + a + "\t Value Of b = " + b + "\t Value Of f = " + f
    );

  }
}

// class Adder {

//   static int add(int a, int b) {
//     return a + b;
//   }

//   static double add(double a, double b) {
//     return a + b;
//   }
// }

// class TestOverloading2 {

//   public static void main(String[] args) {
//     System.out.println(Adder.add(11, 11));
//     System.out.println(Adder.add(12.3, 12.6));
//   }
// }