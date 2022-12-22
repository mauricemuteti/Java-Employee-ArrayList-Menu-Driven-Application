/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://mauricemuteti.info/java-employee-arraylist-menu-driven-application/(opens in a new tab)
 * Java Employee ArrayList Menu Driven Application
 */


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaEmployeeArrayListMenuDrivenApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("quit")) {
            System.out.println("Enter the name of the employee:");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Enter the salary of the employee:");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // consume the remaining newline character

            System.out.println("Enter the department of the employee:");
            String department = scanner.nextLine();

            employees.add(new Employee(name, salary, department));

            if (employees.size() == 5) {
                break;
            }
        }

        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
