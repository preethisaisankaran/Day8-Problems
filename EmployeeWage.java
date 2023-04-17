package com.wages;


import java.util.Random;
import java.util.Scanner;
public class EmployeeWage {
//    public static final int IS_PART_TIME=1;
//    public static final int IS_FULL_TIME=2;
//    public final int EMP_RATE_PER_HOUR=20;
//    public static final int NUM_OF_WORKING_DAYS=2;
//    public static final int MAX_HRS_IN_MONTH=10;
   public static int computeWage(){
//        int empHRS=0,totalEmpHrs=0,totalWorkingDays=0;
//
//        while(totalEmpHrs<= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
//            totalWorkingDays++;
//            int empCheck=(int) Math.floor(Math.random()*10)%3;
//            switch (empCheck){
//                case IS_PART_TIME :
//                    empHrs=4;
//                    break;
//
//                case IS_FULL_TIME:
//                    empHrs=8;
//                    break;
//                default:
//                    empHrs=0;
//            }
//            totalEmpHrs +=empHRS;
//            System.out.println("Day#:"+totalWorkingDays+Emp Hr:+empHrs);
//        }
//        int total EmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
//        System.out.println("Total Emp Wage :"+totalEmpWage);
//        return totalEmpWage;
    }
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
        int totalWage=0;

        for(int i=0;i< 20;i++){
         int wage1=0;

        int number = (int)((Math.random()*10)%3+1);
        switch(number){
            case  1:
                System.out.println("Calculate full time employee");
                Employee emp3=new Employee("Preethi",101,8);
                emp1.markAttendance();
                 wage1=emp1.calculateWage();
                break;

            case 2:
                System.out.println("Calculate part time employee wage");
                PartTimeEmployee emp4=new PartTimeEmployee(102, "oviya",4);
                 wage1=emp2.calculateWage();
                System.out.println("wage for part time employee"+wage2);
                break;
            case 3:
                System.out.println("Employee Absent");
                break;


        }
        totalWage+=wage1;
        }
        System.out.println("Total wages:" +totalWage);








    }
}
