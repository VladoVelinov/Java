package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 7. Време + 15 минути
Да се напише програма, която въвежда час и минути от 24-часово денонощие и изчислява колко ще е часът след 15 минути.
Резултатът да се отпечата във формат hh:mm. Часовете винаги са между 0 и 23, а минутите винаги са между 0 и 59.
Часовете се изписват с една или две цифри. Минутите се изписват винаги с по две цифри, с водеща нула когато е
необходимо.
Made by Vladislav Velinov.
*/
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give number for hours: ");
        int hours = Integer.parseInt(sc.nextLine());

        System.out.println("Give numbers for minutes: ");
        int minutes = Integer.parseInt(sc.nextLine());

        int timePlusMinutes = (hours * 60) + minutes + 15;
        hours = timePlusMinutes / 60;

        if (hours >= 24) {
            hours = hours % 24;
        }
        minutes = timePlusMinutes % 60;
        System.out.printf("%d:%02d", hours, minutes);
    }
}