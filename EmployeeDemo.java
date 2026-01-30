class Employee {
    int empId;
    String empName;

    static String companyName = "TCS";
    void showEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Company: " + companyName);
    }

    static void showCompany() {
        System.out.println("Company Name: " + companyName);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.empId = 101;
        e1.empName = "Shreya";

        Employee e2 = new Employee();
        e2.empId = 102;
        e2.empName = "Amit";

        e1.showEmployee();
        e2.showEmployee();

        Employee.showCompany();
    }
}

