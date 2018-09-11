package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача 13
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой
числа, които трябва да се сложат в масива. Програмата да изведе всички прости, неповтарящи се делители на сумата
от въведените числа.
Made by Vladislav Velinov.
*/
public class SumOfElementsComDiv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        int sum = 0;
        boolean isPrime;

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            sum += myArray[i];
        }

        List<Integer> list = new ArrayList<>();
//        Iterator it = list.iterator();

        for (int i = 3; i <= sum / 2; i++) {
            isPrime = true;
            if (sum % i == 0) {
                for (int y = 2; y <= i / 2; y++) {
                    if (i % y == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                list.add(i);
            }
        }

        System.out.println("сума: " + sum);
        System.out.print("делители: ");

        for (int i : list) {
            System.out.print(i + " ");
        }

//        while (it.hasNext()) {
//        }
    }
}