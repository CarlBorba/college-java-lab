package atv;


import java.util.*;

public class BalanceAdjustment {
    Scanner read = new Scanner(System.in);

    double balance, adjustedBalance;

    public BalanceAdjustment(){
        this.adjustment();
    }

    public void adjustment(){
        System.out.println("Type the balance: ");
        this.balance = read.nextDouble();

        this.adjustedBalance = this.balance * 1.01;

        System.out.println("Balance 1% adjustment = " + this.adjustedBalance);
    }
}
