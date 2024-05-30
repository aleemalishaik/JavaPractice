
// public class varargs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Starting Mobile");
//         System.out.println("Select From Following Options \n 1. Make a Call \n 2.write a message \n");
//         int optionchosed = sc.nextInt(); 
//         switch (optionchosed) {
//             case 1:
//                 call(sc.nextLong());
//                 break;
//             case 2:
//                 message(sc.next(),sc.next());
//                 break;
//             default:
//                 break;
//         }

//     }

//     public static void call(long... number) {
//         System.out.println("Calling contact number");
//         for (long l : number) {
//             System.out.print(l);
//         }
//     }

//     public static void message(String name,String... msg) {
//         System.out.println("Writing Message To "+ name);
//         for (String string : msg) {
//             System.out.print(string);
//         }
//     }
// }

// public class varargs {

//     // public static void name(int... x) {

//     // }

//     // public static void name(int[] a) { error 
//     // }
// }

// public class varargs {
//     public static void name(int[]... x) {// Two Dimensional Array

//     }

//     public static void name(int... x) {

//     }

//     public static void main(String[] args) {
//         name(new int[] { 1, 2, 3, 4 });// Passing Array Instead Of Individual Values
//     }
// }
/**
 * varargs
 */
public class varargs {

    public static void main(String[] args) {
        System.out.println("HI!!");
    }
}