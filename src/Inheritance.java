/**
 * ---------------------------------------------------IS-A RELATIONSHIP (Inheritance)---------------------------------------------------------
 */
// class SuperClass {

//   public int a = 112;

//   public void Method() {
//     System.out.println("SuperClass Method");
//   }

//   public void Method2() {
//     System.out.println("SuperClass Method2");
//   }
// }

// class SubClass extends SuperClass {

//   @Override
//   public void Method() {
//     System.out.println("SubClass Method \t" + a);
//   }

//   @Override
//   public void Method2() {
//     System.out.println("SubClass Method2");
//   }
// }

// public class Inheritance {

//   public static void main(String[] args) {
//     SubClass object = new SubClass();
//     object.Method();
//     object.Method2();
//   }
// }

// sealed class A permits B, C {}

// final class B extends A {}

// final class C extends A {}
// class Animal {

//   String colour;

//   public void Eat() {
//     System.out.println("Animal.Eat()");
//   }

//   public void Walk() {
//     System.out.println("Animal.Walk()");
//   }

//   public void Run() {
//     System.out.println("Animal.Run()");
//   }
// }
// class Dog extends Animal {
//   public static void main(String[] args) {
//     Dog d = new Dog();
//     d.colour = "Black";
//     d.Eat();
//     d.Walk();
//     d.Run();
//   }
// }
// class Cat extends Animal {
//   public static void main(String[] args) {
//     Cat c = new Cat();
//     c.colour = "White";
//     c.Eat();
//     c.Run();
//     c.Walk();
//     System.out.println(c.colour);
//   }
// }

/**
 * ---------------------------------------------------HAS-A RELATIONSHIP (Aggregation)---------------------------------------------------------
 * A Class Has-A Relationship with another class by Declaring It As A Member  Rather Than Inheriting It
 */

// class Reference {

//   private int ReferenceNumber;

//   Reference(int ReferenceNumber) {
//     this.ReferenceNumber = ReferenceNumber;
//   }
// }

// class Aggregation {

//   Reference reference;
//   String name;
//   String position;

//   Aggregation(Reference reference, String name, String position) {
//     this.reference = reference;
//     this.name = name;
//     this.position = position;
//   }

//   public static void main(String[] args) {
//     Reference r = new Reference(1011);
//     Aggregation a = new Aggregation(r, "Shaik", "Developer");
//     System.out.println(a.name + a.position);
//   }
// }
