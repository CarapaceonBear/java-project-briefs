package isobelle.rockpaperscissors;

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner = new Scanner(System.in);
    private boolean isActive;

    public void printMessage(String message){
        System.out.println(message);
    }

    public String getUserString(){
        return scanner.next();
    }

}
