package gavin.simplearithmetic;

public class CalculatorCommands extends ArithmeticCommands{
    public CalculatorCommands() {
        super("Calculator", new String[]{}, "calculator");
    }

    @Override
    public void run() {
        printMessage("Welcome to the calculator! \nEnter a number followed by an operator.");

        double firstNum = getDoubleInput();

        boolean isCorrectOperator = true;

        String operator = "";
        while (isCorrectOperator) {
            operator = getStringInput();
            if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*")) {
                isCorrectOperator = false;
            } else {
                printMessage("Invalid Operator. Please try again.");
            }
        }

        double secondNum = getDoubleInput();
        double result = 0;

        switch (operator) {
            case "+" :
                result = firstNum + secondNum;
                break;
            case "-" :
                result = firstNum - secondNum;
                break;
            case "/" :
                result = firstNum / secondNum;
                break;
            case "*" :
                result = firstNum * secondNum;
                break;
        }

        printMessage("Result is " + result);

    }
}
