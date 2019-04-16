package petrolstation;

public class Station {

    int gasAmount;

    public Station() {
        this.gasAmount = 1000;
    }

    public void refill(Car car) {

        this.gasAmount -= car.capacity;
        car.gasAmount = 100;
    }
}
