package com.blz;

public class EmpWage {

    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int NUM_OF_DAYS = 2;

    public static void main(String[] args) {
        int totalWage = 0;
        int salary = 0;
        for (int day = 0; day < NUM_OF_DAYS; day++) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            int empHrs = switch (random) {
                case IS_PART_TIME -> 4;
                case IS_PRESENT -> 8;
                default -> 0;
            };
            salary = (empHrs * WAGE_PER_HOUR);
            totalWage = totalWage + salary;

        }
        System.out.println("Salary is:" + salary);
    }
}
