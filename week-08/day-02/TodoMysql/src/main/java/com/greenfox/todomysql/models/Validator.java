package com.greenfox.todomysql.models;

import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.repositories.TodoRepo;
import com.greenfox.todomysql.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Validator {

    private TodoRepo repo;
    private UserRepo userRepo;

    @Autowired
    public Validator(TodoRepo repo, UserRepo userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    public Validator() {
    }

    public boolean test(User user) {
        List<User> users = new ArrayList<>();
        for (User use : userRepo.findAll()) {
            users.add(use);
        }

        Predicate<User> nam = u -> u.getName().equals(user.getName());
        Predicate<User> psw = u -> u.getName().equals(user.getPassword());
        return users.stream().anyMatch(nam) && users.stream().anyMatch(psw);
    }
}
