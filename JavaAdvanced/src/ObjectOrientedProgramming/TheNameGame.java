/*
Exercise 1.3:
Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following
format is printed about their first, then last, name. Use a method to avoid redundancy.

What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!

Made by Vladislav Velinov.
*/
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