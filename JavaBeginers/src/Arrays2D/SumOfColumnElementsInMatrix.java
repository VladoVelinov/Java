package Arrays2D;

import java.util.Scanner;

/*
Задача 1
Да се напише програма ,която получава числа n и m - големина на матрица, и после m*n числа, които са елементите
на матрицата. След това ще получите число, което е номер на колона, и трябва да изкарате сумата на всички елементи
от тази колона.
Made by Vladislav Velinov.
*/
public class SumOfColumnElementsInMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        int col = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][col - 1];

        }

        System.out.println(sum);
    }
}