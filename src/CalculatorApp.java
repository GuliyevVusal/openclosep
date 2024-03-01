import java.security.InvalidParameterException;

public class CalculatorApp {

    public double calculate(CalculatorOperation operation, double left, double right) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null!!1");
        }
        return operation.calculate(left, right);
    }
}
