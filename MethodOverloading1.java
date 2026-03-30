class MethodOver{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloading1{
    public static void main(String[] args){
        MethodOver obj=new MethodOver();
        System.out.println(obj.add(2,5));
        System.out.println(obj.add(5.5,5));
        System.out.println(obj.add(2,7,9));
    }
}
