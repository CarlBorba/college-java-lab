package atv;

import java.util.*;

public class SalaryQuantity {
    Scanner read = new Scanner(System.in);

    double minSalary, userSalary, qtdMinSalaries;

    public SalaryQuantity(){
        this.calcQuantity();
    }

    public void calcQuantity(){
        System.out.println("Type the minimum salary: ");
        this.minSalary = read.nextDouble();

        System.out.println("Type the minimum salary: ");
        this.userSalary = read.nextDouble();

        this.qtdMinSalaries = (double) this.userSalary / this.minSalary;
        System.out.println("Quantity of minimum salaries = " + qtdMinSalaries);
    }
}
