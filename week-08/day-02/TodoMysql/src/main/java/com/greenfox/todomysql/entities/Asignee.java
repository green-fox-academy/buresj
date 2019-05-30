package com.greenfox.todomysql.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Asignee {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String email;

    @OneToOne
    private Todo todo;

    public Asignee(){};

    public Asignee(String name, String email, Todo todo) {
        this.name = name;
        this.email = email;
        this.todo = todo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Todo getTodo() {
        return todo;
    }

    public void setTodo(Todo todo) {
        this.todo = todo;
    }
}
