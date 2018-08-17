package Arrays;

/*
Задача 19
Да се напише програма, която изкарва всички възможни пароли на катинар с 4 цифри(всички стрингове с дължина 4 с
цифрите от 1 до 9)
Made by Vladislav Velinov.
*/
public class AllCombOfLocker {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        System.out.println(i + " " + j + " " + k + " " + l);
                    }
                }
            }
        }
    }
}
