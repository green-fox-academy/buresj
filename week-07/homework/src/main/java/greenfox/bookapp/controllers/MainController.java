package greenfox.bookapp.controllers;

import greenfox.bookapp.models.Book;
import greenfox.bookapp.models.Library;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    private Library library = new Library();

    public MainController() {
        library.add(new Book(1, "Bible", "Guy", 0));
        library.add(new Book(2, "Poems", "Richard Spear", 1515));
        library.add(new Book(3, "Help Book", "Tommy Lee", 1869));
        library.add(new Book(4, "Higher Ground", "David Umn", 2019));
    }

/*
    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public String displayAll(Model model) {
        model.addAttribute("library", library.display());
        return "index";
    }
*/

    @RequestMapping(path = "/books/{id}/details", method = RequestMethod.GET)
    public String displayAll(Model model, @PathVariable(name = "id") Integer id) {
        Book bookById = null;

        for (Book book : library.display()) {
            if (book.getId() == id) {
                bookById = book;
            }
        }

        if (bookById != null) {
            model.addAttribute("book", bookById);
        } else {
            model.addAttribute("error", "No book found");
        }

        return "details";
    }

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public String queryBooks(Model model, @RequestParam(name = "author", required = false) String author) {

        List<Book> queriedBooks;

        if (author != null) {
            queriedBooks = filterBooksByAuthor(author);
        } else {
            queriedBooks = library.display();
        }

        model.addAttribute("library", queriedBooks);
        return "index";
    }

    @RequestMapping(path = "/books/add", method = RequestMethod.GET)
    public String addBookForm(Model model, @ModelAttribute(name = "book") Book book) {
        model.addAttribute("book", book);
        return "create";
    }

    @RequestMapping(path = "/books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute(name = "book") Book book) {
        library.add(book);
        return "redirect:/books";
    }


    private List<Book> filterBooksByAuthor(String author) {
        return library.display().stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
}
