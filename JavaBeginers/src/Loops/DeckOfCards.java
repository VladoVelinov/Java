package Loops;

import java.util.Scanner;

/*
Задача 23 Тесте карти
Дадено е наредено тесте карти. Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо.
Наредбата по цвят на картите е: спатия, каро, купа, пика. Да се създаде програма , чрез която се въвежда N
естествено число от интервала [1..52] и се извеждат въведения номер карта и останалите по-големи карти от тестето.
*/
public class DeckOfCards {
    public static void main(String[] args) {
        int num, cardIndex, cardColor;
        String str = "", card = "";

        System.out.println("Enter Number in range 1-52:");
        Scanner sc = new Scanner(System.in);
        num = Integer.parseInt(sc.nextLine());

        while (num < 1 || num > 52) {

            System.out.println("Invalid Input!");
            num = Integer.parseInt(sc.nextLine());
        }

        for (int i = num; i <= 52; i++) {

            cardIndex = i % 13;
            cardColor = (int) Math.round((i / 13) + .5);

            switch (cardIndex) {
                case 1:
                    card = "2 ";
                    break;
                case 2:
                    card = "3 ";
                    break;
                case 3:
                    card = "4 ";
                    break;
                case 4:
                    card = "5 ";
                    break;
                case 5:
                    card = "6 ";
                    break;
                case 6:
                    card = "7 ";
                    break;
                case 7:
                    card = "8 ";
                    break;
                case 8:
                    card = "9 ";
                    break;
                case 9:
                    card = "10 ";
                    break;
                case 10:
                    card = "J ";
                    break;
                case 11:
                    card = "Q ";
                    break;
                case 12:
                    card = "K ";
                    break;
                case 0:
                    card = "A ";
                    --cardColor;
                    break;
                default:
                    ++cardIndex;
                    break;
            }

            switch (cardColor) {
                case 1:
                    str = " of Clubs";
                    break;
                case 2:
                    str = " of Diamonds";
                    break;
                case 3:
                    str = " of Hearts";
                    break;
                case 4:
                    str = " of Spades";
                    break;
                default:
                    break;
            }
            System.out.println(card + str);
        }
    }
}
