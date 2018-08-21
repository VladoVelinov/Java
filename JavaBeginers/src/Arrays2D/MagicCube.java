package Arrays2D;

import java.util.Scanner;

/*
Задача 7
Да се напише програма, която получава числа n и m - големина на матрица, и после n*m числа, които са елементите на
матрицата. Програмата ви трябва да изкара дали това е магически квадрат. (Квадратна матрица от числа се нарича
магически квадрат, когато е изпълнено следното условие: всички суми, получени поотделно от сбора на елементите по
всеки ред/всеки стълб/всеки от двата диагонала са равни.)
Made by Vladislav Velinov.
*/
public class MagicCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for dimensions of matrix and then matrix elements");
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(isMagicSquare(matrix));
    }

    private static boolean isMagicSquare(int[][] matrix){
        boolean isTrue = true;

        int sumDiagonal1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sumDiagonal1 += matrix[i][j];
                }
            }
        }

        int sumDiagonal2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix[0].length - 1) {
                    sumDiagonal2 += matrix[i][j];
                }
            }
        }

        if (sumDiagonal1 != sumDiagonal2) {
            isTrue = false;
        }

        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sumRow += matrix[i][j];
            }
            if (sumRow != sumDiagonal1) {
                isTrue = false;
                break;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int sumCol = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sumCol += matrix[j][i];
            }
            if (sumCol != sumDiagonal1) {
                isTrue = false;
                break;
            }
        }

        return isTrue;
    }
}