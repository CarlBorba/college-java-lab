package section9;

import java.util.Scanner;

public class Bank_Account {
    Scanner read = new Scanner(System.in);

    private final int id;
    private String name;
    private double balance;

    //########## Constructors ##########
    public Bank_Account(int id, String name, double initial_deposit){
        this.id = id;
        this.name = name;
        this.balance = initial_deposit;
        print_data();
    }

    // Without initial deposit
    public Bank_Account(int id, String name){
        this.id = id;
        this.name = name;
        print_data();
    }

    //########## Getters & Setters ##########

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    //########## Methods ##########
    public void deposit(){
        System.out.println("Enter a deposit value:");
        double value = read.nextDouble();
        this.balance += value;
        System.out.println("Deposit made: + " + value + "$");
        print_data();
    }

    public void withdrawal(){
        System.out.println("Enter a withdrawal value:");
        double value = read.nextDouble();
        this.balance = this.balance - (value + 5);
        System.out.println("Withdrawal made: - " + value + "$");
        print_data();
    }

    public void print_data(){
        System.out.println("Account " + id + " Holder: " + name + ", Balance: " + balance);
    }
}
