package VarablesAndOperators;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Enter number to check:");
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input!");
                break;

        }
    }
}
