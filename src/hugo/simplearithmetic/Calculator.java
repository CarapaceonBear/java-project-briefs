package hugo.simplearithmetic;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public String main() {

        System.out.println("First Number");

        int num1 = scanner.nextInt();

        System.out.println("Second Number");

        int num2 = scanner.nextInt();

        System.out.println("Operator");

        String operator = scanner.next();

        switch (operator) {
            case "+":
                int addResult = num1 + num2;
                return String.format("%s %s %s = %s", num1, operator, num2, addResult);
            case "-":
                int subtractResult = num1 - num2;
                return String.format("%s %s %s = %s", num1, operator, num2, subtractResult);
            case "*":
                int multiplyResult = num1 * num2;
                return String.format("%s %s %s = %s", num1, operator, num2, multiplyResult);
            case "/":
                float divideResult = (float) num1 / num2;
                return String.format("%s %s %s = %s", num1, operator, num2, divideResult);
            default:
                return "operator not recognised";
        }
    }
}
