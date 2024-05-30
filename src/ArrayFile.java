
// import java.util.Scanner;

// public class ArrayFile {
//     public static void main(String[] args) {
//         // int[] a = { 10, 20, 30 };
//         // int[] b = new int[]{10,20};no need to define size
//         // int[] c = new int[20];size defined
//         // // then only way to initialize is
//         // c[0] = 1;
//         // c[1] = 0;
//         System.out.println(a.length);
//     }
// }

/**
 * ArrayFile
 */
// public class ArrayFile {

// public static void main(String[] args) {
// // Number[] array = new Number[10];
// // array[0] = new Integer(10);
// Number[] arr={10,20,30.5f,55.9999,1,0Xface005669l,022350,2.55f};
// for (Number number : arr) {
// System.out.print(number+"\t");
// }
// }
// }
// class Parent {
// public int getObjValue() {
// return 0;
// }

// public String getObjName() {
// return null;
// }
// }

// class Child extends Parent {
// int ObjValue;
// String ObjName;

// public static void main(String[] args) {
// Child obj = new Child();
// obj.name();
// }

// @Override
// public int getObjValue() {
// return this.ObjValue;
// }

// @Override
// public String getObjName() {
// return this.ObjName;
// }

// public void name() {
// Child ch1 = new Child();
// ch1.ObjValue = 1;
// ch1.ObjName = "Object_1";
// Parent[] p = { ch1 };
// System.out.println(p[0].getObjValue());
// System.out.println(p[0].getObjName());
// }
// }

// -----------------------------------------------
// class Parent {
//     public int getObjValue() {
//         return 0;
//     }

//     public String getObjName() {
//         return null;
//     }
// }

// class Child extends Parent {
//     private int objValue;
//     private String objName;

//     public Child(int objValue, String objName) {
//         this.objValue = objValue;
//         this.objName = objName;
//     }

//     @Override
//     public int getObjValue() {
//         return objValue;
//     }

//     @Override
//     public String getObjName() {
//         return objName;
//     }

//     public static void main(String[] args) {
//         Child obj = new Child(1, "Object_1");
//         obj.displayObjectDetails();
//     }

//     public void displayObjectDetails() {
//         Parent[] parents = { this }; // Using 'this' to refer to the current object
//         System.out.println("object--" + parents[0].getObjValue());
//         System.out.println("name--" + parents[0].getObjName() + "\n");
//     }
// }

