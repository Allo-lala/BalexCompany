/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.coursework.oopcoursework;

/**
 *
 * @author kyagulanyi 
 */
public class balexCompany {

    private static final double MINIMUM_WAGE = 8.00;
    private static final double OVERTIME_RATE = 1.5;
    private static final int REGULAR_HOURS = 40;
    private static final int MAX_HOURS = 60;

    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Base pay must be at least $8.00 per hour.");
            return;
        }
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Hours worked cannot exceed 60 hours per week.");
            return;
        }

        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = basePay * hoursWorked;
        } else {
            double regularPay = basePay * REGULAR_HOURS;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            double overtimePay = basePay * OVERTIME_RATE * overtimeHours;
            totalPay = regularPay + overtimePay;
        }

        System.out.printf("Total pay: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        double[] basePays = {7.50, 8.20, 10.00};
        int[] hoursWorked = {35, 47, 73};

        for (int i = 0; i < basePays.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            calculatePay(basePays[i], hoursWorked[i]);
        }
    }
}
