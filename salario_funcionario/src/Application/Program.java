package Application;

import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //private static Employee Employee;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Employee Employee = new Employee();

        System.out.println("Name: ");
        Entities.Employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        Entities.Employee.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        Employee.Tax = sc.nextDouble();

        System.out.println("Employee: " + Employee.name + ", $"+ Employee.NetSalary() );
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double porcentage = sc.nextDouble();
        Employee.increaseSalary(porcentage);
        System.out.println("Update: "+ Employee.name+" , $"+ Employee.increaseSalary(porcentage));

    }
}