class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Int add: " + calc.add(5, 10));
        System.out.println("Double add: " + calc.add(5.5, 4.5));
    }
}

