package Loops;

/*
Задача 6
Да се изведат на екрана всички числа от 1 до 1000, които се делят на 3.
Made by Vladislav Velinov.
*/
public class NumbersDividedBy3 {
    public static void main(String[] args) {

        int i = 1;

        while ((i >= 1) && (i <= 1000)) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                i++;
            }else{
                i++;
            }
        }
    }
}