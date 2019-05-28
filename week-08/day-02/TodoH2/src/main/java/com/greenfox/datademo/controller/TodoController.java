package com.greenfox.datademo.controller;
import com.greenfox.datademo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {


    TodoRepo repo;


    @Autowired
    public TodoController(TodoRepo repo){
        this.repo = repo;

    }


    @GetMapping(path = "/")
    public String list(Model model) {

        model.addAttribute("todos", repo.findAll());
        return "index";
    }


}
