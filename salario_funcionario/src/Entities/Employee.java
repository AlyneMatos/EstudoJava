package Entities;

public class Employee {
    public static String name;
    public static double GrossSalary;

    public  static double Tax;
     public static double NetSalary(){

         return GrossSalary - Tax;
     }
    public static double increaseSalary(double percentage){

         return GrossSalary += GrossSalary*percentage/100;
    }
}
