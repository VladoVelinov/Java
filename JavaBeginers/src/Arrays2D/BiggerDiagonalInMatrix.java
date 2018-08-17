package Arrays2D;

import java.util.Scanner;

/*
Задача 2
Да се напише програма ,която получава числа n и m - големина на матрица, и после m*n числа, които са елементите
на матрицата. Програмата ви трябва да изкара сумите на елементите по двата диагонала и да изпише, коя е по-голямата
от двете.
Made by Vladislav Velinov.
*/
public class BiggerDiagonalInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int[][] my2dArr = new int[n][m];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                my2dArr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum1 += my2dArr[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j == m - 1) {
                    sum2 += my2dArr[i][j];
                }
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);

        if (sum1 > sum2) {
            System.out.println(sum1 + " is greater");
        } else {
            System.out.println(sum2 + " is greater");
        }
    }
}