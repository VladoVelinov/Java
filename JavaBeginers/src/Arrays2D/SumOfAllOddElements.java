package Arrays2D;

import java.util.Scanner;

/*
Задача 9
Напишете функция, която приема матрица от int-ове  и връща като резултат сбора на всички нечетни елементи, които се
намират на четна колона (първата колона с номер 1)
Made by Vladislav Velinov.
*/
public class SumOfAllOddElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for dimensions and then elements of the first matrix");
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        DisplayMatrix.displayMatrix(matrix);
        System.out.println(sumOfOddElementsEvenColumn(matrix));

    }

    private static int sumOfOddElementsEvenColumn(int[][] matrix) {
        int sumCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0 && j % 2 != 0) {
                    sumCol += matrix[i][j];
                }
            }
        }
        return sumCol;
    }
}