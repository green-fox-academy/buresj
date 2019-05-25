package com.test.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    //Teaching material // not runnable as whole


    // http://localhost:8080/ > it shows white page
    // http://localhost:8080/?name=HelloWorld > it shows HelloWorld on the page
    @GetMapping("/")
    public String getName(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("text", name);
        return "index";
    }

    // http://localhost:8080/age > it shows whitelabel page error because (required = false) is not written and
    // http://localhost:8080/age?age=44 > it shows 44 on the page
    // first "age" corresponds to @GetMapping("/age"}, second "age" corresponds to @RequestParam String age
    @GetMapping("/age")
    public String getAge(Model model, @RequestParam String age) {
        model.addAttribute("text", age);
        return "index";
    }

    //http://localhost:8080/sum/?x=1&y=1 > it displays 2
    //http://localhost:8080/sum/?x=a&y=a > it shows error
    //we can imagine as address in browser as a command line, controllers set up what should happen
    //we are connecting more parameters with & sign
    @GetMapping("/sum")
    public String sum(Model model, @RequestParam int y, @RequestParam int x) {
        model.addAttribute("text", x + y);
        return "index";
    }

    // http://localhost:8080/name > goes back to http://localhost:8080/
    // as return we write name of html file
    // in case of "redirect:" we write another endpoint
    @GetMapping("/home")
    public String homePage() {
        return "redirect:/";
    }

    //http://localhost:8080/form > it show form (look to form.html)
    //when we write something (Fox) and push button it changes to http://localhost:8080/form?name=fox
    // condition if (name != null) is inserted because when the page is first opened name is null (it waits for input form),
    // in this way it shows different text for http://localhost:8080/form (Please write your name)
    // than for  http://localhost:8080/form?name=Fox (Thank you Fox!)
    @GetMapping("/form")
    public String introduction(Model model, @RequestParam(required = false) String name) {

        String response = name != null ? "Thank you " + name + "!" :
                "Please, write your name";
        model.addAttribute("text", response);

        return "form";
    }

    //http://localhost:8080/form > will show input form
    //when we write something to input field and push button it will show on the page
    //HOWEVER address stays as http://localhost:8080/form
    //@RequestParam "name" is taken from (method="post") but it does not show in the url
    @GetMapping("/form")
    public String openForm(Model model) {
        model.addAttribute("text", "Please write your name");
        return "form";
    }

    @PostMapping("/form")
    public String showText(Model model, @RequestParam("name") String name) {
        model.addAttribute("text", "Thank you " + name + "!");
        return "form";
    }

    //http://localhost:8080/form > it show form
    //when the form is submitted the field "name" is changed
    //at the same time we are redirected to http://localhost:8080/
    //and here it show name which we have submitted in the form

    private String name;

    @GetMapping("/form")
    public String openForm() {
        return "form";
    }

    @PostMapping("/form")
    public String showText(@RequestParam String name) {
        this.name = name;
        return "redirect:/";
    }

    @GetMapping("/")
    public String test(Model model) {
        model.addAttribute("text", name);
        return "index";
    }
}