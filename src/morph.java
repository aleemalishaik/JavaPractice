public class morph {

  public static void main(String[] args) {
    /**
     * Compile Time Polymorphism
     */
    // Comp ob;
    // ob = new Comp();
    // ob.method();
    // ob.method("Shirt");

    /**
     * Run Time Polymorphism
     *
     * Rule: Runtime polymorphism can't be achieved by data members.
     *
     */
    Run ob = new ChildRun();
    ob.method();
    System.out.println(ob.speedLimit);
  }
}

class Comp {

  public void method() {
    System.out.println("parent comp");
  }

  public void method(String java) {
    System.out.println("value : " + java);
  }
}

class ChildComp extends Comp {

  @Override
  public void method() {
    System.out.println("Child Comp");
  }
}

class Run {

  int speedLimit = 90;

  public void method() {
    System.out.println("Parent Run");
  }
}

class ChildRun extends Run {

  int speedLimit = 150;

  public void method() {
    System.out.println("Child Run");
  }
}
