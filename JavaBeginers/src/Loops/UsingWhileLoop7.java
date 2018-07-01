package Loops;

/*
Задача 4
Да се изведе следната редица, използвайкли цикъл while 7 14 21 28 35 42 49 56 63 70 77 84 91 98

вход | изход
     | 7 14 21 28 35 42 49 56 63 70 77 84 91
Made by Vladislav Velinov.
*/

public class UsingWhileLoop7 {
    public static void main(String[] args) {

        int i = 7;

        while ((i >= 7) && (i < 98)) {
            System.out.print(i + " ");
            i +=7;
        }
    }
}
