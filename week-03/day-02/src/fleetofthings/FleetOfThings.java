package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing thingOne = new Thing("Get milk");
        Thing thingTwo = new Thing("Remove obstacle");
        Thing thingThree = new Thing("Stand up");
        Thing thingFour = new Thing("Eat lunch");

        fleet.add(thingOne);
        fleet.add(thingTwo);
        fleet.add(thingThree);
        fleet.add(thingFour);

        thingThree.complete();
        thingFour.complete();

        System.out.println(fleet);
    }
}