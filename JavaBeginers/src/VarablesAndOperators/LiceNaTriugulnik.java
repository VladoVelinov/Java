package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 2. Лице на триъгълник

Напишете програма, която чете 3 точки от равнината (x и y координатите), изчислява лицето на триъгълника образуван от
тези 3 точки. Ако трите точки не сформират триъгълник, да се изпише 0.

Input	Output
-5 10
25 30
60 15	575

*/
public class LiceNaTriugulnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax, ay, bx, by, cx, cy;

        System.out.println("Give coordinates ax: ");
        ax = sc.nextInt();
        System.out.println("Give coordinates ay: ");
        ay = sc.nextInt();
        System.out.println("Give coordinates bx: ");
        bx = sc.nextInt();
        System.out.println("Give coordinates by: ");
        by = sc.nextInt();
        System.out.println("Give coordinates cx: ");
        cx = sc.nextInt();
        System.out.println("Give coordinates cy: ");
        cy = sc.nextInt();


        double ab, ac, bc;


        ab = Math.pow((ax - bx), 2) + Math.pow((ay - by), 2);
        ab = Math.sqrt(ab);

        ac = Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2);
        ac = Math.sqrt(ac);

        bc = Math.pow((bx - cx), 2) + Math.pow((by - cy), 2);
        bc = Math.sqrt(bc);

        if ((ab + bc) > ac && (ab + ac) > bc && (bc + ac) > ab) {
            double S;
            double x;
            double h;
            x = ((ac * ac) - (bc * bc) + (ab * ab)) / (2 * ab);
            h = Math.sqrt((ac * ac) - (x * x));
            S = ((ab * h) / 2);
            System.out.print("Area of this triangle is: ");
            System.out.printf("%.03f", S);
        } else {
            System.out.println("0");
        }
    }
}
