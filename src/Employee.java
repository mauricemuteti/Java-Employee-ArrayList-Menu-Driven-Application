/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://mauricemuteti.info/java-employee-arraylist-menu-driven-application/(opens in a new tab)
 * Java Employee ArrayList Menu Driven Application
 */


/**
 *
 * @author HP
 */
public class Employee {

    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", salary=" + salary
                + ", department='" + department + '\''
                + '}';
    }
}
