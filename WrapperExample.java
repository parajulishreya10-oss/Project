import java.util.Scanner;

public class WrapperExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a float number: ");
        float num = sc.nextFloat();   
        Integer intNum = (int) num;

        System.out.println("integer value: " + intNum);
    }
}

