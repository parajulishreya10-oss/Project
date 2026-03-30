class Animals{
    String type="animal";
    Animals(String sound){
        System.out.println("Animal makes sound"+sound);

    }
    void eat(){
        System.out.println("Animal is eating");

    }
}
class Dog extends Animals{
    String type="Dog";
    Dog(String sound){
        super(sound);
        System.out.println("dog constructor called");
    }
    void show(){
        System.out.println("type:"+this.type);
        System.out.println("type:"+super.type);
        this.eat();
        super.eat();
    }
}
public class Thissuper{
    public static void main(String[] args){
        Dog d= new Dog("Bark");
        d.show();
    }
}
