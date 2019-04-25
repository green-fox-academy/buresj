package reservations;

public class Reservation implements Reservationy {

    String dow;
    String code;

    private final String[] week = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};

    private final Character[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    
    @Override
    public String getDowBooking() {

        dow = week[(int) (Math.random() * week.length)];
        return dow;
    }

    @Override
    public String getCodeBooking() {

        char[] bookingNum = new char[8];

        for (int i = 0; i < bookingNum.length; i++) {
            bookingNum[i] = chars[(int) (Math.random() * chars.length)];
        }
        code = new String(bookingNum);
        return code;
    }
}
