package com.blz;

public class EmpWage {

    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int NUM_OF_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 150;

    public static void main(String[] args) {
        int totalWage = 0;
        int salary = 0;
        int totalEmpHrs = 0;
        int totalDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalDays < NUM_OF_DAYS) {
            totalDays++;
            int random = (int) Math.floor(Math.random() * 10) % 3;
            int empHrs = switch (random) {
                case IS_PART_TIME -> 4;
                case IS_PRESENT -> 8;
                default -> 0;
            };
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day#: " + totalDays + " Emp Hr: " + empHrs);
        }
        totalWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalWage);
    }
}
