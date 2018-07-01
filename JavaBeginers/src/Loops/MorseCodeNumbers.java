package Loops;

import java.util.Scanner;

/*
Задача 24 Морзова азбука
Да се състави програма , която при въвеждане на естествено число  извежда цифрите му в морзовата азбука.
Цифрите на числото се извеждат отдясно-наляво.
Цифрите в морзовата азбука се изписват както следва:
0: "----- ";
1: ".... ";
2: "...- ";
3: "..-- ";
4: "..--- ";
5: ".---- ";
6: "-... ";
7: "--.. ";
8: "---.. ";
9: "----. ";
*/
public class MorseCodeNumbers {
    public static void main(String[] args) {

        int number, num, reverseNum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number!");
        num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.print("----- ");
        }

        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }

        do {
            number = reverseNum % 10;
            switch (number) {
                case 0:
                    System.out.print("----- ");
                    break;
                case 1:
                    System.out.print(".... ");
                    break;
                case 2:
                    System.out.print("...- ");
                    break;
                case 3:
                    System.out.print("..-- ");
                    break;
                case 4:
                    System.out.print("..--- ");
                    break;
                case 5:
                    System.out.print(".---- ");
                    break;
                case 6:
                    System.out.print("-... ");
                    break;
                case 7:
                    System.out.print("--.. ");
                    break;
                case 8:
                    System.out.print("---.. ");
                    break;
                case 9:
                    System.out.print("----. ");
                    break;
            }
            reverseNum = reverseNum / 10;
        } while (reverseNum > 0);
    }
}