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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private List<Item> items;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        item.addUser(this);
        this.items.add(item);
    }
}
