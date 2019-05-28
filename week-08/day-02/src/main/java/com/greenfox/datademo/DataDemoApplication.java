package com.greenfox.datademo;

import com.greenfox.datademo.models.Todo;
import com.greenfox.datademo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataDemoApplication implements CommandLineRunner {

    @Autowired
    TodoRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(DataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repo.save(new Todo("Do stuff!"));
        repo.save(new Todo("Do more stuff!"));

    }
}
