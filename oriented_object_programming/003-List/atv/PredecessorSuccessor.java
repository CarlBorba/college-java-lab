package atv;

import java.util.*;

public class PredecessorSuccessor {
    Scanner read = new Scanner(System.in);

    int number;

    public PredecessorSuccessor(){
        this.calc();
    }

    public void calc(){
        System.out.println("Type the number: ");
        this.number = read.nextInt();

        System.out.println("The Predecessor is = " + (this.number - 1));
        System.out.println("The Successor is = " + (this.number + 1));
    }
}
