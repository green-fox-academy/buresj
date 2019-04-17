package animal;

public class Animal {

    int hunger;
    int thirst;
    String name;


    public Animal() {
        this(50, 50);
    }

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void eat() {
        hunger -= 1;
    }

    public void drink() {
        thirst -= 1;
    }

    public void play() {
        hunger += 1;
        thirst += 1;
    }
}