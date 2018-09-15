package OOP.inheritance.onlineradiodatabase.songexceptions;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String msg) {
        super(msg);
    }
}