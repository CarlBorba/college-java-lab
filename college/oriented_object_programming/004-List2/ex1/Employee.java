package oriented_object_programming.lista2_poo.ex1;

import java.util.Scanner;

public class Employee {
    Scanner read = new Scanner(System.in);

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void addRaise(double percentage){
        this.salary = ((percentage / 100) + 1) * this.salary;
    }

    public void anualSalary(){
        System.out.printf("%nThe %s annual salary is: %.2f", this.name, this.salary * 12);
    }

    public void showData(){
        System.out.printf("Employee %s salary: %.2f", this.name, this.salary);
    }
}
