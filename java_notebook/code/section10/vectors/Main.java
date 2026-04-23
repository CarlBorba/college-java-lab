package section10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("How many people will be registered?");
        int n = read.nextInt();

        People[] peopleVector = new People[n];

        for(int i = 0; i < peopleVector.length; i++){
            System.out.print("Type the " + (i+1) + "° person height: ");
            double height = read.nextDouble();
            read.nextLine();

            System.out.print("Type the " + (i+1) + "° person gender(M/F): ");
            String gender = read.nextLine();

            peopleVector[i] = new People(height, gender);
        }

        double lowestHeight = peopleVector[0].getHeight();

        // The Lowest Height
        for(int i = 1; i < peopleVector.length; i++){
            if(peopleVector[i].getHeight() < lowestHeight){
                lowestHeight = peopleVector[i].getHeight();
            }
        }

        double biggestHeight = peopleVector[0].getHeight();

        // The bigger Height
        for(int i = 1; i < peopleVector.length; i++){
            if(peopleVector[i].getHeight() > biggestHeight){
                biggestHeight = peopleVector[i].getHeight();
            }
        }

        System.out.println("Final lowest: " + lowestHeight);
        System.out.println("Final biggest: " + biggestHeight);

        int x = 0;
        System.out.println("Altura da posição " + x + " = " + peopleVector[x].getHeight() + " gender = " + peopleVector[x].getGender());
    }
}
