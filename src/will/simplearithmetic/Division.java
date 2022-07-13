package will.simplearithmetic;

public class Division implements Calculator {
    @Override
    public Float runCalculation(Float firstNumber, Float secondNumber) {
        return (firstNumber / secondNumber);
    }
}
