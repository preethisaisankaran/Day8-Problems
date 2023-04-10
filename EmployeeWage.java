package com.wages;
import com.addressbook.ContactPerson;

import java.util.Random;
import java.util.Scanner;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation");
        Employee emp1=new Employee("Preethi",101,8);
        emp1.markAttendance();
        int wage=emp1.calculateWage();
        System.out.println("earned Rs"+wage);
        PartTimeEmployee emp2=new PartTimeEmployee(102, "oviya",4);
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
        System.out.println(emp2.getHoursWorked());

        int wage2=emp2.calculateWage();
        System.out.println("wage for part time employee"+wage2);


        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the option");
        n=obj.nextInt();
        switch(n){
            case 1 :
                System.out.println("Calculate full time employee");
                Employee emp3=new Employee("Preethi",101,8);
                emp1.markAttendance();
                int wage1=emp1.calculateWage();
                break;

            case 2:
                System.out.println("Calculate part time employee wage");
                PartTimeEmployee emp4=new PartTimeEmployee(102, "oviya",4);
                int wage4=emp2.calculateWage();
                System.out.println("wage for part time employee"+wage2);
                break;
            case 3:
                System.out.println("Case default");
                break;


        }







    }
}
