package fox.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

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
    public String handleLogin(RedirectAttributes redirectAttributes, @RequestParam String name) {
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }



}

