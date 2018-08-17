package Loops;

import java.util.Scanner;

/*
Задача 17  Часовник 3
Променете програмата ви, така че да приема 4 цели числа - 2x(час и минути )и да изписва всички валидни часове
по-късни първите въведени и по-ранни от вторите въведени.

вход	изход
12      12:35
34      12:36
13      12:37
40      12:37
          …
        13:36
        13:37
        13:38
        13:39
Made by Vladislav Velinov.
*/
public class Clock3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for starting time and minutes!");
        int hoursMin = Integer.parseInt(sc.nextLine());
        int minutesMin = Integer.parseInt(sc.nextLine());

        System.out.println("Enter second two numbers for end time and minutes!");
        int hoursMax = Integer.parseInt(sc.nextLine());
        int minutesMax = Integer.parseInt(sc.nextLine());

        if (hoursMin < 0
            || hoursMin > 23
            || hoursMax < 0
            || hoursMax > 23
            || minutesMin < 0
            || minutesMin > 59
            || minutesMax < 0
            || minutesMax > 59) {
            System.out.println("Invalid Input!");
        } else {

            for (int i = hoursMin; i <= hoursMax; i++) {

                for (int y = minutesMin + 1; y < minutesMax; y++) {
                    String h = String.format("%02d", i);
                    String m = String.format("%02d", y);
                    System.out.println(h + ":" + m);
                }
            }
        }
    }
}