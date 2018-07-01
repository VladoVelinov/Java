package Loops;

import java.util.Scanner;

/*
Задача 2
Да се напише програма, която чака да прочете число, което е валидна оценка от училище.
Докато не прочете такава, програмата изписва съответно съобщение за грешка. Ако числото,
което е въвел потребителят, е под 2 да изведе "Invalid input. The number is less than 2."
Ако потребителят е въвел число по-голямо от 6 да се извежда "Invalid input. The number is bigger than 6."
След като прочете валидната оценка програмата да изпише с думи значението на оценката(Excellent, Very good, good...)
Made by Vladislav Velinov.
*/

public class ValidSchoolGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter school grade: ");
        input = sc.nextInt();

        while (input < 2 || input > 6) {

            if (input < 2) {
                System.out.println("Invalid input. The number is lesser than 2.");
                input = sc.nextInt();
            }

            if (input > 6) {
                System.out.println("Invalid input. The number is bigger than 6.");
                input = sc.nextInt();
            }

        }

        switch (input) {
            case 2:
                System.out.println("Fail");
                break;
            case 3:
                System.out.println("Not good");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very good");
                break;
            case 6:
                System.out.println("Excellent");
                break;
            default:
                break;
        }
    }
}

