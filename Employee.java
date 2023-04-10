package com.wages;
import java.util.Random;
public class Employee {
    private String name;
    private int id;
    private int hoursWorked;
    public Employee(String name,int id,int hoursWorked){
        this.name=name;
         this.id=id;
        this.hoursWorked=hoursWorked;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void markAttendance() {
        Random rand = new Random();
        int attendance = rand.nextInt(2);
        if (attendance == 0) {
            System.out.println(name + "(ID:" + id + ")is absent.");
        } else {
            System.out.println(name + "(ID:" + id + ")is present.");
        }
    }
    public int calculateWage(){
        int wage=hoursWorked*20;
        return wage;
    }

        }


