package Loops;

/*
Задача 5
Редицата от задача 4 да се изведе без четните числа!
Made by Vladislav Velinov.
*/
public class PrintOnlyOddNumbers {
    public static void main(String[] args) {

        int i = 7;

        while ((i >= 7) && (i < 98)) {

            if (i % 2 == 0) {
                i += 7;
            } else {
                System.out.print(i + " ");
                i += 7;
            }
        }
    }
}
