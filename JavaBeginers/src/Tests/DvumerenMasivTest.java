package Tests;

import java.util.Scanner;
/*
Как се работи с двумерен масив (Matrix)!
*/
public class DvumerenMasivTest {
    public static void main(String[] args) {

        //декларация
        int[][] my2dArray;

        //инициализация
        my2dArray = new int[3][3];
//        int[][] my2dArray = {{1, 2, 3}, {1, 23, 2}, {1, 23, 32}};

        Scanner sc = new Scanner(System.in);

        //попълване на двумерният масив
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            my2dArray[i][j]= Integer.parseInt(sc.nextLine());
            }
        }

        //извеждане на екрана на двумерният масив
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(my2dArray[i][j] + " ");
            }
        }
    }
}