class Animal {
    void eat(){
        System.out.println("this animal eats food.");
    } 
}
class Dog extends Animal {
    void eat(){
        super.eat();
        System.out.println("dog barks");
    }
}
public class Animal{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
    }
}