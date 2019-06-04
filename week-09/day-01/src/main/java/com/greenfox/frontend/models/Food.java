package com.greenfox.frontend.models;

import java.sql.Date;

@Entity
public class Food {

    @Id
    @Generated
    private int id;
    private String name;
    private int amount;
    private Date addedAt;

    public Food(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
