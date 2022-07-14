package samuel.employeeregistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public abstract class Commands {

    private final Scanner scanner;
    private int numberOne;
    private int numberTwo;
    private int answer;

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }


    public List<String> fullCalculationList = new ArrayList<>();

    public void printOperators() {
        System.out.println("Please Enter either: \nPlus: + \nMinus: -  \nDivide: / \nMultiple: *\n");
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String operator;

    public int getNumberOne() {
        return numberOne;
    }

    public Commands() {
        this.scanner = new Scanner(System.in);
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
    abstract public void run();

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getStringInput() {
        String input = "";
        boolean isActive = true;

        while (isActive) {
            printMessage("Enter an operator below");
            String userInput = scanner.nextLine();
            if (userInput.equals("+")  || userInput.equals("-") || userInput.equals("*") || userInput.equals("/")){
                isActive = false;
                input = userInput;
            } else {
                printMessage("Please enter an operator from the list above");
            }
        }
        return input;
    }
    public int getIntInput() {
        int input = 0;
        boolean intIsActive = true;
        while (intIsActive) {
            printMessage("Enter Numbers");
            int userInput = scanner.nextInt();
            input = userInput;
            intIsActive = false;
        }
        return input;
    }
}
