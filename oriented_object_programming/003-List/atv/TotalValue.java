package atv;

import java.util.Scanner;

public class TotalValue {
    double ipi;
    double cod1, unitValue1, qtd1;
    double cod2, unitValue2, qtd2;
    double originalValue, readjustmentValue;

    Scanner read = new Scanner(System.in);

    public TotalValue(){
        this.read();
    }

    public void read(){
        // PIECE 1
        System.out.println("Type the IPI:");
        this.ipi = read.nextDouble();

        System.out.println("Type piece 1 code:");
        this.cod1 = read.nextDouble();

        System.out.println("Type piece 1 unit value:");
        this.unitValue1 = read.nextDouble();

        System.out.println("Type piece 1 quantity:");
        this.qtd1 = read.nextDouble();

        // PIECE 2
        System.out.println("Type piece 2 code:");
        this.cod2 = read.nextDouble();

        System.out.println("Type piece 2 unit value:");
        this.unitValue2 = read.nextDouble();

        System.out.println("Type piece 2 quantity:");
        this.qtd2 = read.nextDouble();

        this.totalValue();

    }

    public void totalValue(){
        this.originalValue = (this.unitValue1 * this.qtd1) + (this.unitValue2 * this.qtd2);
        System.out.println("Original value = " + this.originalValue);
        this.readjustmentValue = (this.originalValue * (this.ipi / 100 + 1));
        System.out.println("Total value = " + this.readjustmentValue);
    }
}
