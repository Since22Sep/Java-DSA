import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // if condition inside the if is true then it will be executed
//        if(true){
//            System.out.println("Hello World");
//        }

//        int count = 1;
//        while(count != 5){
//            System.out.println(count);
//            count ++;
//        }

        // for loop

//        for(int count = 1; count !=5; count++){
//            System.out.println(count);
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter tem in c: ");

        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);


    }
}
