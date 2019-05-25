package main.java.animals;

public class Mammal extends Animal {

    String reproduction = "giving birth";

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {

        return reproduction;
    }
}
