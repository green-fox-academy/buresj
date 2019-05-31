package com.greenfox.reddit.models;

import com.greenfox.reddit.entities.User;
import com.greenfox.reddit.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Validator {

    private UserRepo repo;

    @Autowired
    public Validator(UserRepo repo) {
        this.repo = repo;
    }

    public boolean test(User user) {
        List<User> users = new ArrayList<>();
        for (User use : repo.findAll()) {
            users.add(use);
        }
        Predicate<User> nam = u -> u.getUsername().equals(user.getUsername());
        Predicate<User> psw = u -> u.getUsername().equals(user.getPassword());
        return users.stream().anyMatch(nam) && users.stream().anyMatch(psw);
    }
}
