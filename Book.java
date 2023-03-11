import java.util.List;

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    List<Author> authors;

    Book(String title, List<Author> authors) {
        this.title = title;
    }

    void addAuthor(Author name) {
        authors.add(name);
    }
}
