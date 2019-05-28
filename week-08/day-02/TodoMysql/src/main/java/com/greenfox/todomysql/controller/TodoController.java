package com.greenfox.todomysql.controller;
import com.greenfox.todomysql.models.Todo;
import com.greenfox.todomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

    TodoRepo repo;

    @Autowired
    public TodoController(TodoRepo repo){
        this.repo = repo;
    }

    @GetMapping({"/","/list"})
    public String list(Model model) {
        model.addAttribute("newTodo", new Todo());
        model.addAttribute("todos", repo.findAll());
        return "index";
    }

    @PostMapping({"/add"})
    public String add(@ModelAttribute Todo todo) {
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping({"/remove/{id}"})
    public String remove(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("newTodo", new Todo());
        repo.deleteById(new Long(id));
        return "redirect:/";
    }
}
