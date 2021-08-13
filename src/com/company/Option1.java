package com.company;

public class Option1 {

    public static void getName() {
        System.out.println("Choose one option: What is your name?");
        String name = Main.userIn.nextLine();

        System.out.println("Hello " + name);
    }

}
