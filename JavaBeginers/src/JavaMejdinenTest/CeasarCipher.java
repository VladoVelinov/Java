package JavaMejdinenTest;

import java.util.Scanner;

/*
Test4:
Шифърът на Цезар е основна техника за криптиране, използвана от Юлий Цезар, за да комуникира сигурно с генералите си.
Всяка буква се заменя с друга буква с N позиции надолу по английската азбука.
Например, за ротация от 5, буквата "c" ще
бъде заменена с "h".
В случай на "z", азбуката се върти и се трансформира в "d".
Напишете декодер за Ceasar шифъра, където N = 5.
Класа да се именува: CeasarCipher.
Метода: decode
Made by Vladislav Velinov.
*/
public class CeasarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        System.out.print(decode(myStr));
    }

    private static String decode(String str) {
        int num = 5;
        Character[] resultCoded = new Character[str.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char norm = str.charAt(i);
            int coded = (int) norm + num;
            char codedCharacter = (char) coded;
            resultCoded[i] = codedChar(codedCharacter);
        }

        for (int i = 0; i < resultCoded.length; i++) {
            sb.append(resultCoded[i]);
        }

        return sb.toString();
    }

    private static Character codedChar(Character c) {
        char coded = c;
        if (coded >= 97 && coded <= 122) {
            return coded;
        } else if (coded > 122) {
            coded -= 26;
            return coded;
        }
        if (coded >= 65 && coded <= 90) {
            return coded;
        } else if (coded > 90) {
            coded -= 26;
            return coded;
        }
        if (coded >= 48 && coded <= 57) {
            return coded;
        } else if (coded > 57) {
            coded -= 10;
            return coded;
        }
        return coded;
    }
}