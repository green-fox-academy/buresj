package reservations;

public class Main {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();

        reservation.getCodeBooking();
        reservation.getDowBooking();

        String str = new String.format("Booking### %s", reservation.getCodeBooking());
        System.out.println(str);
    }
}
