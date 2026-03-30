abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("this animal eats foosd:");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstractmethod{
    public static void main(String[] args){
        Animal animal= new Dog();
        animal.sound();
        animal.eat(); 
    }
}
