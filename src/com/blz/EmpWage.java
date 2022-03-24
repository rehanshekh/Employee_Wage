package com.blz;

import java.util.ArrayList;

public class EmpWage implements EmpWageBuilder {


    static ArrayList<EmployeeWage> arrayList = new ArrayList<>();

    @Override
    public void createWageBuilder() {
        EmployeeWage employeeWage1 = new EmployeeWage("InfoSys",20,16,8,100);
        employeeWage1.calculateEmployeeWage();


        EmployeeWage employeeWage2 = new EmployeeWage("HCL",10,5,22,90);
        employeeWage2.calculateEmployeeWage();
        arrayList.add(employeeWage1);
        arrayList.add(employeeWage2);
    }

    @Override
    public int getTotalWage(String companyName) {
        int totalWage = 0;
        for (EmployeeWage employeeWageObject : EmpWage.arrayList) {
            if(companyName.equals(employeeWageObject.companyName)){
                totalWage = employeeWageObject.totalWage;
            }
        }
        return totalWage;
    }
}