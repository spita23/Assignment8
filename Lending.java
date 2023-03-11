import java.time.LocalDate;

public class Lending {
    java.time.LocalDate dueDate;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    private Book book;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    Lending(Book book, User user) {
        this.book = book;
        this.dueDate = java.time.LocalDate.now().plusDays(30);
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
