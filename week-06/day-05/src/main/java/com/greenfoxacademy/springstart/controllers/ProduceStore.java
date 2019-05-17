package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.ShopItemStore;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

        model.addAttribute("store", store.mostExpensive());
        return "index";
    }

    @RequestMapping("/store/average-stock")
    public String average(Model model) {

        model.addAttribute("avg", store.averageStock());
        return "resultAvg";
    }

    @RequestMapping("/store/search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("store", store.searchItems(search));
        return "index";
    }
}
