package section10.rooms;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner read = new Scanner(System.in);

        System.out.println("How many rooms will be rented?");
        int n = read.nextInt();
        read.nextLine();

        // Creating the room vector
        Room[] hotel = new Room[10];

        // Register rooms
        for(int i = 0; i < n; i++){
            System.out.println("Rent " + (i+1) + "°:");

            System.out.print("Name: ");
            String name = read.nextLine();

            System.out.print("Email: ");
            String email = read.nextLine();

            System.out.print("Room(0-9)");
            int room = read.nextInt();
            read.nextLine();

            Guest tempGuest = new Guest(name, email);
            hotel[room] = new Room(tempGuest);
        }

        // Print the rooms
        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++){
            if(hotel[i] != null){
                System.out.printf("%d: %s, %s\n",i, hotel[i].getGuest().getName(), hotel[i].getGuest().getEmail());
            }
        }
    }
}
