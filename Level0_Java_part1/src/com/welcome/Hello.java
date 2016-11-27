package com.welcome;
import java.util.Scanner;

class Hello{
    static String name;

    public static void setupName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = in.nextLine();
    }
    public static void welcome() {
        System.out.println("Hello " + name);
    }

    public static void byeBay() {
        System.out.println("Bye " + name);
    }
}
