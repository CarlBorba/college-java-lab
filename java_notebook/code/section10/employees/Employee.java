package section10.employees;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Salary: R$" + String.format("%.2f", salary);
    }
}