class Demo{
    Demo(){
        this("Default Constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
}
public class Main1 {
    public static void main(String[] args){
        new Demo();
    }   
}
