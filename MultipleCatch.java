public class MultipleCatch {
    public static void main(String[] args){
        try{
            String str =null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("error:null pointer exception ! object is null");
        }catch(Exception e){
            System.out.println("some other error occured");
        }
        System.out.println("program continues after exception handling.");
    }
}
