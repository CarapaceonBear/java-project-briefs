package samuel.employeeregistry;

import javax.sound.midi.SysexMessage;
import java.util.Objects;
import java.util.Scanner;

public abstract class Commands {

    private final Scanner scanner;


    protected Commands(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    abstract public void run();

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getStringInput() {
        String input = "";
        boolean isActive = true;

        while (isActive) {
            printMessage("Enter text below");
            String userInput = scanner.nextLine();

            if (!Objects.equals(userInput, "")) {
                isActive = false;
                input = userInput;
            } else {
                printMessage("Unable to understand input, try again");
            }
        }
            return input;
    }
}

//    public int getIntInput(){
//        int input = 0;
//        boolean intIsActive = true;
//        while(intIsActive){
//            printMessage("Enter Numbers");
//            int userInput = scanner.nextInt();
//        }
//    }
