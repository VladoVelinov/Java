package Arrays2D;

public class DisplayMatrix {
    public static void displayMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}