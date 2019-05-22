package com.gfa.classapp.Controllers;

import com.gfa.classapp.Services.StudentServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private StudentServiceProvider provider1;
    private StudentServiceProvider provider2;

    @Autowired
    public MainController(@Qualifier("list") StudentServiceProvider provider1,
                          @Qualifier("IO") StudentServiceProvider provider2){
        this.provider1= provider1;
        this.provider2= provider2;
    }

    @RequestMapping("/gfa")
    public String show(Model model) {
        model.addAttribute("count",provider2.count());
        return "index";
    }

    @RequestMapping("/gfa/list")
    public String list(Model model) {
        model.addAttribute("students", provider2.findAll());
        return "list";
    }

    @RequestMapping("/gfa/add")
    public String addBookForm(@RequestParam(required = false) String name) {
        provider2.save(name);
        return "form";
    }

    @RequestMapping("/gfa/check")
    public String checker(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("result", provider2.checker(name));
        return "checker";
    }
}
