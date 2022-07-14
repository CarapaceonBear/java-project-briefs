package hugo.simplearithmetic;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();
        boolean isActive = true;

        while (isActive) {
            int sumType = userInput.getIntInput("Select calculation input type:\n1. Guided input\n2. Manual input\n3. Quit");

            switch (sumType) {
                case 1:
                    calculator.stepByStep();
                    break;
                case 2:
                    calculator.totalInput();;
                    break;
                default:
                    isActive = false;
            }
        }
    }
}