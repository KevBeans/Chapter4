package com.company;

public class Ch41 {

    //method ping(); adds "."
    //method baffle(); adds "wug", followed by "."
    //method zoop(); compounds ping and baffle, adds "You wugga" in between
    //method main(); puts it all together

    /*
    Stack diagram
     ______________________________________________________
    |ping   | "."                                          |
    |baffle | "wug" / "."                                  |
    |zoop   | "You wugga " / "wug" / "."                   |
    |main   | "No, I " / "I " / "You wugga " / "wug" / "." |
     ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
    */

    //Invoking baffle(); at the end of ping(); gives a stack overflow error


    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}