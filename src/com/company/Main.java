package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String userName = userIn.nextLine();
        System.out.println("Hello " + userName);
    }
}
