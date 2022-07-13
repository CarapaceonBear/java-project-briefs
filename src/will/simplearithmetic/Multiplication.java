package will.simplearithmetic;

public class Multiplication implements Calculator {
    @Override
    public Float runCalculation(Float firstNumber, Float secondNumber) {
        return (firstNumber * secondNumber);
    }
}
