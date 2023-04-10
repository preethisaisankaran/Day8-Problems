package com.wages;
import java.util.Random;
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


    }
}
