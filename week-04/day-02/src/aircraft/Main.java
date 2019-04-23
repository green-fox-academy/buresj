package aircraft;

public class Main {
    public static void main(String[] args) {

        Aircraft aircraftOne = new Aircraft("F16");
        Aircraft aircraftTwo = new Aircraft("F16");
        Aircraft aircraftThree = new Aircraft("F35");
        Aircraft aircraftFour = new Aircraft("F53");

        Aircraft aircraftFive = new Aircraft("F16");
        Aircraft aircraftSix = new Aircraft("F16");
        Aircraft aircraftSeven = new Aircraft("F35");
        Aircraft aircraftEight = new Aircraft("F53");

        Carrier carrierOne = new Carrier(500);
        Carrier carrierTwo = new Carrier(500);

        carrierOne.add(aircraftOne);
        carrierOne.add(aircraftTwo);
        carrierOne.add(aircraftThree);
        carrierOne.add(aircraftFour);

        carrierTwo.add(aircraftFive);
        carrierTwo.add(aircraftSix);
        carrierTwo.add(aircraftSeven);
        carrierTwo.add(aircraftEight);

        carrierOne.fill();
        carrierTwo.fill();

        carrierOne.fight(carrierTwo);
        carrierOne.fight(carrierTwo);
        carrierOne.fight(carrierTwo);
        carrierOne.fight(carrierTwo);
        carrierOne.fight(carrierTwo);
        carrierOne.fight(carrierTwo);

        carrierOne.getStatus();
        carrierTwo.getStatus();
    }
}
