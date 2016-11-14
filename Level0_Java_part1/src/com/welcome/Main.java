package com.welcome;
import java.util.Scanner;
import com.me.Main;

class Hello{
    static String name;

    public static void main(String[] args) {
        setupName();
        welcome();
        Main.main();
        byeBay();

    }

    private static void setupName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = in.nextLine();
    }
    private static void welcome() {
        System.out.println("Hello " + name);
    }

    private static void byeBay() {
        System.out.println("Bye " + name);
    }
}
