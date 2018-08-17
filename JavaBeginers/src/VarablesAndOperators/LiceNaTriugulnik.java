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
Made by Vladislav Velinov.
*/
public class LiceNaTriugulnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give coordinates ax: ");
        int ax = Integer.parseInt(sc.nextLine());
        System.out.println("Give coordinates ay: ");
        int ay = Integer.parseInt(sc.nextLine());
        System.out.println("Give coordinates bx: ");
        int bx = Integer.parseInt(sc.nextLine());
        System.out.println("Give coordinates by: ");
        int by = Integer.parseInt(sc.nextLine());
        System.out.println("Give coordinates cx: ");
        int cx = Integer.parseInt(sc.nextLine());
        System.out.println("Give coordinates cy: ");
        int cy = Integer.parseInt(sc.nextLine());

        double ab = Math.pow((ax - bx), 2) + Math.pow((ay - by), 2);
        ab = Math.sqrt(ab);

        double ac = Math.pow((ax - cx), 2) + Math.pow((ay - cy), 2);
        ac = Math.sqrt(ac);

        double bc = Math.pow((bx - cx), 2) + Math.pow((by - cy), 2);
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
