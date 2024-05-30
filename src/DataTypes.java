public class DataTypes {
    public static void main(String[] args) {
        // byte a=-128;
        // System.out.println(a);
        // int number=2147483647;
        // System.out.println(number);
        // for (int i = - 2147483648; i < 2147483647; i++) {
        // System.out.print(" "+i+" ");
        // }
        // int a = 10;
        // long i = 999999999999999999l;
        // System.out.println(a);
        // System.out.println(i);
        // byte b = 127;
        // short c = b;

        /***
         * octal and hexxadecimal literal is not allowed in java.
         */
        // double d = 123.888d;
        // float e = 125.22f;
        // double ex1 = 1.2e3;//1.2x10^3;

        // float ex2=1.2e3f;
        // System.out.println(ex2);
        // System.out.println(ex1);
        // double ex1=0786;gives error
        // double ex1=0786.0;does not give error
        // double ex2=0Xface.0; gives error
        // double ex2=0Xface; does not give error
        // char ch=97;//UNICODE EQUIVALENT WILL BE PRINTED (0-65535)
        // System.out.println(ch);
        // char ch2='\u0061';
        // System.out.println(ch2);
        double a=2_3.8_9;
        System.out.println(a);
    }
}