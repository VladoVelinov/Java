package OOP.inheritance.onlineradiodatabase.songexceptions;

public class InvalidSongNameException extends InvalidSongException {
    public InvalidSongNameException(String msg) {
        super(msg);
    }
}