package com.greenfox.tables.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private int price;


    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> users;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
