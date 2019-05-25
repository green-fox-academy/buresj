package com.greenfoxacademy.springstart.models;

import org.springframework.stereotype.Controller;

import java.awt.image.ShortLookupTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopItemStore {

    List<ShopItem> store;

    public ShopItemStore() {
        store = new ArrayList<>();

        store.add(new ShopItem("Running shoes", "Running nike schoes", 1000, 5));
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
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList());

        return avalaibleItems;
    }

    public List<ShopItem> cheapestFirst() {
        return store.stream()
                .sorted(Comparator.comparingInt(ShopItem::getPrice))
                .collect(Collectors.toList());

    }

    public List<ShopItem> mostExpensive() {

        Comparator<ShopItem> comparator = Comparator.comparing(ShopItem::getPrice);
        List<ShopItem> expensiveItem = new ArrayList<>();
        ShopItem expensive = store.stream().max(comparator).get();
        expensiveItem.add(expensive);

        return expensiveItem;
    }

    public List<ShopItem> containsNike() {
        List<ShopItem> nikedList = store.stream()
                .filter(i -> i.getDescription().contains("nike"))
                .collect(Collectors.toList());

        return nikedList;
    }

    public double averageStock() {
        return store.stream()
                .mapToDouble(i -> i.getQuantityOfStock())
                .average()
                .getAsDouble();
    }

    public List<ShopItem> searchItems(String searchInput) {
        return store.stream()
                .filter(i -> i.getDescription().contains(searchInput) || i.getName().contains(searchInput))
                .collect(Collectors.toList());
    }
}
