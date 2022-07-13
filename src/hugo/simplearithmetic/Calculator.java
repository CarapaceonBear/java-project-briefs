package hugo.simplearithmetic;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public String main() {

        System.out.println("First Number");

        int num1 = scanner.nextInt();

    public void main() {

        UserInput userInput = new UserInput();
        boolean isActive = true;

        while (isActive) {
            int num1 = userInput.getIntInput("Enter first number:");
            int num2 = userInput.getIntInput("Enter second number:");
            String operator = userInput.getStringInput("Enter operator:");

            switch (operator) {
                case "+":
                    Addition addition = new Addition();
                    addition.performAddition(num1, num2);
                    break;
                case "-":
                    Subtraction subtraction = new Subtraction();
                    subtraction.performSubtraction(num1, num2);
                    break;
                case "*":
                    Multiplication multiplication = new Multiplication();
                    multiplication.performMultiplication(num1, num2);
                    break;
                case "/":
                    Division division = new Division();
                    division.performDivision(num1, num2);
                    break;
                default:
                    System.out.println("Operator not recognised");
            }

            int input = userInput.getIntInput("Would you like to perform another calculation?\n1. Yes\n2. No");
            if (input == 2) {
                isActive = false;
            }
        }
    }
}
