package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ShopItem;
import com.greenfoxacademy.springstart.models.ShopItemStore;
import org.apache.catalina.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProduceStore {

    @RequestMapping("/store")
    public String produceStore(Model model) {

        ShopItemStore store = new ShopItemStore();

        model.addAttribute("store", store.getAll());

        return "index";
    }

}
