package bank.bankapp.controllers;

import bank.bankapp.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    List<BankAccount> accounts = new ArrayList<>();

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String show(Model model){
        accounts.add(new BankAccount("Simba", 2000, "lion"));
        model.addAttribute("accounts", accounts);
        return "index";
    }
}
