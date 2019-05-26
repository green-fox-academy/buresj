package fox.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final String URL = "?name=";
    private String fox;

    @GetMapping("/")
    public String main(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String name) {
        fox = name;
        return "redirect:/" + URL + fox;
    }

    @GetMapping("/nav")
    public String nutrition() {
        return "redirect:/nutrition" + URL + fox;
    }

    @GetMapping("/nutrition")
    public String nut(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "nutrition";
    }

}

