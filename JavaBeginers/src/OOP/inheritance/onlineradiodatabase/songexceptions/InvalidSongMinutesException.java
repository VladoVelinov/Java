package OOP.inheritance.onlineradiodatabase.songexceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException(String msg) {
        super(msg);
    }
}