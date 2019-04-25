package reservations;

public class Main {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    String.format("Booking### %1s for %2s",
                    reservation.getCodeBooking(),
                    reservation.getDowBooking()));
        }
    }
}
