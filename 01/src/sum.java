import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter second number :");
        int num2 = input.nextInt();

        System.out.println("Sum of both number: " +(num1+num2));
    }
}
