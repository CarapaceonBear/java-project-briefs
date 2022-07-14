package hugo.simplearithmetic;

import java.util.Scanner;

public class UserInput extends Calculator {

    Scanner scanner = new Scanner(System.in);

    public int getIntInput(String message) {
        printMessage(message);
        return scanner.nextInt();
    }

    public String getStringInput(String message) {
        printMessage(message);
        return scanner.next();
    }

    public String getSumInput(String message) {
        printMessage(message);
        return scanner.nextLine();
    }
}
