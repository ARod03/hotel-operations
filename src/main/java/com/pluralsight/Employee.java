package com.pluralsight;

import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int punchIn;
    private int punchOut;
    private int punchTimeCard;


    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getPunchIn() {
        return punchIn;
    }

    public int getPunchOut() {
        return punchOut;
    }

    public double getPayRate() {
        return payRate;

    }

    public double getTotalPay(){
        double regularPay = this.payRate * getRegularHours();
        double overTimePay = this.payRate * this.getOvertimeHours() * 1.5;

        return regularPay + overTimePay;
    }

    public int getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        }
        return 40;
    }

    public int getOvertimeHours(){
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;
    }

    public void punchIn(int time) {
        this.punchIn = time;
    }

    public void punchOut(int time) {
        this.hoursWorked = this.hoursWorked + time - this.punchIn;
    }

    public void punchTimeCard(int startTime, int endTime) {
        this.punchIn(startTime);
        this.punchOut(endTime);

        }
    public void punchIn() {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        this.punchIn(currentHour);
    }
    public void punchOut() {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        this.punchOut(currentHour);
    }

    }
