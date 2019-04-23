package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier extends Aircraft {

    int ammoStore;
    int hp = 5000;
    List<Aircraft> aircrafts;

    public Carrier(int ammoStore) {
        super();
        this.ammoStore = ammoStore;
        this.aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() {

        int need = 0;
        for (Aircraft aircraft : aircrafts) {
            need += aircraft.getToFill();
        }

        for (Aircraft aircraft : aircrafts) {
            if (need > ammoStore) {
                if (aircraft.priority) {
                    int all = ammoStore;
                    ammoStore = aircraft.refill(ammoStore);
                    aircraft.refill(all);
                }
            } else {
                int all = ammoStore;
                ammoStore = aircraft.refill(ammoStore);
                aircraft.refill(all);
            }
        }
    }

    public int fight(Carrier anotherCarrier) {

        hp -= anotherCarrier.getTotalDamage();
        return hp;

    }


    public int getTotalDamage() {

        int totalDamage = 0;

        for (Aircraft aircraft : aircrafts) {
            int damage = aircraft.baseDamage * aircraft.ammo;
            totalDamage += damage;
        }

        return totalDamage;
    }

    public void getStatus() {

        System.out.println("HP: " + hp + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammoStore + ", Total damage: " + getTotalDamage());
        for (Aircraft aircraft : aircrafts) {
            System.out.println("Type: " + aircraft.type + ", Ammo: " + aircraft.ammo + ", Base damage: " + aircraft.baseDamage + ", All damage: " + aircraft.getDealtDamage());
        }
    }
}


