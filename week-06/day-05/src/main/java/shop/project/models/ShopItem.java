package shop.project.models;

public class ShopItem {

    String name;
    String description;
    int price;
    int quantityOfStock;

    public ShopItem(String name, String description, int price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }
}


