public class Floatnum {
    public static double add(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        float num1 = 5.5f;
        float num2 = 4.5f;
        double sum = add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}

