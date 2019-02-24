/*
Exercise 1.5 *:
Write a program that produces images of Christmas trees as output. It should have a method with two parameters: one
for the number of segments in the tree and one for the height of each segment. For example, the tree shown here on
the left has three segments of height 4 and the one on the right has two segments of height 5:
Made by Vladislav Velinov.
*/
package ObjectOrientedProgramming;

public class ChristmasTree {
    private static final int SEGMENTS = 3;
    private static final int HEIGHT = 4;

    public static void main(String[] args) {
        makeTree();
    }

    private static void makeTree() {
        int maxStars = 2 * HEIGHT + 2 * SEGMENTS - 3;
        String maxStr = "";

        for (int len = 0; len < maxStars; len++) {
            maxStr += " ";
        }

        for (int i = 1; i <= SEGMENTS; i++) {
            for (int line = 1; line <= HEIGHT; line++) {
                String starStr = "";
                for (int j = 1; j <= 2 * line + 2 * i - 3; j++) {
                    starStr += "*";
                }
                for (int space = 0; space <= maxStars - (HEIGHT + line + i); space++) {
                    starStr = " " + starStr;
                }
                System.out.println(starStr);
            }
        }

        for (int i = 0; i < maxStars / 2; i++) {
            System.out.print(" ");
        }
        if (SEGMENTS % 2 == 0)
            System.out.print("*\n");
        else
            System.out.print(" *\n");

        for (int i = 0; i < maxStars / 2; i++) {
            System.out.print(" ");
        }
        if (SEGMENTS % 2 == 0)
            System.out.print("*\n");
        else
            System.out.print(" *\n");

        for (int i = 0; i < maxStars / 2 - 3; i++) {
            System.out.print(" ");
        }
        if (SEGMENTS % 2 == 0)
            System.out.print("*******\n");
        else
            System.out.print(" *******\n");
    }
}