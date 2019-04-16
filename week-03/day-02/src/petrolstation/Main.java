package petrolstation;

public class Main {
    public static void main(String[] args) {

        Station stationOne = new Station();
        Car carOne = new Car();

        stationOne.refill(carOne);
        stationOne.refill(carOne);
        stationOne.refill(carOne);
        stationOne.refill(carOne);

        System.out.println(stationOne.gasAmount);

    }
}
