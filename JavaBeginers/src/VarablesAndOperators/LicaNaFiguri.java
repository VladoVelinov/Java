package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 6. Лица на фигури
Да се напише програма, която въвежда размерите на геометрична фигура и пресмята лицето й. Фигурите са четири вида:
квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle). На първия ред на входа се чете
вида на фигурата (square, rectangle, circle или triangle). Ако фигурата е квадрат, на следващия ред се чете едно
число – дължина на страната му. Ако фигурата е правоъгълник, на следващите два реда четат две числа – дължините на
страните му. Ако фигурата е кръг, на следващия ред чете едно число – радиусът на кръга. Ако фигурата е триъгълник,
на следващите два реда четат две числа – дължината на страната му и дължината на височината към нея. Резултатът да
се закръгли до 3 цифри след десетичната точка.
Made by Vladislav Velinov.
*/
public class LicaNaFiguri {

    public static void main(String[] args) {
        System.out.println("Enter figure (square, rectangle, circle или triangle):");
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine().toLowerCase();

        double area;
        switch (figure) {
            case "square":
                System.out.println("You have entered square! Now enter side a:");
                double squareSide = Double.parseDouble(sc.nextLine());
                area = (squareSide) * (squareSide);
                System.out.print("The area of this " + figure + " is ");
                System.out.printf("%.03f", area);
                break;
            case "rectangle":
                System.out.println("You have entered rectangle! Now enter side a:");
                double rectangleSideA = Double.parseDouble(sc.nextLine());
                System.out.println("You have entered rectangle! Now enter side b:");
                double rectangleSideB = Double.parseDouble(sc.nextLine());
                area = rectangleSideA * rectangleSideB;
                System.out.print("The area of this " + figure + " is ");
                System.out.printf("%.03f", area);
                break;
            case "circle":
                System.out.println("You have entered circle! Now enter the radius r:");
                double radius = Double.parseDouble(sc.nextLine());
                area = radius * radius * Math.PI;
                System.out.print("The area of this " + figure + " is ");
                System.out.printf("%.03f", area);
                break;
            case "triangle":
                System.out.println("You have entered triangle! Now enter his side a:");
                double triangleSide = Double.parseDouble(sc.nextLine());
                System.out.println("Now enter his height ha:");
                double triangleHight = Double.parseDouble(sc.nextLine());
                area = (triangleSide * triangleHight) / 2;
                System.out.print("The area of this " + figure + " is ");
                System.out.printf("%.03f", area);
                break;
            default:
                System.out.println("No such figure!");
                break;
        }
    }
}
