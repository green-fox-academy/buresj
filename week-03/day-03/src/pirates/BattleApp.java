//Create a BattleApp class with a main method
//        Create 2 ships, fill them with pirates
//        Have a battle!

package pirates;

public class BattleApp {

    public static void main(String[] args) {

        Pirate John = new Pirate();
        Pirate Francis = new Pirate();

        Ship darkSkull = new Ship(John);
        Ship deepSea = new Ship(Francis);

        John.drinkSomeRum();
        John.drinkSomeRum();

        Francis.drinkSomeRum();
        Francis.drinkSomeRum();

        darkSkull.fillShip();
        deepSea.fillShip();

        darkSkull.battle(deepSea);

        deepSea.printStatus();
        darkSkull.printStatus();
    }
}
