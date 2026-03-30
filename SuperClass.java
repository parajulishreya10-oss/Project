import java.lang.classfile.Superclass;
class SuperClass{
    void method(){
        System.out.println("super class method executed:");
    }
}
class Subclass extends SuperClass{
    void method() throws ArithmeticException{
        System.out.println("super class method executed");
        throw new ArithmeticException("execution in subclass");
    }
    public static void main(String[] args) {
        SuperClass s= new Subclass();
        try{
            s.method();
        }catch(ArithmeticException e){
            System.err.println("caught exexption:"+e.getMessage());
        }
    }

}
