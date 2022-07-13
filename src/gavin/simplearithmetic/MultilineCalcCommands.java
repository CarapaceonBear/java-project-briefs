package gavin.simplearithmetic;

public class MultilineCalcCommands extends ArithmeticCommands{
    public MultilineCalcCommands() {
        super("Multiline Calculator", new String[]{}, "multiline-calculator");
    }

    @Override
    public void run() {
        printMessage("Welcome to the multiline calculator! \nEnter a number followed by an operator.");

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
                case "q" :
                    isActive = false;
            }

            printMessage("Result is " + result);
            firstNum = result;
        }
    }
}
