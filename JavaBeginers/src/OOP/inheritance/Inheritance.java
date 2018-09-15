package OOP.inheritance;


import OOP.inheritance.Person.Child;
import OOP.inheritance.Person.Person;
import OOP.inheritance.bookshop.Book;
import OOP.inheritance.bookshop.GoldenEditionBook;
import OOP.inheritance.gandalfshmandalf.Gandalf;
import OOP.inheritance.gandalfshmandalf.Rodagast;
import OOP.inheritance.gandalfshmandalf.WizardHappiness;
import OOP.inheritance.mankind.Student;
import OOP.inheritance.onlineradiodatabase.Playlist;
import OOP.inheritance.onlineradiodatabase.Song;
import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidSongException;
import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidSongLengthException;

import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
        mainManKind();
    }

    public static void mainGandaf() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] foods = input.split(" ");
        WizardHappiness gandalf = new Gandalf();
        WizardHappiness rodagast = new Rodagast();
        WizardHappiness[] wizards = new WizardHappiness[2];
        wizards[0] = gandalf;
        wizards[1] = rodagast;
        for (int i = 0; i < wizards.length; i++) {

            for (int j = 0; j < foods.length; j++) {
                wizards[i].eats(foods[j]);
            }
        }
//        System.out.println(gandalf.GetHappiness());
        System.out.println(gandalf.GetMood());
        System.out.println(rodagast.GetMood());
    }
    public static void mainOnlineRadioDatabase() {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        Playlist pl = new Playlist(num);

        for (int i = 0; i < num; i++) {
            String songInput = sc.nextLine();
            try {
                Song song = new Song(songInput);
                pl.addSong(i, song);

                System.out.println("Song added!");
            } catch (InvalidSongLengthException e) {
                //some other code
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("============================================");

        System.out.println(pl.printDuration());
        System.out.println(pl.printNumberOfSongs());
    }
    public static void mainManKind() {
        Student[] students = new Student[3];

        students[0] = new Student("Tony",
                "Keremekchiev",
                5.70);

        students[1] = new Student("Nikolay",
                "Napoleonov",
                3.70);

        students[2] = new Student("Lyuben",
                "Karaslavov",
                4.70);

        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].toString());
        }

        Arrays.sort(students);

        System.out.println("=========================");

        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].toString());
        }
    }
    public static void mainPerson() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.valueOf(scanner.nextLine());

//        try {
        Child child = new Child(name, age);
        System.out.println(child.toString());
        String personClassName = Person.class.getSimpleName();

        String childClassName = Child.class.getSimpleName();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

       /* catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }*/
    }
    public static void mainBookShop() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            String author = scanner.nextLine();
            String title = scanner.nextLine();
            double price = Double.valueOf(scanner.nextLine());


            Book book = new Book(author,
                    title,
                    price);

            GoldenEditionBook goldenEditionBook =
                    new GoldenEditionBook(author,
                            title,
                            price);

            Method[] goldenBookDeclaredMethods =
                    GoldenEditionBook.class.getDeclaredMethods();


            if (goldenBookDeclaredMethods.length > 2) {
                throw new IllegalClassFormatException(
                        "Code duplication in GoldenEditionBook!");
            }


            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());


        } catch (IllegalArgumentException | IllegalClassFormatException error) {
            System.out.println(error.getMessage());
        }
    }
}