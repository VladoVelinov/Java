package ObjectOrientedProgramming;

import java.util.Scanner;

public class TheNameGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = console.nextLine();

        int indexOfSpace = name.indexOf(" ");
        String firstName = name.substring(0, indexOfSpace);
        String lastName = name.substring(indexOfSpace + 1);
        singSong(firstName);
        singSong(lastName);
    }

    private static void singSong(String name) {
        String suffix = name.substring(1);
        System.out.println(name + " " + name + ", bo-B" + suffix);
        System.out.println("Banana-fana fo-F" + suffix);
        System.out.println("Fee-fi-mo-M" + suffix);
        System.out.println(name.toUpperCase() + "!");
    }
}