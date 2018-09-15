package OOP.inheritance.onlineradiodatabase;


import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidArtistNameException;
import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidSongException;
import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidSongLengthException;
import OOP.inheritance.onlineradiodatabase.songexceptions.InvalidSongNameException;

public class Song {
    private String artistName;
    private String songName;
    private SongDuration duration;

    public Song(String input) throws InvalidSongException {
        String[] tokens = input.split(";");
        String artistName = tokens[0];
        String songName = tokens[1];
        String duration = tokens[2];

        SetFields(artistName, songName, duration);
    }

    public Song(String artistName, String songName, String duration) throws InvalidSongException {
        SetFields(artistName, songName, duration);
    }

    public SongDuration getDuration() {
        return duration;
    }

    public void setArtistName(String artistName) throws InvalidArtistNameException {
        if (artistName.length() < 3 || artistName.length() > 30)
            throw new InvalidArtistNameException("Invalid name for the song");

        this.artistName = artistName;
    }

    public void setSongName(String songName) throws InvalidSongNameException {
        if (songName.length() < 3 || songName.length() > 30)
            throw new InvalidSongNameException("Invalid name for the song");

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