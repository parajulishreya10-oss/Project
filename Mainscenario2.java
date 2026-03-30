import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    List<Double>grades=new ArrayList<>();
    void addgrade (double grade){
        grades.add(grade);
    }
    float calculateavg(){
        if (grades.isEmpty()){
            return 0;
        }else{
            float sum=0;
            for( double g:grades){
                sum+=g;
            }
            float avg=sum/grades.size();
            return avg;
        }
    }
    void displaystddetails(){
        System.out.println("names: "+name);
        if(grades.isEmpty()){
            System.out.println("grades not added");
        }else{
            System.out.println("grades: "+grades);
            System.out.println("average:"+calculateavg());
        }
    }
}
class Grademanager{
    ArrayList<Student>s=new ArrayList<>();
    void addstudent(Student student ){
        s.add(student);
    }
    Student findstudentbyname(String name){
        for(Student s2:s){
            if(s2.name.equalsIgnoreCase(name)){
                return s2;
            }
        }
        return null;

    }
    void displayallstudents(){
            if (s.isEmpty()){
                System.out.println("no student dound");
            }
            else{
                for(Student s1:s){
                    s1.displaystddetails();
                }
            } 
    }
}
public class Mainscenario2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Grademanager gm= new Grademanager();
        int choice;
        while(true){
            System.out.println("1.add student");
            System.out.println("2.fins stdudent");
            System.out.println("3.display all student");
            System.out.println("4.exit");
            System.out.println("1.enter choice");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("enter name:");
                String name= sc.nextLine();
                Student s=new Student(name);
                gm.addstudent(s);
            }
             else if(choice==2){
                System.out.println("enter name :");
                String name= sc.nextLine();
                Student found=gm.findstudentbyname(name);
                if(found!=null){
                    System.out.println("founf");
                    System.out.println("enter grade:");
                    double grade= sc.nextDouble();
                    sc.nextLine();
                    found.addgrade(grade);
                    found.displaystddetails();
                }else{
                    System.out.println("not found");
                }
            }
            else if(choice ==3){
                gm.displayallstudents();
            }else if(choice ==4){
                System.out.println("exit");
                break;
            }else{
                System.out.println("error");
            }
        }   
        sc.close();
    }
}