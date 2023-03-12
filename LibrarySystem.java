import java.util.List;

public class LibrarySystem {
    public LibrarySystem() {
    }

    void extendLending(Lending lending) {
        lending.setDueDate(java.time.LocalDate.now().plusDays(30));
    }

    void returnBook(Book book, User user) {
    }

    void borrowBook(Book book, User user) {
    }

    Book findBookByTitle(String title) {
        return null;
    }

    User findUserByName(String name) {
        return null;
    }

    void addFacultyMemberUser(String name, String department) {

    }

    void addStudentUser(String name, boolean feePaid) {

    }

    void addBookWithTitleAndAuthorlist(String title, List<Author> authors) {
    
    }

    public static void main(String[] args) {

    }
}
