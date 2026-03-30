import java.util.Scanner;
class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
class Student{
    String name;
    int marks;
    Student(String name, int marks)throws InvalidMarksException{
        this.name=name;
        this.marks=marks;
        if(marks<0 || marks >100){
            throw new InvalidMarksException("invalid marks range");
        }
    }
    String assigngrade(){
        if(marks>=90){
            return "A+";
        }else if(marks>=80){
            return "a";
        }else if(marks>=70){
            return "b";
        }else if(marks>=60){
            return "c";
        }else if(marks>=50){
            return "d";
        }else{
            return "f";
        }
    }
    void display(){
        System.out.println("student :" + name + "marks :" + marks + "grade :" +assigngrade());
    }
}
public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            Student s = new Student(name, marks);
            s.display();

        }catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}