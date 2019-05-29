package com.greenfox.todomysql.models;

import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.repositories.TodoRepo;
import com.greenfox.todomysql.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Selector {

    private TodoRepo repo;
    private UserRepo userRepo;

    @Autowired
    public Selector (TodoRepo repo, UserRepo userRepo){
        this.repo = repo;
        this.userRepo = userRepo;

    }

    public Selector(){}

    public List<Todo> show (Long userID) {
        List<Todo> todos = new ArrayList<>();
        for (Todo todo :  repo.findAll()) {
            todos.add(todo);
        }

        return todos.stream()
                .filter(todo -> todo.getUserId() == userID)
                .collect(Collectors.toList());
    }

    public long userId (User user) {
        List<User> users = new ArrayList<>();
        for (User use :  userRepo.findAll()) {
            users.add(use);
        }

        User selected = users
                .stream()
                .filter(u -> u.getName().equals(user.getName()))
                .findAny()
                .orElse(null);

        if(selected != null) {
            return selected.getId();
        }
        return 0L;
    }
}
