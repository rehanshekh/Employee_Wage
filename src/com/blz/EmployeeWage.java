package com.blz;

import java.util.ArrayList;

public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    String companyName;
    int wagePerHour = 20;
    int fullDayHour = 16;
    int partTimeHour = 8;
    int workingDaysPerMonth = 20;
    int workingHoursPerMonth = 100;
    ArrayList<Integer> dailyWageArray = new ArrayList<>();
    int totalWage = 0;


    public EmployeeWage() {

    }

    public EmployeeWage(String companyName, int wagePerHour, int fullDayHour, int workingDaysPerMonth, int workingHoursPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public static void main(String[] args) {
        EmpWage employeeWageBuilder = new EmpWage();
        employeeWageBuilder.createWageBuilder();

        for (EmployeeWage employeeWageObject : EmpWage.arrayList) {
            System.out.println(employeeWageObject);
        }

        int totalEmpWage = employeeWageBuilder.getTotalWage("Infosys");
        System.out.println("Total Wage is :" + totalEmpWage);
    }

    void calculateEmployeeWage() {
        int workingDays = 0;
        int totalWorkingHours = 0;
        while (workingDays < workingDaysPerMonth && totalWorkingHours < workingHoursPerMonth) {
            int empPresent = (int) (Math.floor(Math.random() * 10) % 3); // number b/w 0 and 1
            int empWage = 0;

            if (empPresent == IS_PART_TIME) {
                System.out.println("Part time");
            } else if (empPresent == IS_FULL_TIME) {
                System.out.println("Full time");
            } else if (empPresent == 0) {
                System.out.println("Absent");
            }

            switch (empPresent) {
                case IS_PART_TIME:

                    if (totalWorkingHours + partTimeHour <= workingHoursPerMonth) {
                        empWage = wagePerHour * partTimeHour;
                        totalWorkingHours = totalWorkingHours + partTimeHour;
                    }
                    break;
                case IS_FULL_TIME:

                    if (totalWorkingHours + fullDayHour <= workingHoursPerMonth) {
                        empWage = wagePerHour * fullDayHour;
                        totalWorkingHours = totalWorkingHours + fullDayHour;
                    }
                    break;
                default:
                    empWage = 0;

            }
            dailyWageArray.add(empWage);
            totalWage = totalWage + empWage;
            System.out.println("Total Wage for Day " + (workingDays + 1) + " = " + totalWage);
            workingDays++;
        }
        System.out.println("Total Working Days :" + workingDays);
        System.out.println("Total Working Hours :" + totalWorkingHours);
        System.out.println("Employee Wage :" + totalWage);
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "wagePerHour=" + wagePerHour +
                ", fullDayHour=" + fullDayHour +
                ", partTimeHour=" + partTimeHour +
                ", workingDaysPerMonth=" + workingDaysPerMonth +
                ", workingHoursPerMonth=" + workingHoursPerMonth +
                ", dailyWageArray=" + dailyWageArray +
                ", totalWage=" + totalWage +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
