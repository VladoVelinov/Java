package FinalExam.Problem3.songexceptions;

public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String msg) {
        super(msg);
    }
}