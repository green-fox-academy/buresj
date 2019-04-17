//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//                it has slots which defines the number of free places for animals
//        breed() -> creates a new animal if there's place for it
//        slaughter() -> removes the least hungry animal


package animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Farm {

    int farm;
    List<Animal> animals;


    public Farm(int farm) {

        this.farm = farm;
        this.animals = new ArrayList<>(farm);
    }

    public void breed(Animal animal) {

        if (farm >= 1) {
            animals.add(animal);
            farm -= 1 ;
        }
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
    }

    public void slaughter() {

        animals.sort(Comparator.comparing(Animal::getHunger));
        animals.remove(animals.size() - 1);
    }
}
