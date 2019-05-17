package shop.project.models;

import java.util.ArrayList;
import java.util.List;

public class ShopItemStore {

    List<ShopItem> store;

    public ShopItemStore() {
        store = new ArrayList<>();
    }

    public void add(ShopItem item) {
        store.add(item);
    }

    public ShopItem get(int index) {
        return store.get(index);
    }

    public String getName(ShopItem shopItem) {
        return shopItem.name;
    }

    public String getDescription(ShopItem shopItem) {
        return shopItem.description;
    }
    public int getPrice(ShopItem shopItem) {
        return shopItem.price;
    }
    public int getStock (ShopItem shopItem) {
        return shopItem.quantityOfStock;
    }
}
