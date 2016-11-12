package com.company;

public class Ch42 {

    public static void zool(int number, String pet, String street) {

        System.out.println("Number: " + number);
        System.out.println("Name of pet: " + pet);
        System.out.println("Name of street: " + street);
    }

    public static void main(String[] args) {

        int number = 11;
        String pet = "Uba";
        String street = "Kivila";
        zool(number, pet, street);
    }
}