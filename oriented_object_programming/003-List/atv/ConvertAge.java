package atv;

import java.util.Scanner;

public class ConvertAge {
    int year, month, day;
    int days_age;

    Scanner read = new Scanner(System.in);

    public ConvertAge(){
        this.read();
    }

    public void read(){
        System.out.println("Type your age in years:");
        this.year = read.nextInt();

        System.out.println("Type your age in months:");
        this.month = read.nextInt();

        System.out.println("Type your age in days:");
        this.day = read.nextInt();

        this.days_age = age_convert();

        System.out.println("Your age in days: " + this.days_age);
    }

    public int age_convert(){
        this.days_age = (this.year*365) + (this.month*30) + this.day;
        return this.days_age;
    }
}
