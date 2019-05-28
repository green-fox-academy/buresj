package fox.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

    String name;

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
        this.name = name;
        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }

    @GetMapping("/nutrition")
    public String nutrition(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "nutrition";
    }

    @GetMapping("/redirect-nutrition")
    public RedirectView redirect () {
        RedirectView redirectView = new RedirectView();
        redirectView.setContextRelative(true);
        redirectView.setUrl("/nutrition?name=" + name);
        return redirectView;
    }
}

