abstract class Calculator {
    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
}
class SimpleCalculator extends Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide(int a, int b) {
        System.out.println("Division = " + (a / b));
    }
}
public class CalculatorApp {
    public static void main(String[] args) {

        Calculator c = new SimpleCalculator();

        c.add(10, 5);
        c.subtract(10, 5);
        c.multiply(10, 5);
        c.divide(10, 5);
    }
}
