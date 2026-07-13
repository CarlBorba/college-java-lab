package basicPOO;

import java.util.*;

// Using extends to set this class as a child class
public class Student extends People{
    int registration;
    int year;
    String course;

    // Constructor
    public Student() {
        // Inherits the assignment from the parent class.
        super("", 0, "");
        this.create_student();
    }

    // Register method that inherit from People
    public void  create_student(){
        super.create_people();

        Scanner read = new Scanner(System.in);

        System.out.println("Type the registration:");
        this.registration = read.nextInt();

        System.out.println("Type the year:");
        this.year = read.nextInt();
        read.nextLine(); // CLEAR THE BUFFER after nextInt()

        System.out.println("Type the course:");
        this.course = read.nextLine();
    }
}
