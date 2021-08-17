package com.company;

import java.util.Scanner;

public class Option2 {

    public static void reverseString() {

        System.out.println("What string would you like to reverse?");
        String yourOption = Main.userIn.nextLine();
        String newOption = "";
        System.out.println(yourOption);


        for (int i = yourOption.length() - 1; i >= 0; i--) {
            System.out.println(yourOption.charAt(i));
            newOption = String.valueOf(yourOption.charAt(i));
        }

    }
}

//    public static void main(String[] args) {
//        reverseString();
//        }
//}
