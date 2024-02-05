package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee>list = new ArrayList<>();

        System.out.print("Enter the number of employee:");
        int n = leia.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Employee #"+ i + " data:");
            System.out.print("Outsourced (y/n) ?");
            char ch = leia.next().charAt(0);
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Hours: ");
            int hours = leia.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHour = leia.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double addtional = leia.nextDouble();
               // Employee emp = new OutsourcedEmployee(name, hours,valuePerHour,addtional);
                //list.add(emp);
                list.add(new OutsourcedEmployee(name, hours,valuePerHour,addtional));
            }
            else {
                list.add(new Employee(name,hours,valuePerHour));
            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee emp: list) {
            System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payments()));
        }
    }
}
