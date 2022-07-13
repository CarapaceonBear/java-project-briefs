package will.simplearithmetic;

public class Addition implements Calculator {
    @Override
    public Float runCalculation(Float firstNumber, Float secondNumber) {
         return (firstNumber + secondNumber);
    }
}
