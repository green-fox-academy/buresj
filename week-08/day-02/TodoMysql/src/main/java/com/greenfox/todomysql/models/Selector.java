package com.greenfox.todomysql.models;

import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Selector {

    private TodoRepo repo;

    @Autowired
    public Selector (TodoRepo repo){
        this.repo = repo;

    }

    public List<Todo> show (Long userID) {
        List<Todo> todos = new ArrayList<>();
        for (Todo todo :  repo.findAll()) {
            todos.add(todo);
        }

        return todos.stream()
                .filter(todo -> todo.getUserId() == userID)
                .collect(Collectors.toList());
    }

    public List<User> userId (User user) {
        List<User> users = new ArrayList<>();
        for (User use :  userRepo.findAll()) {
            users.add(use);
        }
        return users;
    }
}
