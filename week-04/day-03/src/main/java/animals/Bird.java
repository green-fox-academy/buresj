package main.java.animals;

public class Bird extends Animal {

    String reproduction = "laying eggs";

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return reproduction;
    }
}
