package oriented_object_programming.lista2_poo.ex1;

public class Main {
    static void main(String[] args) {
        System.out.println("##### EMPLOYEE #####");
        // Employee
        Employee carl = new Employee("Carlos", 1200);
        carl.showData(); // Old salary
        carl.addRaise(10);
        System.out.println("\nAfter raise:");
        carl.showData(); // New salary
        // Show anual salary
        carl.anualSalary();

        System.out.println("\n\n##### ASSISTANT #####");

        // Assistant
        Assistant gabe = new Assistant("Gabe", 1100, 202601);
        gabe.showData(); // Old salary
        gabe.addRaise(10);
        System.out.println("\nAfter raise:");
        gabe.showData(); // New salary
        // Show anual salary
        gabe.anualSalary();

        System.out.println("\n\n##### ASSISTANT TEC#####");

        // Assistant Tec
        TecAssistant vitin = new TecAssistant("Vitin", 1100, 202602, 5);
        vitin.showData(); // Old salary
        vitin.addRaise(10);
        System.out.println("\nAfter raise:");
        vitin.showData(); // New salary
        // Show anual salary
        vitin.anualSalary();

        System.out.println("\n\n##### ASSISTANT ADM#####");

        // Assistant Adm
        AdmAssistant fidel = new AdmAssistant("Fidel", 1100, 202602, "night", 25);
        fidel.showData(); // Old salary
        fidel.addRaise(10);
        System.out.println("\nAfter raise:");
        fidel.showData(); // New salary
        // Show anual salary
        fidel.anualSalary();
    }
}
