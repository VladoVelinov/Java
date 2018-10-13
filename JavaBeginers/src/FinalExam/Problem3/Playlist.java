package FinalExam.Problem3;

public class Playlist {
    private int numberOfSongs;
    private Song[] songs;
    private Duration length;

    public Playlist(int n) {
        numberOfSongs = 0;
        length = new Duration();
        songs = new Song[n];
    }

    public void addSong(int index, Song song) {
        this.songs[index] = song;
        numberOfSongs++;
        this.length.add(song.getDuration().getTotalSeconds());
    }

    public String printNumberOfSongs() {
        return String.format("Songs added: %d", numberOfSongs);
    }

    public String printDuration() {
        return String.format("Playlist length: %s", length.toString());
    }
}