package Loops;

import java.util.Scanner;

/*
Задача 16  Часовник 2
Променете програмата ви, така че да приема 2 цели числа - час и минути и да изписва всички валидни часове
по-късни от въведените.
Made by Vladislav Velinov.
*/
public class Clock2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for time and minutes!");
        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Invalid Input!");
        } else {

            for (int i = hours; i <= 23; i++) {
                for (int j = minutes + 1; j < 60; j++) {
                    String h = String.format("%02d", i);
                    String m = String.format("%02d", j);
                    System.out.println(h + ":" + m);
                }
            }
        }
    }
}