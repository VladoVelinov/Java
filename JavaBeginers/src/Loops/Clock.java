package Loops;

/*
Задача 15  Часовник
Напише програма, която изписва всички валидни часове от електронен часовник.
Made by Vladislav Velinov.
*/
public class Clock {
    public static void main(String[] args) {
        int hours, minutes;

        for (hours = 0; hours <= 23; hours++) {
            for (minutes = 0; minutes < 60; minutes++) {
                String h = String.format("%02d", hours);
                String m = String.format("%02d", minutes);
                System.out.println(h + ":" + m);
            }
        }
    }
}
