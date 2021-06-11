package hrapp;

public class HRApp {

    public static void main(String[] args){
        System.out.println("HRApp is starting");

        Employee e1 = new Employee(230, "Gheorghe", 55555);
        Employee e2 = new Employee(460, "Gojira", 666);

        System.out.println("Emp" + e1);
        System.out.println("Emp" + e2);

        Department dept = new Department("Testing");

        dept.addEmp(e1);
        dept.addEmp(e2);

        Employee[] emps = dept.getEmployees();
        for(Employee emp : emps){
            System.out.println("Emp " + emp);
        }
        System.out.println("Total " + dept.getTotalSalary());
        System.out.println("Average " + dept.getAverageSalary());

        System.out.println("Employee" + dept.getEmployeeById(460));
    }
}
