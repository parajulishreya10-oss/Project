import java.util.Scanner;
class PinValidation extends Exception{
    PinValidation(String message){
        super(message);
    }
    public static void checkPin(int pin) throws PinValidation{
        String s= String.valueOf(pin);
        if(s.length()!=4){
            throw new PinValidation(" pin should be 4 digits.");
        }
    }
}
public class Userdefine{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 4 digit PIN: ");
    int pin = sc.nextInt();
    try {
        PinValidation.checkPin(pin);
        System.out.println("PIN entered");
    } catch (PinValidation e) {
        System.out.println("Error: " + e.getMessage());
    }
    sc.close();
}

}
