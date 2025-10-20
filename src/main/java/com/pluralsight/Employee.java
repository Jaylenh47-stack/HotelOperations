package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, float payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public int getOvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double getTotalPay(){
            return (getOvertimeHours() * payRate * 1.5) + getRegularHours() * payRate;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", totalPay=" + getTotalPay() +
                ", getRegularHours=" + getRegularHours() +
                " getOvertimeHours=" + getOvertimeHours() +
                "}";

    }
}
