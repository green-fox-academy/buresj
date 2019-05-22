package com.gfa.classapp.Controllers;

import com.gfa.classapp.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

   private StudentService studentService;

    @Autowired
    public MainController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/gfa")
    public String show() {
        return "index";
    }

    @RequestMapping("/gfa/list")
    public String list(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "list";
    }

    @RequestMapping("/gfa/add")
    public String addBookForm(@RequestParam(required = false) String name) {
        studentService.save(name);
        return "form";
    }
}
