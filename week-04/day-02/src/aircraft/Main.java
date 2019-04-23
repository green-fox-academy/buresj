package aircraft;

public class Main {
    public static void main(String[] args) {

        Aircraft aircraftOne = new Aircraft("F16");
        Aircraft aircraftTwo = new Aircraft("F16");
        Aircraft aircraftThree = new Aircraft("F35");
        Aircraft aircraftFour = new Aircraft("F53");

        Carrier carrierOne = new Carrier(500);

        carrierOne.add(aircraftOne);
        carrierOne.add(aircraftTwo);
        carrierOne.add(aircraftThree);
        carrierOne.add(aircraftFour);

        carrierOne.fill();

        carrierOne.getStatus();

    }
}
