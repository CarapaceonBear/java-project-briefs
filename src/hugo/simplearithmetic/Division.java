package hugo.simplearithmetic;

public class Division extends Calculator {
    public void performDivision(int num1, int num2) {
        float result = (float) num1 / num2;
        printMessage(String.format("%s - %s = %s", num1, num2, result));
    }
}
