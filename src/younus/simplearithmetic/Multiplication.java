package younus.simplearithmetic;

import java.util.List;

public class Multiplication {
    private final List<String> expression;

    public Multiplication(List<String> expression) {
        this.expression = expression;
    }

    public List<String> timesNumbers(){
        for (int i = 0; i < expression.size(); i++) {
            if (expression.get(i) == "*"){
                double answer = Double.valueOf( expression.get(i - 1)) * Double.valueOf(expression.get(i + 1));
                expression.remove(i - 1);
                expression.remove(i - 1);
                expression.remove(i - 1);
                expression.add(i - 1, String.valueOf(answer));
                i--;
            }
        }
        return expression;
    }
}
