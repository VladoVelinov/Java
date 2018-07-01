package Loops;

import java.util.Scanner;
/*
Задача 16  Часовник 2
Променете програмата ви, така че да приема 2 цели числа - час и минути и да изписва всички валидни часове
по-късни от въведените.
*/

public class Clock2 {
    public static void main(String[] args) {

        int hours, minutes;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers for time and minutes!");
        hours = sc.nextInt();
        minutes = sc.nextInt();

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid Input!");
        } else {

            for (int i = hours; i <= 23; i++) {
                for (int y = minutes + 1; y < 60; y++) {
                    String h = String.format("%02d", i);
                    String m = String.format("%02d", y);
                    System.out.println(h + ":" + m);
                }
            }
        }
    }
}