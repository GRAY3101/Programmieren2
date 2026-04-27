package medium;

public class Magazine extends Medium {
    private final int issueNumber;

    public Magazine(String id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getDescription() {
        return "medium.Magazine: " + getTitle() + ", issue " + issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
