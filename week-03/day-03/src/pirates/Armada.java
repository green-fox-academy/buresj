//Create an Armada class
//Contains Ship-s as a list
//        Have a armada.war(otherArmada) method where two armada can engage in war
//        it should work like merge sort
//        first ship from the first armada battles the first of the other
//        the loser gets skipped so the next ship comes in play from that armada
//        whichever armada gets to the end of its ships loses the war
//        return true if this is the winner


package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> fleet;

    public Armada () {
        this.fleet = new ArrayList<>();
    }

    public boolean war(Armada otherArmada) {
        
    }
}
