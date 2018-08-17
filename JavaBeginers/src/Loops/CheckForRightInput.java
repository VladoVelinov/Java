package Loops;

import java.util.Scanner;

/*
Задача 1:
Да се напише програма, която чака да прочете съобщението "Hello, java program".
Докато не прочете съобщението,програмата изписва "Invalid input!".
След като прочете съобщението програмата изписва "Hello, programmer!" и прекратява изпълнението си.
Made by Vladislav Velinov.
*/
public class CheckForRightInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String input = sc.nextLine();

        while (!input.equals("Hello, java program")) {
            System.out.println("Invalid input!");
            input = sc.nextLine();
        }
        System.out.println("Hello, programmer!");
    }
}