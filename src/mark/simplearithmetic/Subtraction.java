package mark.simplearithmetic;

import java.util.Scanner;

public class Subtraction {

    public static int subtractTwoNumbers(int num1, int num2) {
        int sum = num1 - num2 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scanner.nextInt();

        System.out.println("Enter second number");
        num2 = scanner.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        return sum ;
    }
}
