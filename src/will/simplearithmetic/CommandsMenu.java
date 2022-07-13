package will.simplearithmetic;

import java.text.DecimalFormat;

public class CommandsMenu {

    private String[] menuCommands = {"Run calculation", "Quit"};
    private String[] operatorCommands = {"+", "-", "*", "/"};
    private UserInput user;
    private boolean isActive;
    private boolean isCalculating;
    private DecimalFormat decimalPlaces = new DecimalFormat("0.000");
    private Addition addition = new Addition();
    private Subtraction subtraction = new Subtraction();
    private Multiplication multiplication = new Multiplication();
    private Division division = new Division();

    public CommandsMenu(UserInput user) {
        this.user = user;
    }

    public void runMenu() {
        isActive = true;
        while (isActive) {
            printCommands(menuCommands);
            int selection = user.readMenuSelection(menuCommands.length);

            switch (selection) {
                case 1:
                    Float result = runCalculation();
                    user.printMessage(decimalPlaces.format(result));
                    break;
                case 2:
                    isActive = false;
                    break;
            }
        }
    }

    private void printCommands(String[] commands) {
        for (int i = 0; i < commands.length; i++) {
            user.printMessage(String.format("%d - %s", i + 1, commands[i]));
        }
    }

    private Float runCalculation() {
        user.printMessage("First number:");
        Float firstNumber = user.readNumberInput();
        user.printMessage("Second number:");
        Float secondNumber = user.readNumberInput();
        printCommands(operatorCommands);
        int operator = user.readMenuSelection(operatorCommands.length);

        Float result = 0F;
        switch (operator) {
            case 1:
                result = addition.runCalculation(firstNumber, secondNumber);
                break;
            case 2:
                result = subtraction.runCalculation(firstNumber, secondNumber);
                break;
            case 3:
                result = multiplication.runCalculation(firstNumber, secondNumber);
                break;
            case 4:
                result = division.runCalculation(firstNumber, secondNumber);
                break;
        }
        return result;
    }

}
