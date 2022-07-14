package hugo.simplearithmetic;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calculator {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void stepByStep() {

        UserInput userInput = new UserInput();

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
    }

    public void totalInput() {
        UserInput userInput = new UserInput();

        String sum = userInput.getSumInput("Enter sum:");
        String[] separatedSum = sum.split(" ", 3);

        int num1 = parseInt(separatedSum[0]);
        String operator = separatedSum[1];
        int num2 = parseInt(separatedSum[2]);

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
    }
}