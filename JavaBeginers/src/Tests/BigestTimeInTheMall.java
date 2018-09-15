package Tests;

import java.util.Scanner;

class BigestTimeInTheMall {
    static int findBiggestPeriod(int[][] data) {
        int[] res = {0, 0, 0};
        for (int i = 0; i < data.length; i++) {
            if (data[i][2] == 1) {
                res[2] += data[i][1];
            } else {
                res[2] -= data[i][1];
            }
            if (i < data.length - 1 && data[i][0] == data[i + 1][0]) {
                continue;
            }
            if (res[2] > res[1]) {
                res[1] = res[2];
                res[0] = data[i][1];
            }
        }
        return res[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] my2dArray;
        my2dArray = new int[9][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                my2dArray[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(findBiggestPeriod(my2dArray));
            }
        }

    }
}
