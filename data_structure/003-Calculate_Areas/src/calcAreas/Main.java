package calcAreas;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Square
        double l;
        System.out.println("Type the square side: ");
        l = read.nextDouble();
        Square mySquare = new Square(l);
        System.out.println("Square area: " + mySquare.area);

        //Rectangle
        double b, h;
        System.out.println("Type the rectangle base: ");
        b = read.nextDouble();
        System.out.println("Type the rectangle height: ");
        h = read.nextDouble();
        Rectangle myRectangle = new Rectangle(b, h);
        System.out.println("Rectangle area: " + myRectangle.area);

        //Triangle
        double a, c;
        System.out.println("Type the a: ");
        a = read.nextDouble();
        System.out.println("Type the b: ");
        b = read.nextDouble();
        System.out.println("Type the c: ");
        c = read.nextDouble();
        Triangle myTriangle = new Triangle(a, b, c);
        if(myTriangle.identifyTriangle()){
            System.out.println("True");
        }
        //System.out.println("Triangle area: " + myTriangle.area);
    }
}