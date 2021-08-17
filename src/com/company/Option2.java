package com.company;

public class Option2 {

    public static void reverseString() {

        System.out.println("What string would you like to reverse?");
        String yourOption = Main.userIn.nextLine();
        String newOption = "";


        for (int i = yourOption.length() - 1; i >= 0; i--) {
            newOption += yourOption.charAt(i);
        }
        System.out.println(newOption);
    }
}

