package section10.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        // Register
        System.out.println("How many employees will be registered:");
        int n = read.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Id: ");
            int id = read.nextInt();
            read.nextLine();
            System.out.println("Name: ");
            String name = read.nextLine();
            System.out.println("Salary: ");
            double salary = read.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        // Print
        System.out.println("\nRegistered Employees:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Increase
        System.out.println("\nWho will receive the increase (id):");
        int id = read.nextInt();

        Employee emp = employeeList.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if (emp != null) {
            System.out.println("How many percent: ");
            double increase = read.nextDouble();
            emp.increaseSalary(increase);
            System.out.println("New salary updated.");
        } else {
            System.out.println("Employee ID not found.");
        }

        // Print
        System.out.println("\nUpdated Employee List:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }

        read.close();
    }
}