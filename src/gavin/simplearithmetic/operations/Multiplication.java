package gavin.simplearithmetic.operations;

public class Multiplication extends Operation{
    public Multiplication(double first, double second) {
        super(first, second, "*");
    }

    public double calculate () {
        return getFirst() * getSecond();
    }
}
