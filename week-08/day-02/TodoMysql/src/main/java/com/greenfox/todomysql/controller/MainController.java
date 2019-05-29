package com.greenfox.todomysql.controller;

import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.models.Validator;
import com.greenfox.todomysql.repository.TodoRepo;
import com.greenfox.todomysql.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private TodoRepo repo;
    private UserRepo userRepo;
    private Validator val;
    private User user;
    private long userId;

    @Autowired
    public MainController(@Qualifier("todo") TodoRepo repo, @Qualifier("user") UserRepo userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
        this.val = new Validator(repo, userRepo);
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam(required = false) String user) {
        model.addAttribute("newTodo", new Todo());
        model.addAttribute("todos", repo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo) {
        todo.setUserId(userId);
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/remove")
    public String remove(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("newTodo", new Todo());
        repo.deleteById(new Long(id));
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("updateTodo", repo.findById(new Long(id)));
        return "edit";
    }

    @GetMapping("/{id}/detail")
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
    public String login(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute User user) {
        if (!val.test(user)) {
            userRepo.save(user);
            userId = user.getId();
            return "redirect:/login";
        }
        model.addAttribute("error","Existing user!");
        return "errors";
    }

    @PostMapping("/test")
    public String use( @ModelAttribute User user) {
        if (val.test(user)) {
            this.user = user;
            return "redirect:/?name=" + user.getName();
        }
        return "redirect:/login";
    }
}
