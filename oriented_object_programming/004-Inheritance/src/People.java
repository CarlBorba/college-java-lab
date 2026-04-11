package basicPOO;

import java.util.Scanner;

// This is the Parent class
public class People {
    String name;
    int age;
    String gender;

    public People(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Register method
    public void create_people(){
        Scanner read = new Scanner(System.in);

        System.out.println("Type the name:");
        this.name = read.nextLine();

        System.out.println("Type the age:");
        this.age = read.nextInt();
        read.nextLine(); // CLEAR THE BUFFER after nextInt()

        System.out.println("Type the gender:");
        this.gender = read.nextLine();
    }
}
