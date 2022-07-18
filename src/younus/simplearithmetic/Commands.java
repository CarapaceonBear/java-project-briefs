package younus.simplearithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Commands {

    private final List<String> expression = new ArrayList<>();
    private final Scanner scanner;

    private final String name;

    private final String[] commands;

    public Commands(String name, String[] commands) {
        this.commands = commands;
        this.scanner = new Scanner(System.in);
        this.name = name;
    }



    public List<String> getExpression() {
        return expression;
    }

    public void printExpression(){
        System.out.println(expression);
    }
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printGreeting(){
        printMessage("Welcome to the " + name + " commands.");
    }

    public void printCommands(String[] commandsArr){
        for (int i = 0; i < commandsArr.length; i++) {
            printMessage((i + 1) + " : " + commandsArr[i]);
        }
    }

    public void printCommands(){
        printCommands(commands);
    }

    public int getCommandsInput(int rangeLimit){
        int input = 0;
        boolean isActive = true;

        while(isActive){
            printMessage("Enter a number between 1 - " + rangeLimit);
            int userInput = scanner.nextInt();
            if (userInput > 0 && userInput <= rangeLimit) {
                isActive = false;
                input = userInput;
            } else {
                printMessage("invalid input, try again");
            }
        }
        scanner.nextLine();

        return input;
    }

    public int getCommandsInput(){
        return getCommandsInput(commands.length);
    }

    public int getIntegerInput(){
        int userInput = 0;
        printMessage("Enter number:");
        int input = scanner.nextInt();
        userInput = input;
        return userInput;
    }

    public void addToExpression(int input){
        String stringInput = Integer.toString(input);
        expression.add(stringInput);

    }

    public void addToExpression(String input){
        expression.add(input);
    }

//    public int getAnswer(){
//        for (int i = 0; i < expression.size(); i++) {
//
//        }
//    }




}
