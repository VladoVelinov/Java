package FinalExam.Problem3;

import FinalExam.Problem3.songexceptions.InvalidArtistNameException;
import FinalExam.Problem3.songexceptions.InvalidSongException;
import FinalExam.Problem3.songexceptions.InvalidSongLengthException;
import FinalExam.Problem3.songexceptions.InvalidSongNameException;

public class Song {
    private String artistName;
    private String songName;
    private SongDuration duration;

    public Song(String input) throws InvalidSongException, InvalidArtistNameException {
        String[] tokens = input.split(";");
        String artistName = tokens[0];
        String songName = tokens[1];
        String duration = tokens[2];
        SetFields(artistName, songName, duration);

    }

    public Song(String artistName, String songName, String duration) throws InvalidSongException, InvalidArtistNameException {
        SetFields(artistName, songName, duration);
    }

    public SongDuration getDuration() {
        return duration;
    }

    public void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 30)
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");

        this.artistName = artistName;
    }

    public void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 30)
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");

        this.songName = songName;
    }

    public void setDuration(String duration) throws InvalidSongLengthException {
        SongDuration dur = new SongDuration(duration);
        this.duration = dur;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s", this.artistName, this.songName, this.duration.toString());
    }

    private void SetFields(String artistName, String songName, String duration) throws InvalidArtistNameException, InvalidSongNameException, InvalidSongLengthException {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setDuration(duration);
    }

}