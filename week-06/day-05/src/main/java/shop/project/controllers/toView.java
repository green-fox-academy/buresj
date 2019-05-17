package shop.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shop.project.models.ShopItem;
import shop.project.models.ShopItemStore;

@Controller
public class toView {

    @RequestMapping("/store")
    public String produceStore(Model model) {

        ShopItemStore store = new ShopItemStore();

        store.add(new ShopItem("Nike","Some schoes", 100, 4));
        store.add(new ShopItem("Addidas","Some schoes", 100, 4));
        store.add(new ShopItem("Nike","Some schoes", 100, 4));
        store.add(new ShopItem("Nike","Some schoes", 100, 4));

        model.addAttribute("one", store.getName(store.get(1)));

        return "index";
    }
}
