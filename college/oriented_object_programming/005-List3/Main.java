package oriented_object_programming.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Creating the list
        List<Integer> numbers = new ArrayList<>();

        // Reading the number
        System.out.println("REGISTER NUMBERS");
        for (int i = 0; i < 10; i++){
            System.out.println("Type the number to position: " + i);
            int n = read.nextInt();
            numbers.add(n);
        }

        // ##### 1
        // a)
        numbers.add(2, 1000);

        // b)
        System.out.println("Type the index that you want:");
        int x = read.nextInt();
        System.out.println("Here is the number: " + numbers.get(x));

        // c)
        numbers.remove(4);

        // d)
        System.out.println("Type the number to be added in the second position:");
        x = read.nextInt();
        numbers.set(2, x);

        // e)
        System.out.println("What number do you want?");
        x = read.nextInt();
        System.out.println("The number " + x + " is in the position: " + numbers.indexOf(x));

        // f)
        Collections.sort(numbers);
        System.out.println("Increase list: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Decrease list: " + numbers);

        // g)
        List<Integer> newList = new ArrayList<>(numbers);

        // h)
        newList.clear();

        // i)
        String empty = newList.isEmpty() ? "Is empty" : "Is not empty";
        System.out.println(empty);

        System.out.println("##### TEST #####");
        System.out.println(numbers);

        // ##### 2
        int[] intVector = new int[11];

        // Pick the number from the other
        for (int i = 0; i < 10; i++) {
            intVector[i] = numbers.get(i);
        }

        // a)
        for (int i = intVector.length - 1; i > 2; i--) {
            intVector[i] = intVector[i - 1];
        }
        intVector[2] = 1000;

        // b)
        System.out.println("Type the index that you want:");
        x = read.nextInt();
        System.out.println("Here is the number: " + intVector[x]);

        // c)
        for (int i = 4; i < intVector.length - 1; i++) {
            intVector[i] = intVector[i + 1];
        }
        intVector[intVector.length - 1] = 0; // Empty the last spot

        // d)
        System.out.println("Type the number for position 2:");
        x = read.nextInt();
        intVector[2] = x;

        // e)
        System.out.println("What number do you want?");
        int target = read.nextInt();
        int foundIdx = -1;
        for (int i = 0; i < intVector.length; i++) {
            if (intVector[i] == target) {
                foundIdx = i;
                break;
            }
        }
        System.out.println("The number " + target + " is in position: " + foundIdx);

        // f)
        java.util.Arrays.sort(intVector);
        System.out.println("Increase array: " + java.util.Arrays.toString(intVector));

        for (int i = 0; i < intVector.length / 2; i++) {
            int temp = intVector[i];
            intVector[i] = intVector[intVector.length - 1 - i];
            intVector[intVector.length - 1 - i] = temp;
        }
        System.out.println("Decrease array: " + java.util.Arrays.toString(intVector));

        // g)
        int[] newVector = intVector.clone();

        // h)
        java.util.Arrays.fill(newVector, 0);

        // i)
        boolean isEmpty = true;
        for (int val : newVector) {
            if (val != 0) {
                isEmpty = false;
                break;
            }
        }
        System.out.println(isEmpty ? "Is empty" : "Is not empty");

    }
}
