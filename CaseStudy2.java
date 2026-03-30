class Employee{
    double basesalary;
    String name;
    Employee(double basesalary, String name){
        this.basesalary=basesalary;
        this.name=name;
    }
    double calculatesalary(){
        return basesalary+(basesalary * 0.05);
    }
    void display(){
        System.out.println("calculated "+ name+calculatesalary());
    }
}
class Manager extends Employee{
    Manager( double basesalary, String name){
        super(basesalary,name);
    }
    double calculatesalary(){
        return super.calculatesalary()+2000;
    }
    void display(){
        System.out.println("calculated %s:%.2f%n"+name+calculatesalary());
    }
}
class Executive extends Employee{
    Executive(double basesalary, String name){
        super(basesalary,name);
    }
    double calculatesalary(){
        return super.calculatesalary()+(basesalary*0.10);
    }
    void display(){
        System.out.println("calculated:"+name+calculatesalary());
    }
}
public class CaseStudy2{
    public static void main(String[] args){
        Employee e= new Employee(10500, "Alice");
        e.display();
        Employee e1=new Employee(12500, "bob");
        e1.display();
        Employee e3= new Employee(13500,"Charlie");
    }
}