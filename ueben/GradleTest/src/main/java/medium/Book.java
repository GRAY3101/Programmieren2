package medium;

public class Book extends Medium {
    private final String author;
    private final int numberOfPages;

    public Book(String id, String title, String author, int numberOfPages) {
        super(id, title);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getDescription() {
        return "medium.Book: " + getTitle() + " by " + author;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
