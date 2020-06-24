public class Employee {
    String name;
    String position;
    double wage;

    public Employee(String name, String position, double wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
    }

    String info(int i) {
        return ("Employee - " + name + ".\nPosition - " + position + ".\nWage - " + wage +
                ".\nWage for the last " + i + " months - " + wage * i + ".");
    }
}
