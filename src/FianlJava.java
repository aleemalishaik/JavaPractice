public class FianlJava {

  public static void main(String[] args) {
    Final_Test f = new Final_Test();
    f.method();
  }
}

class Final_Test {

  final int testValue;

  {
    testValue = 100;
  }

  public void method() {
    System.out.println("Hello World!  " + testValue);
    // testValue += 500; // Throws An Error
  }
}
