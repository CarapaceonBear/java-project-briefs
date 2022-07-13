package gavin.simplearithmetic.operations;

public class Addition extends Operation{

    public Addition(double first, double second) {
        super(first, second, "+");
    }

    public double calculate() {
        return getFirst() + getSecond();
    }
}
