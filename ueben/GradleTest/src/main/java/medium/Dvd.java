package medium;

public class Dvd extends Medium {
    private final int runningTimeMinutes;

    public Dvd(String id, String title, int runningTimeMinutes) {
        super(id, title);
        this.runningTimeMinutes = runningTimeMinutes;
    }

    @Override
    public String getDescription() {
        return "DVD: " + getTitle() + " (" + runningTimeMinutes + " minutes)";
    }

    public int getRunningTimeMinutes() {
        return runningTimeMinutes;
    }
}
