package isobelle.simplearithmetic;

public class Multiplication {
    UserInput userInput = new UserInput();

    public void runMultiply(){
        userInput.printMessage("Enter First Number");
        int firstNum = userInput.getNumber();
        userInput.printMessage("Enter Second Number");
        int secondNum = userInput.getNumber();
        int total = firstNum * secondNum;
        userInput.printMessage(firstNum + " x " + secondNum + " = " + total);
    }
}
