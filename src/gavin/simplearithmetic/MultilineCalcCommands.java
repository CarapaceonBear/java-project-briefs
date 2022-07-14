package gavin.simplearithmetic;

import gavin.simplearithmetic.operations.Addition;
import gavin.simplearithmetic.operations.Multiplication;
import gavin.simplearithmetic.operations.Subtraction;

public class MultilineCalcCommands extends ArithmeticCommands{
    public MultilineCalcCommands() {
        super("Multiline Calculator", new String[]{}, "multiline-calculator");
    }

    @Override
    public void run() {
        printMessage("Welcome to the multiline calculator! \nEnter a number followed by an operator.");
        printMessage("The operators are: \n+ \n- \n/ \n*");

        double firstNum = getDoubleInput();
        double result = 0;

        boolean isActive = true;

        while (isActive) {

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

            switch (operator) {
                case "+" :
                    Addition addition = new Addition(firstNum, secondNum);
                    result = addition.calculate();
                    break;
                case "-" :
                    Subtraction subtraction = new Subtraction(firstNum, secondNum);
                    result = subtraction.calculate();
                    break;
                case "/" :
                    result = firstNum / secondNum;
                    break;
                case "*" :
                    Multiplication multiply = new Multiplication(firstNum, secondNum);
                    result = multiply.calculate();
                    break;
                case "q" :
                    isActive = false;
                    break;
            }

            printMessage("Result is " + result);
            firstNum = result;
        }
    }
}
