package com.company;

public class Ch43 {

    public static void printAmerican(String day, String date, String month, int year) {

        System.out.println(day + ", " + month + " " + date + ", " + year + ".");
    }

    public static void printEuropean(String day, String date, String month, int year) {

        System.out.println(day + " " + date + " " + month + " " + year + ".");
    }

    public static void main(String[] args) {

        String day = "Friday";
        String date = "13";
        String month = "June";
        int year = 1993;

        System.out.println("American format:");
        printAmerican(day, date, month, year);
        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }
}