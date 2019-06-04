package com.greenfox.frontend.models;

public class Greeting {

    private String name;
    private String title;
    private String greeting;

    public Greeting(){}

    public Greeting(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String greet() {
        return name + title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
