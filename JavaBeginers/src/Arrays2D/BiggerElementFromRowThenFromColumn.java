package Arrays2D;

import java.util.Scanner;

/*
Задача 3
Да се напише програма ,която получава числа n и m - големина на матрица, и после n*m числа, които са елементите на
матрицата. Програмата ви трябва да изкара най- големия елемент от всеки ред и после от всяка колона.
Made by Vladislav Velinov.
*/
public class BiggerElementFromRowThenFromColumn {
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

        for (int i = 0; i < n; i++) {
            int BigRow = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > BigRow)
                    BigRow = matrix[i][j];
            }
            System.out.println(BigRow);
        }

        for (int i = 0; i < n; i++) {
            int BigCol = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] > BigCol)
                    BigCol = matrix[j][i];
            }
            System.out.println(BigCol);
        }
    }
}