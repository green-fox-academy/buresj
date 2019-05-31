package com.greenfox.todomysql.controllers;

import com.greenfox.todomysql.entities.Asignee;
import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.models.Selector;
import com.greenfox.todomysql.repositories.AsigneeRepo;
import com.greenfox.todomysql.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TableController {

    private TodoRepo repo;
    private Selector selector;
    private AsigneeRepo asigneeRepo;
    private long userId;

    @Autowired
    public TableController (Selector selector, TodoRepo repo, AsigneeRepo asigneeRepo) {
        this.selector = selector;
        this.asigneeRepo = asigneeRepo;
        this.repo = repo;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model, @RequestParam long user) {
        model.addAttribute("newTodo", new Todo());
        model.addAttribute("todos", selector.show(user));
        userId = user;
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Todo todo) {
        todo.setUserId(userId);
        repo.save(todo);
        return "redirect:/?user=" + userId;
    }

    @GetMapping("/{id}/remove")
    public String remove(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("newTodo", new Todo());
        repo.deleteById(new Long(id));
        return "redirect:/?user=" + userId;
    }

    @GetMapping("/{id}/completed")
    public String complete(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("newTodo", new Todo());
        repo.findById(new Long(id)).get().setDone(true);
        return "redirect:/?user=" + userId;
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("updateTodo", repo.findById(new Long(id)));
        model.addAttribute("asignees", asigneeRepo.findAll());
        return "edit";
    }

    @GetMapping("/{id}/detail")
    public String detail(Model model, @PathVariable(name = "id") long id) {
        model.addAttribute("detailTodo", repo.findById(id));
        return "detail";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Todo todo, @ModelAttribute Asignee asignee) {

        repo.save(todo);
        return "redirect:/?user=" + userId;
    }

    @GetMapping("/asignee")
    public String createA (Model model){
        model.addAttribute("newAsignee", new Asignee());
        model.addAttribute("asignees", asigneeRepo.findAll());
        model.addAttribute("todos",repo.findAll());
        return "asignees";
    }

    @PostMapping("/adda")
    public String addA(@ModelAttribute Asignee asignee) {
        asigneeRepo.save(asignee);
        return "redirect:/?user=" + userId;
    }
}
