package com.greenfox.todomysql;

import com.greenfox.todomysql.entities.Assignee;
import com.greenfox.todomysql.entities.Todo;
import com.greenfox.todomysql.repositories.AsigneeRepo;
import com.greenfox.todomysql.repositories.TodoRepo;
import com.greenfox.todomysql.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepo repo;

    @Autowired
    AsigneeRepo asRepo;

    @Autowired
    UserRepo userRepo;


    public static void main(String[] args) {
        SpringApplication.run(TodoMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Assignee assignee = new Assignee("John", "email");
        Todo todo1 = new Todo("a");
        Todo todo2 = new Todo("b");

        assignee.addTodo(todo1);
        assignee.addTodo(todo2);

        asRepo.save(assignee);
    }
}
