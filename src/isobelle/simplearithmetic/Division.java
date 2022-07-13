package isobelle.simplearithmetic;

public class Division {
    UserInput userInput = new UserInput();

    public void runDivision(){
        userInput.printMessage("Enter First Number");
        int firstNum = userInput.getNumber();
        userInput.printMessage("Enter Second Number");
        int secondNum = userInput.getNumber();
        int total = firstNum / secondNum;
        userInput.printMessage(firstNum + " ÷ " + secondNum + " = " + total);
    }
}
