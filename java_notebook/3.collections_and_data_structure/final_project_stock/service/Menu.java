package service;

import model.Product;
import repository.CatalogRepository;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static void mainMenu(){

        int op = 10;
        while (op != 0){
            System.out.println("\n\n");
            System.out.println("==================== MENU ====================");
            System.out.println("1 - Register product");
            System.out.println("2 - Search a product");
            System.out.println("0 - Exit");
            System.out.print("Choose your option: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    registerMenu();
                    return;
                case 2:
                    searchProductMenu();
                    return;
            }
        }
    }

    private static void registerMenu() {
        String id, name;
        int quantity;

        System.out.println("\n\n");
        System.out.println("==================== REGISTER ====================");
        System.out.println("What is the product's id:");
        id = sc.nextLine();
        System.out.println("What is the product's name:");
        name = sc.nextLine();
        System.out.println("What is the quantity of the product:");
        quantity = sc.nextInt();

        Product product = new Product(id, name, quantity);
        CatalogService.registerProduct(product);
    }

    private static void searchProductMenu() {
    }
}
