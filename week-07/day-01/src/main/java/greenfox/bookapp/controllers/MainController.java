package greenfox.bookapp.controllers;

import greenfox.bookapp.models.Library;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/books")
    public String displayAll(Model model) {
        Library library = new Library();
        model.addAttribute("library", library.display());
        return "index";
    }
}
