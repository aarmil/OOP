package employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Michael", "Head of Department", 33400);
        System.out.println(employee.info(12));
    }
}
