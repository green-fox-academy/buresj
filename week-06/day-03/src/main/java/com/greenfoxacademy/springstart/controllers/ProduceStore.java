package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ShopItem;
import com.greenfoxacademy.springstart.models.ShopItemStore;
import org.apache.catalina.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProduceStore {

    ShopItemStore store = new ShopItemStore();

    @RequestMapping("/store")
    public String produce(Model model) {

        model.addAttribute("store", store.getAll());
        return "index";
    }

    @RequestMapping("/store/cheapest-first")
    public String cheapest(Model model) {

        model.addAttribute("store", store.cheapestFirst());
        return "index";
    }

    @RequestMapping("/store/only-available")
    public String produceStore(Model model) {

        model.addAttribute("store", store.avalaible());
        return "index";
    }

    @RequestMapping("/store/nike")
    public String nikeInStore(Model model) {

        model.addAttribute("store", store.containsNike());
        return "index";
    }

    @RequestMapping("/store/most-expensive")
    public String expensiveFirst(Model model) {

        model.addAttribute("store", store.expensiveFirst());
        return "index";
    }

    @RequestMapping("/store/average-stock")
    public String average(Model model) {

        model.addAttribute("avarage", store.averageStock());
        return "index";
    }
}
