package com.greenfox.tables;

import com.greenfox.tables.entities.Item;
import com.greenfox.tables.entities.User;
import com.greenfox.tables.repositories.ItemRepo;
import com.greenfox.tables.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TablesApplication implements CommandLineRunner {

    private UserRepo userRepo;
    private ItemRepo itemRepo;

    @Autowired
    public TablesApplication(UserRepo userRepo, ItemRepo itemRepo) {
        this.userRepo = userRepo;
        this.itemRepo = itemRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TablesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        User userOne = new User("John", "john@gmail.com");
        User userTwo = new User("John", "john@gmail.com");

        Item itemOne = new Item("screwdriver", 100);
        Item itemTwo = new Item("table", 440);

        userOne.addItem(itemOne);
        userOne.addItem(itemTwo);

        userTwo.addItem(itemOne);
        userTwo.addItem(itemTwo);

        userRepo.save(userOne);
        userRepo.save(userTwo);

    }
}
