package medium;

public abstract class Medium {
    private final String id;
    private final String title;

    public Medium(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getDescription();
}
