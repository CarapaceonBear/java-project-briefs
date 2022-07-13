package will.simplearithmetic;

public class Subtraction implements Calculator {
    @Override
    public Float runCalculation(Float firstNumber, Float secondNumber) {
        return (firstNumber - secondNumber);
    }
}
