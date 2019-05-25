package main.java.animals;

public class Reptile extends Animal {

    String reproduction = "laying eggs";

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return reproduction;
    }
}
