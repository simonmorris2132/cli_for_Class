package com.company;

import java.util.Scanner;

public class Main {

   public static Scanner userIn = new Scanner(System.in);

    public static void main(String[] args) {
       Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String userName = userIn.nextLine();
        System.out.println("Hello " + userName + " Welcome to the CLI.");

        System.out.println("Please choose an option to continue:\n1. Say Hello\n2. Reverse a String\n3. Add two numbers\n4. Quit the program");

        byte input = userIn.nextByte();

        switch (input) {
            case 1:
                Option1.getName();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.printf("WRONG SELECTION, LOSER");
        }

    }
}
