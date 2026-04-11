package oriented_object_programming.lista2_poo.ex1;

import java.util.Scanner;

public class Assistant extends Employee{
    Scanner read = new Scanner(System.in);
    int registration;

    public Assistant(String name, double salary, int registration) {
        super(name, salary);
        this.registration = registration;
    }

    public void showData(){
        System.out.printf("Assistant %s salary: %.2f", this.name, this.salary);
    }
}
