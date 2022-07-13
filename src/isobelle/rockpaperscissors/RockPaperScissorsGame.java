package isobelle.rockpaperscissors;

public class RockPaperScissorsGame {
    UserInput userInput = new UserInput();
    String[] options = {"R", "P", "S"};
    int rand = (int)(Math.random() * options.length - 1) + 0;

    public void runGame(){
        userInput.printMessage("Enter R, P or S: ");
        userInput.getUserString();

    }
}
