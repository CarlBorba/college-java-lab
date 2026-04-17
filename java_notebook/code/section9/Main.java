package section9;

import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Type the id:");
        int id = read.nextInt();
        read.nextLine();

        System.out.println("Type your name:");
        String name = read.nextLine();

        System.out.println("What to do a initial deposit?(y/n)");
        String input = read.next();

        if (input.equalsIgnoreCase("y")) {
            System.out.println("Type your initial deposit");
            double initial_deposit = read.nextDouble();
            Bank_Account new_account = new Bank_Account(id, name, initial_deposit);
        } else if (input.equalsIgnoreCase("n")) {
            Bank_Account new_account = new Bank_Account(id, name);
        }
    }
}
