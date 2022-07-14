package gavin.simplearithmetic;

import gavin.simplearithmetic.operations.Addition;
import gavin.simplearithmetic.operations.Division;
import gavin.simplearithmetic.operations.Multiplication;
import gavin.simplearithmetic.operations.Subtraction;

public class MultilineCalcCommands extends ArithmeticCommands{
    public MultilineCalcCommands() {
        super("Multiline Calculator", new String[]{}, "multiline-calculator");
    }

    @Override
    public void run() {
        printMessage("Welcome to the multiline calculator! \nEnter a number followed by an operator. \nPress q to quit.");
        printMessage("The operators are: \n+ \n- \n/ \n*");

        double firstNum = getDoubleInput();
        double result = 0;

        boolean isActive = true;

        while (isActive) {

            boolean isCorrectOperator = true;
            String operator = "";
            while (isCorrectOperator) {
                operator = getStringInput();
                if (operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*") || operator.equals("q")) {
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
                    boolean isSecondZero = secondNum == 0;
                    while (isSecondZero) {
                        printMessage("Cannot divide by zero, please select a different number.");
                        secondNum = getDoubleInput();
                        if (secondNum != 0) {
                            isSecondZero = false;
                        }
                    }
                    Division divide = new Division(firstNum, secondNum);
                    result = divide.calculate();
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
