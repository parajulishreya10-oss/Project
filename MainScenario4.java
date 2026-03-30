import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    String employeeld;
    String name;
    String role;
    double basesalary;
    double salary;
    Employee(String employeeld, String name, String role, double basesalary){
        this.employeeld=employeeld;
        this.name=name;
        this.role=role;
        this.basesalary=basesalary;
    }
    void calculatesalary(){
        switch(role){
            case"manager":salary=basesalary+(0.2* basesalary);break;
            case"developer":salary=basesalary+(0.1 * basesalary);break;
            case"designer":salary=basesalary+(0.05* basesalary);break;
            case"intern":salary=1000;break;
        }

    }
    void applydeduction(double amount){
        salary -= amount;
    }
    void displayemployeedetails(){
        System.out.println("employeeld: "+employeeld);
        System.out.println("name: "+name);
        System.out.println("role: "+role);
        System.out.println("salary:"+salary);
    }
}
class Payroll{
    ArrayList<Employee>e= new ArrayList<>();
    void addemployee(Employee employee){
        e.add(employee);
    }
    double calculateallsalaries(){
        if(e.isEmpty()){
            System.out.println("no employee found");
            return 0;
        }
        double totalsalary=0;
        for(Employee e1:e){
            e1.calculatesalary();
            e1.displayemployeedetails();
            totalsalary+=e1.salary;
            
        }
        return totalsalary;
    }
    Employee findEmployeebyld(String employeeld){
        for (Employee e2:e){
            if(e2.employeeld.equals(employeeld)){
                return e2;
            }
        }return null;

    }
}
public class MainScenario4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Payroll p =new Payroll();
        int choice;
        while(true){
            System.out.println("1.add employee");
            System.out.println("2.calculateallsalaries");
            System.out.println("3.find employeeld");
            System.out.println("4.exit");
            System.out.println("enter choice");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("Enter Employee ID:");
                String id = sc.nextLine();
                System.out.println("Enter Name:");
                String name = sc.nextLine();
                System.out.println("Enter Role:");
                String role = sc.nextLine();
                System.out.println("Enter Base Salary:");
                double baseSalary = sc.nextDouble();
                sc.nextLine(); 

                Employee emp = new Employee(id, name, role, baseSalary);
                p.addemployee(emp);

            }
            else if(choice==2){
                double total = p.calculateallsalaries();
                System.out.println("Total cist: " + total);

            }
            else if(choice ==3){
                System.out.println("enter employeeld:");
                String id=sc.nextLine();
                Employee found= p.findEmployeebyld(id);
                if(found !=null){
                    found.calculatesalary();
                    found.displayemployeedetails();
                }else{
                    System.out.println("not found");
                }
            }else if(choice==4){
                double total=p.calculateallsalaries();
                System.out.println("totalcost: "+total);
            }else if(choice ==5){
                System.out.println("exit");
                break;
            }else{
                System.out.println("error");
            }
        }   
        sc.close();
    }
}
