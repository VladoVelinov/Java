package FinalExam.Problem3.songexceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException(String msg) {
        super(msg);
    }
}