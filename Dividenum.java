import java.util.Scanner;

public class Dividenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b != 0) {
            System.out.println("result: " + (a / (double)b));
        } else {
            System.out.println("Error");
        }
    }
}


