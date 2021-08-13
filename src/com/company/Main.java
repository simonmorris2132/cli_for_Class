package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String userName = userIn.nextLine();
        System.out.println("Hello " + userName + " Welcome to the CLI.\nPlease choose an option to continue:\n1. Say Hello\n2. Reverse a String\n3. Add two numbers\n4. Quit the program");
    }
}
