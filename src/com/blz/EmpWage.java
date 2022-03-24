package com.blz;

public class EmpWage {

    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        computeEmpWage("RIL",10,10,50);
    }

    public static int computeEmpWage(String name, int empRatePerHr, int numOfDays, int maxHrs) {
        int totalWage;
        int totalEmpHrs = 0;
        int totalDays = 0;
        while (totalEmpHrs <= maxHrs && totalDays < numOfDays) {
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
        totalWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage for Company: "+name+" is " + totalWage);
        return totalWage;
    }
}

