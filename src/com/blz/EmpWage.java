package com.blz;

public class EmpWage {

    public static void main(String[] args) {
        int IS_PRESENT = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int empHrs;
        int empwage;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == IS_PRESENT)
            empHrs = 8;
        else if (empcheck == IS_PART_TIME)
            empHrs = 4;
        else
            empHrs = 0;
        empwage = empHrs * WAGE_PER_HOUR;
        System.out.println("Employee Wage:" + empwage);

    }

}

