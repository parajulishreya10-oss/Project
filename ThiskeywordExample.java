class Student {
    String name;
    Student(String name){
        this.name=name;
    }

    void display(){
        System.out.println("Name: "+this.name);
    }
}
public class ThiskeywordExample{
    public static void main(String[] args){
        Student s=new Student("ALICE");
        s.display();
    }
}
