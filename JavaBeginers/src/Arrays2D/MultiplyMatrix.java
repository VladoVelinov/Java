package Arrays2D;

import java.util.Scanner;

/*
Задача 5
Да се реализира функция int[][] MultiplyMatrix(int[][] m1,int[][] m2), която връща нова матрица, която е
произведението на матриците, които са подадени.
Забележка.
Да се обърне внимание кога може да умножат две матрици и как става това. Ако двете матрици не могат да бъдат умножени,
да се върне нулев пойнтер/указател.
Made by Vladislav Velinov.
*/
public class MultiplyMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for dimensions and then elements of the first matrix");
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int[][] matrix1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.println("Enter two numbers for dimensions and then elements of the second matrix");
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());
        int[][] matrix2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

//        int[][] matrix1 = new int[][]{{1, 4, 6, 10}, {2, 7, 5, 3}};
//        int[][] matrix2 = new int[][]{{1, 4, 6}, {2, 7, 5}, {9, 0, 11}, {3, 1, 0}};

        DisplayMatrix.displayMatrix(multiplyByMatrix(matrix1, matrix2));
    }

    private static int[][] multiplyByMatrix(int[][] m1, int[][] m2) {
        int m1ColLength = m1[0].length;
        int m2RowLength = m2.length;
        if (m1ColLength != m2RowLength)
            return null;
        int mResultRowLength = m1.length;
        int mResultColLength = m2[0].length;
        int[][] mResult = new int[mResultRowLength][mResultColLength];
        for (int i = 0; i < mResultRowLength; i++) {
            for (int j = 0; j < mResultColLength; j++) {
                for (int k = 0; k < m1ColLength; k++) {
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }
}