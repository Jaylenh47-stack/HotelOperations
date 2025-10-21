package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, float payRate, float hoursWorked) {
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

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double getTotalPay(){
            return (getOvertimeHours() * payRate * 1.5) + getRegularHours() * payRate;

    }

    private double punchInTime = 0;
    private LocalDateTime currentTime = LocalDateTime.now();


    public void punchIn(double time){
        this.punchInTime = time;
        //return time;
    }
    public void punchIn(){
//        LocalTime lt = LocalTime.now();
//        int hours = lt.getHour();
//        int minutes = lt.getMinute();
//        double timeAsDouble = hours + (minutes/60);
//
//        this.punchInTime = timeAsDouble;

        LocalTime lt = LocalTime.now();
        this.punchInTime = lt.getHour() + ((double) lt.getMinute() / 60);

    }

    public void punchOut(){
       LocalTime lt = LocalTime.now();

       double punchOutAsDouble = (lt.getHour() + (double) lt.getMinute() / 60);
       this.hoursWorked += (float) (punchOutAsDouble - this.punchInTime);
    }


    public void punchOut(double time){
//        double elapsedTime = time - this.punchInTime;
//        this.hoursWorked += elapsedTime;

      this.hoursWorked += (float) (time - this.punchInTime);
    }

    public void punchTimeCard(double checkInTime, double checkOutTime){
        this.hoursWorked += (float) (checkOutTime - checkInTime);
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
