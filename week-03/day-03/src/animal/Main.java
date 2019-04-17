package animal;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm(5);

        Animal pig = new Animal("pig");
        Animal cow = new Animal("cow");
        Animal duck = new Animal("duck");

        farm.breed(pig);
        farm.breed(duck);
        farm.breed(cow);
        farm.breed(cow);
        farm.breed(cow);
        farm.breed(cow);
        farm.breed(cow);
        farm.breed(cow);

        duck.play();
        duck.play();
        duck.play();
        duck.play();

        farm.slaughter();
        farm.printAnimals();
    }
}