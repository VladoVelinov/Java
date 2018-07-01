package VarablesAndOperators;

import java.util.Scanner;

/*
4.Еднакви думи
Да се напише програма, която въвежда две думи и проверява дали са еднакви. Да не се прави разлика между главни и
малки думи. Да се изведе “yes” или “no”.
*/
public class EqualWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word!");
        String myStr1 = sc.nextLine().toLowerCase();

        System.out.println("Enter second word!");
        String myStr2 = sc.nextLine().toLowerCase();

        if (myStr1.equals(myStr2)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}
