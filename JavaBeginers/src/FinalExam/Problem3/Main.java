package FinalExam.Problem3;

import FinalExam.Problem3.songexceptions.InvalidSongException;
import FinalExam.Problem3.songexceptions.InvalidSongLengthException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainOnlineRadioDatabase();
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

                System.out.println("Song added.");
            } catch (InvalidSongLengthException e) {
                System.out.println(e.getMessage());
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(pl.printNumberOfSongs());
        System.out.println(pl.printDuration());
    }
}
