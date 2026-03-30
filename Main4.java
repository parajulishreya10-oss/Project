class Exceptiondemo{
    static void func(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("catch inside func().");
            throw e;
        }
    }
    public static void Main4(String [] args){
        try{
            func();
        }catch(NullPointerException e){
            System.out.println("caught in main.");
        }
    }
}
