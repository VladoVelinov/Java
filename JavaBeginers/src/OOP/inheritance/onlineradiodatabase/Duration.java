package OOP.inheritance.onlineradiodatabase;

public class Duration {
    protected int totalSeconds;

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public void add(int totalSeconds) {
        this.totalSeconds += totalSeconds;
    }

    @Override
    public String toString() {
        int hours = totalSeconds / (60 * 60);
        int minutes = (totalSeconds / 60) - (hours * 60);
        int seconds = totalSeconds % 60;

        return String.format("%d h %d m %d s", hours, minutes, seconds);
    }
}