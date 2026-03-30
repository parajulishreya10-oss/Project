public class MultipleException {
    public static void main(String[] args) {
        try{
            String str ="123a";
            int num= Integer.parseInt(str);
            int result=10/0;

        }catch (NumberFormatException | ArithmeticException e){
            System.out.println("error :"+e.getClass().getSimpleName()+"occured");
        }
        System.out.println("program continues after exception handling."); 
    }
    
}
