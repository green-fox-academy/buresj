package bank.bankapp.controllers;

import bank.bankapp.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    List<BankAccount> accounts = Arrays.asList(
            new BankAccount("Simba", 2000.00d, "lion"),
            new BankAccount("Scar", 5000.00d, "lion"));

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("accounts", accounts);
        return "index";
    }

    @RequestMapping(path ="/inception", method = RequestMethod.GET)
    public String HTMLception(Model model) {

        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", text);
        return "inception";
    }
}
