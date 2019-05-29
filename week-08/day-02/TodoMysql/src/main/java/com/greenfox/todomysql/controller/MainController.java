package com.greenfox.todomysql.controller;
import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.repository.TodoRepo;
import com.greenfox.todomysql.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private TodoRepo repo;
    private UserRepo userRepo;

    @Autowired
    public MainController(@Qualifier("todo") TodoRepo repo,@Qualifier("user") UserRepo userRepo){
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @GetMapping({"/","/list"})
    public String list(Model model) {
        model.addAttribute("newTodo", new Todo());
        model.addAttribute("todos", repo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo) {
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/remove/{id}")
    public String remove(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("newTodo", new Todo());
        repo.deleteById(new Long(id));
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("updateTodo", repo.findById(new Long(id)));
        return "edit";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("detailTodo", repo.findById(new Long(id)));
        return "detail";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Todo todo) {
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("newUser", new User());
        return "login";
    }

    @PostMapping("/login")
    public String addUser(@ModelAttribute User user){
        userRepo.save(user);
        return "redirect:/login";
    }
}
