class Parent {
    Parent(){
        System.out.println("Parent class Constructor");
    }  
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("child class constructor");
    }
}
public class Main2{
    public static void main(String[] args){
        new Child();
    }
}
