package hugo.simplearithmetic;

public class Multiplication extends Calculator {
    public void performMultiplication(int num1, int num2) {
        int result = num1 * num2;
        printMessage(String.format("%s * %s = %s", num1, num2, result));
    }
}
