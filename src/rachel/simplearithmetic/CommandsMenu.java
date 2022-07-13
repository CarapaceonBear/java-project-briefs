package rachel.simplearithmetic;

import static rachel.simplearithmetic.Main.scanner;

public class CommandsMenu {
    public void run() {
        System.out.println("Let's solve simple-arithmetic");
        double a = getDoubleInput();
        String operator = getOperator();
        double b = getDoubleInput();
        double result = getResult(a, b, operator);
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    private String getOperator() {
        System.out.println("Enter an operator (*, /, +, -)");
        String input = scanner.nextLine();
        if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
            return input;
        } else {
            return getOperator();
        }
    }

    private double getDoubleInput() {
        System.out.println("Enter an number");
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    private double getResult(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return Addition.add(a, b);
            case "-":
                return Subtraction.subtract(a, b);
            case "*":
                return Multiplication.multiply(a, b);
            case "/":
                return Division.divide(a, b);
        }
        throw  new IllegalArgumentException();
    }
}
