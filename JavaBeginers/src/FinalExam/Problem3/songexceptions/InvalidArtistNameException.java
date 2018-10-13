package FinalExam.Problem3.songexceptions;

import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidSongException;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String msg) {
        super(msg);
    }
}