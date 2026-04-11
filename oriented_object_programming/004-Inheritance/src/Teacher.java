package basicPOO;

import java.util.Scanner;

// Using extends to set this class as a child class
public class Teacher extends People{
    String subject;
    double salary;

    public Teacher() {
        // Inherits the assignment from the parent class.
        super("", 0, "");
        this.create_teacher();
    }

    // Register method that inherit from People
    public void create_teacher(){
        super.create_people();

        Scanner read = new Scanner(System.in);

        System.out.println("Type the subject:");
        this.subject = read.nextLine();

        System.out.println("Type the salary:");
        this.salary = read.nextInt();
        read.nextLine(); // CLEAR THE BUFFER after nextInt()
    }
}
