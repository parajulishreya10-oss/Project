 class Outer {
    int number=5;
    class Inner{
        void show(){
            System.out.println(number);
        }
    }
}
public class Demo {
    public static void main(String[] args) {

        Outer o = new Outer();          
        Outer.Inner i = o.new Inner(); 

        i.show();
    }
}