package gavin.simplearithmetic.operations;

public class Subtraction extends Operation{
    public Subtraction(double first, double second) {
        super(first, second, "-");
    }

    public double calculate () {
        return getFirst() - getSecond();
    }
}
