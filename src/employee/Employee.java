package employee;

public class Employee {
    private String name;
    private String position;
    private double wage;

    public Employee(String name, String position, double wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
    }

    public String info(int i) {
        return ("Employee - " + name + ".\nPosition - " + position + ".\nWage - " + wage +
                ".\nWage for the last " + i + " months - " + wage * i + ".");
    }
}
