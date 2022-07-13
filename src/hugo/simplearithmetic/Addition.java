package hugo.simplearithmetic;

public class Addition extends Calculator {
    public void performAddition(int num1, int num2) {
        int result = num1 + num2;
        printMessage(String.format("%s + %s = %s", num1, num2, result));
    }
}
