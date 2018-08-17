package Loops;

/*
Задача 3
Да се изведе следната редица, използвайки цикъл while 1 2 4 8 16 32 64 128 256 512

вход | изход
     | 1 2 4 8 16 32 64 128 256 512
Made by Vladislav Velinov.
*/
public class UsingWhileLoop1 {
    public static void main(String[] args) {

        int i = 1;

        while ((i >= 1) && (i <= 512)) {
            System.out.print(i + " ");
            i += i;
        }
    }
}