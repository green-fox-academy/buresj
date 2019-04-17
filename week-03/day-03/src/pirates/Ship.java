package pirates;

//Create a Ship class.
//        The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//        When a ship is created it doesn't have a crew or a captain.
//        The ship can be filled with pirates and a captain via fillShip() method.
//        Filling the ship with a captain and random number of pirates.
//        Ships should be represented in a nice way on command line including information about
//        captains consumed rum, state (passed out / died)
//        number of alive pirates in the crew
//        Ships should have a method to battle other ships: ship.battle(otherShip)
//        should return true if the actual ship (this) wins
//        the ship should win if its calculated score is higher
//        calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//        The loser crew has a random number of losses (deaths).
//        The winner captain and crew has a party, including a random number of rum :)

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crew;
    Pirate captain;
    int drukness;
    int alive;
    int passedOut;
    int parrots;
    boolean win = false;

    public Ship(Pirate captain) {
        this.crew = new ArrayList<>();
        this.captain = captain;
    }

    public void fillShip() {

        int num = (int) (Math.random() * 10);

        for (int i = 0; i < num; i++) {
            Pirate pirate = new Pirate();
            crew.add(pirate);
        }
    }

    public int status() {

        int score;

        for (Pirate pirate : crew) {
            drukness += pirate.drunkness;

            if (pirate.alive) {
                alive += 1;
            }
            if (pirate.passedOut) {
                passedOut += 1;
            }
            if (pirate.parrot) {
                parrots += 1;
            }
        }
        score = drukness + alive + passedOut + parrots;
        return score;
    }

    public void printStatus() {

        System.out.println("-----------------------------------------------------");
        System.out.println("Captain has drunked " + captain.drunkness + " rums.");
        System.out.println("The crew has " + crew.size() + " pirates.");
        System.out.println("There is " + alive + " alive pirates.");
        System.out.println("There is " + passedOut + " passed out pirates.");
        System.out.println("Pirates have " + parrots + " parrots");
    }

    public void battle(Ship otherShip) {

        int scoreThis = this.status();
        int scoreOther = otherShip.status();
        int dead = 0;

        if (scoreOther > scoreThis) {
            otherShip.parrots = 5;
            captain.drinkSomeRum();

            for (int i = 0; i < this.crew.size(); i++) {
                int deathRoll = (int) (Math.random() * 10);
                if (deathRoll < 4) {
                    this.crew.remove(i);
                    dead++;
                    System.out.println(dead);
                }
            }
        } else if (scoreThis > scoreOther) {
            otherShip.parrots = 5;
            captain.drinkSomeRum();

            for (int i = 0; i < otherShip.crew.size(); i++) {
                int deathRoll = (int) (Math.random() * 10);
                if (deathRoll < 4) {
                    otherShip.crew.remove(i);
                    dead++;
                    System.out.println(dead);
                }
            }
        }
    }
}

