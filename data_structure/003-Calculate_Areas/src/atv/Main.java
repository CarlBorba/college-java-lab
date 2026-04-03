import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public static void main(String[] args) {
    int a, b, c, d;
    Scanner read = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();

    System.out.println("Type the value of a: ");
    a = read.nextInt();
    list.add(a);

    System.out.println("Type the value of b: ");
    b = read.nextInt();
    list.add(b);

    System.out.println("Type the value of c: ");
    c = read.nextInt();
    list.add(c);

    System.out.println("Type the value of d: ");
    d = read.nextInt();
    list.add(d);

    //Biggest
    System.out.println("The biggest number is: " + Collections.max(list));
    //Smallest
    System.out.println("The smallest number is: " + Collections.min(list));

    //Sum
    System.out.println("The sum of the numbers is: " + list.stream().mapToInt(Integer::intValue).sum());
    //Media
    System.out.println("The media of the numbers is: " + list.stream().mapToInt(Integer::intValue).average().orElse(0));

}
