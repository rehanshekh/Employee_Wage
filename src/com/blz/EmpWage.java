package com.blz;

public class EmpWage {

    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    private final String company;
    private final int empRate;
    private final int numOfDays;
    private final int maxHrs;
    public int totalWage;

    EmpWage(String company, int empRate, int numOfDays, int maxHrs) {
        this.company = company;
        this.empRate = empRate;
        this.numOfDays = numOfDays;
        this.maxHrs = maxHrs;
    }

    public static void main(String[] args) {
        EmpWage emp1 = new EmpWage("RIL", 10, 10, 50);
        emp1.computeEmpWage();
        EmpWage emp2 = new EmpWage("DCW", 15, 25, 160);
        emp2.computeEmpWage();
    }

    public void computeEmpWage() {
        totalWage = 0;
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
        totalWage = totalEmpHrs * empRate;
        System.out.println("Total Emp Wage for Company: " + company + " is " + totalWage);
    }
}

