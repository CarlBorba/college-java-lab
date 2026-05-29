package ticketExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicketManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array
        Ticket[] ticketArray = new Ticket[5];

        // Adding tickets in array
        for (int i = 0; i < 3; i++){
            System.out.println("Type the ticket id:");
            int id = sc.nextInt();
            sc.nextLine(); //buffer

            System.out.println("Type the event name:");
            String name = sc.nextLine();

            System.out.println("Type the event price:");
            double price = sc.nextDouble();

            Ticket ticket = new Ticket(id, name, price);
            ticketArray[i] = ticket;
        }

        // ArrayList
        List<Ticket> ticketList = new ArrayList<>();

        // Add all, using asList function from the Arrays
        ticketList.addAll(Arrays.asList(ticketArray));

        // Printing all the tickets list
        System.out.println("===== TICKETS ======");

        double totalPrice = 0;
        for (Ticket i : ticketList) {
            if (i != null){
                System.out.println(i);

                totalPrice += i.getPrice();
            }
        }
        System.out.println("Total price: " + totalPrice);


        // ##### SEATs #####
        boolean[][] seats = {
                {true, false, true, true},
                {true, true, true, true},
                {true, true, true, true}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (!seats[i][j]){
                    System.out.println("[" + i + "][" + j + "] is occupied");
                }
            }
        }
    }
}
