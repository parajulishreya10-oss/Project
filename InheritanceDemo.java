class Parent {
    int age;
    String name;
    long prn;

    void student(int a, String n, long p) {
        age = a;
        name = n;
        prn = p;
    }

    void showParent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("PRN: " + prn);
    }
}

class Child extends Parent {
    void showChild() {
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.student(12, "Shreya", 24070122191L); 
        c.showParent(); 
        c.showChild();
    }
}
