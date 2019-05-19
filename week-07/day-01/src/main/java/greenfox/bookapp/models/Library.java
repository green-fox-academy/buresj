package greenfox.bookapp.models;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> library;

    public Library() {
        library = new ArrayList<>();
    }

    public void add(Book book) {
        library.add(book);
    }

    public List<Book> display() {
        return new ArrayList<>(library);
    }
}
