import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // Conditions for typecasting:-
        // -> the two type should be compatible
        // -> the destination type should be greater than the source type
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

//        int num = (int)(69.69f);
//        System.out.println(num);

        // Automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte)(a); // max num in a byte i can store is 256 ...  {257%256 = 1}
//        System.out.println(b);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = (b*2);

        // Java follows unicode values

        byte b = 42;
        char c = 'd';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d-s); // float + int - double = double.
        System.out.println(result);

    }
}
