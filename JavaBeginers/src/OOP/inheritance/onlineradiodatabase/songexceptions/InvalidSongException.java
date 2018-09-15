package OOP.inheritance.onlineradiodatabase.songexceptions;

public class InvalidSongException extends Exception {
    public InvalidSongException(String msg) {
        super(msg);
    }
}