import java.util.Scanner;

class Calculator {
    int a, b;
    int choice;

    Calculator(int x, int y, int c) {
        a = x;
        b = y;
        choice = c;
    }

    void calculate() {
        switch (choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Division = " + (a / (double)b));
                else
                    System.out.println("not divisible ");
                break;
            default:
                System.out.println("error");
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        Calculator calc = new Calculator(a, b, ch);
        calc.calculate();
    }
}

