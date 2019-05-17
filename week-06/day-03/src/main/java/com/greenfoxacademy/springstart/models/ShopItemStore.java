package com.greenfoxacademy.springstart.models;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopItemStore {

    List<ShopItem> store;

    public ShopItemStore() {
        store = new ArrayList<>();

        store.add(new ShopItem("Running shoes", "Nike running schoes", 1000, 5));
        store.add(new ShopItem("Printer", "Some HP printer", 3000, 2));
        store.add(new ShopItem("Coca Cola", "0,5 l standard coke", 25, 0));
        store.add(new ShopItem("Wokin", "Fried chicken", 119, 100));
        store.add(new ShopItem("T-shirt", "Blue with corgi", 300, 1));
    }

    public List<ShopItem> getAll() {

        List<ShopItem> allItems = store.stream().collect(Collectors.toList());

        return allItems;
    }

    public List<ShopItem> avalaible() {

        List<ShopItem> avalaibleItems = store.stream()
                .filter(i -> i.getPrice() > 0)
                .collect(Collectors.toList());

        return avalaibleItems;
    }
}
