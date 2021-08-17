package com.company;

public class Option1 {

    public static void getName() {
        System.out.println("Enter a name!");
        String name = Main.userIn.nextLine();

        System.out.println("Hello " + name);
    }

}
