package isobelle.simplearithmetic;

public class Addition {
    UserInput userInput = new UserInput();

    public void runAddition(){
        userInput.printMessage("Enter First Number");
        int firstNum = userInput.getNumber();
        userInput.printMessage("Enter Second Number");
        int secondNum = userInput.getNumber();
        int total = firstNum + secondNum;
        userInput.printMessage(firstNum + " + " + secondNum + " = " + total);
    }
}
