package pirates;

//        Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//        drinkSomeRum() - intoxicates the Pirate some
//        howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//        0 to 4 times, "Pour me anudder!"
//        else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//        If you manage to get this far, then you can try to do the following.
//
//        die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//        brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//        And... if you get that far...
//
//        Add a parrot.


public class Pirate {

    int drunkness = 0;
    boolean alive = true;
    boolean passedOut = false;
    boolean parrot = false;

    public void drinkSomeRum() {
        drunkness++;
    }

    public void howsItGoingMate() {
        if (alive && drunkness <= 4) {
            System.out.println("Pour me anudder!");
        } else if (alive) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
            drunkness = 0;
        } else {
            System.out.println("He's dead.");
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate pirate) {

        if (!pirate.passedOut && alive) {

            double chance = Math.random();

            if (chance < 0.33) {
                die();
            } else if (chance > 0.33 && chance < 0.66) {
                pirate.die();
            } else {
                this.passedOut = true;
                pirate.passedOut = true;
            }
        }
    }

    public void setParrot() {
        parrot = true;
    }
}
