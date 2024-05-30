// public class PracticeSuper {

//   public static void main(String[] args) {
//     Case_1 c = new Case_1();
//     c.print();
//     System.out.println();
//     Case_2 c2 = new Case_2();
//     c2.print();
//   }
// }

// class BookCase {

//   int floorNumber;
//   String color = "Black";

//   void print() {
//     System.out.print("Color = " + color + " \t ");
//   }
// }

// class Case_1 extends BookCase {

//   int NumberOfShelfs = 20;
//   int floorNumber = 1;

//   @Override
//   void print() {
//     super.print();
//     System.out.println(
//       "Floor Number = " +
//       floorNumber +
//       "\t Number Of Shelves = " +
//       NumberOfShelfs
//     );
//   }
// }

// class Case_2 extends BookCase {

//   int NumberOfShelfs = 30;
//   int floorNumber = 2;

//   @Override
//   void print() {
//     super.print();
//     System.out.println(
//       "Floor Number = " +
//       floorNumber +
//       "\t Number Of Shelves = " +
//       NumberOfShelfs
//     );
//   }
// }

// class Person {

//   int id;
//   String name;

//   Person(int id, String name) {
//     this.id = id;
//     this.name = name;
//   }
// }

// class Emp extends Person {

//   int salary;

//   Emp(int id, String name, int salary) {
//     super(id, name); //reusing parent constructor
//     this.salary = salary;
//   }

//   void display() {
//     System.out.println(id + " " + name + " " + salary);
//   }
// }

// class TestSuper5 {

//   public static void main(String[] args) {
//     Emp e1 = new Emp(1, "ankit", 45000);
//     e1.display();
//     Emp e2 = new Emp(2, "Aleem", 50000);
//     e2.display();
//   }
// }
