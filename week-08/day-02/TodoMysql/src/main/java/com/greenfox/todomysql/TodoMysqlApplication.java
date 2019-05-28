package com.greenfox.todomysql;

import com.greenfox.todomysql.models.Todo;
import com.greenfox.todomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMysqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(TodoMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        repo.save(new Todo("Do stuff!", true, false));
//        repo.save(new Todo("Do more stuff!", false, true ));
    }
}
