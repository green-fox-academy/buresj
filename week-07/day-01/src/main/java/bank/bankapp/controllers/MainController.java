package bank.bankapp.controllers;

import bank.bankapp.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    List<BankAccount> accounts;

    public MainController() {
        this.accounts = new ArrayList<>(Arrays.asList(
                new BankAccount(1, "Simba", 2430.00d, "lion", "good"),
                new BankAccount(2, "Scar", 975743.06d, "lion", "bad", true),
                new BankAccount(3, "Pumba", 5453.00d, "warthog", "good"),
                new BankAccount(4, "Timon", 766.00d, "meerkat ", "good"),
                new BankAccount(5, "Rafiki", 1.43d, "baboon", "good")));
    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("accounts", accounts);
        model.addAttribute("newAccount", new BankAccount());
        return "index";
    }

    @RequestMapping(path = "/inception", method = RequestMethod.GET)
    public String HTMLception(Model model) {
        String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", text);
        model.addAttribute("newAccount", new BankAccount());
        return "inception";
    }

    @PostMapping("/add")
    public String addAcc(@ModelAttribute BankAccount account, Model model) {
        model.addAttribute("newAccount", account);
        accounts.add(account);
        model.addAttribute("accounts", accounts);
        return "index";
    }
}
