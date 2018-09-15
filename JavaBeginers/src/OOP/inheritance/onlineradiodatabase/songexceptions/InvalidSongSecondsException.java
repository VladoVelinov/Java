package OOP.inheritance.onlineradiodatabase.songexceptions;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException(String msg) {
        super(msg);
    }
}
