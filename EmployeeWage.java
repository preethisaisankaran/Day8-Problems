package com.wages;
import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation");
        Employee emp1=new Employee("Preethi",1001,8);
        emp1.markAttendance();
        int wage=emp1.calculateWage();
        System.out.println("earned Rs"+wage+"today.");
    }
}
