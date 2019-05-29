package com.greenfox.todomysql.models;

import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Selector {

    private TodoRepo repo;

    @Autowired
    public Selector (TodoRepo repo){
        this.repo = repo;

    }

//    public List<Todo> show (User user) {
//
//
//    }
}
