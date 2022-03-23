package com.blz;

public class EmpWage {

    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
