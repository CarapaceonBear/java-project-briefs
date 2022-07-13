package isobelle.simplearithmetic;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);
    private boolean isActive;

    public void printMessage(String message){
        System.out.println(message);
    }

    public int getIntegerInput(int rangeLimit){
        isActive = true;
        int input = 0;
        while(isActive){
            printMessage("Enter a number between 1 - " + rangeLimit);
            int userInput = scanner.nextInt();
            if(userInput > 0 && userInput<= rangeLimit){
                isActive = false;
                input = userInput;
            }else {
                printMessage("Unable to understand input, try again");
            }
        }
        scanner.nextLine();
        return input;
    }

    public int getNumber(){
        isActive = true;
        int numberInput = 0;
        while(isActive){
            String userInput = scanner.next();
            try {
                numberInput = Integer.parseInt(userInput);
                isActive = false;
            }catch(NumberFormatException e) {
                printMessage("Your input is not an number\nEnter a number");
            }
        }
        return numberInput;
    };

}
