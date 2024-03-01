
public class Division implements CalculatorOperation {

    @Override
    public double calculate(double left, double right) {
        if (right == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return left / right;
    }
}
