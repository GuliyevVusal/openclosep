public class Main {

    public static void main(String[] args) {

        CalculatorApp calculatorApp = new CalculatorApp();

        double additionResult = calculatorApp.calculate(new Addition(), 8, 22 );
        System.out.println("Addition result: " + additionResult);

        double divisionResult = calculatorApp.calculate(new Division(), 5, 2);
        System.out.println("Division result: " + divisionResult);
    }
}
