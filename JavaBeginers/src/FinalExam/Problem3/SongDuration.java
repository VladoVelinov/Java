package FinalExam.Problem3;

import FinalExam.Problem3.songexceptions.InvalidSongLengthException;
import FinalExam.Problem3.songexceptions.InvalidSongMinutesException;
import FinalExam.Problem3.songexceptions.InvalidSongSecondsException;

public class SongDuration extends Duration {
    private int minutes;
    private int seconds;

    public SongDuration(String strDur) throws InvalidSongLengthException {
        String[] tokens = strDur.split(":");

        int minutes = Integer.parseInt(tokens[0].trim());
        int seconds = Integer.parseInt(tokens[1].trim());

        this.setMinutes(minutes);
        this.setSeconds(seconds);
        this.setTotalSeconds(minutes, seconds);
    }

    public void setMinutes(int minutes) throws InvalidSongMinutesException {
        if (minutes < 0 || minutes > 14)
            throw new InvalidSongMinutesException("Minutes must be between 0 and 14.");

        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws InvalidSongSecondsException {
        if (seconds < 0 || seconds > 59)
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");

        this.seconds = minutes;
    }

    public void setTotalSeconds(int minutes, int seconds) {
        this.totalSeconds = minutes * 60 + seconds;
    }

    @Override
    public String toString() {
        return String.format("%d:%d", this.minutes, this.seconds);
    }
}