package reservations;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy {

    String dow;
    String code;

    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    Character[] nums = {'1', '2', '3', '4', '5', '6', '7', '8'};

    @Override
    public String getDowBooking() {

        List<String> DOW = new ArrayList<>();

        DOW.add("MON");
        DOW.add("TUE");
        DOW.add("WEN");
        DOW.add("THU");
        DOW.add("FRI");
        DOW.add("SAT");
        DOW.add("SUN");

        int chance = (int) (Math.random() * 7);
        dow = DOW.get(chance);
        return dow;
    }

    @Override
    public String getCodeBooking() {

        char[] bookingNum = new char[8];

        for (int i = 0; i < 8; i++) {
            int chance = (int) (Math.random() * i);
            if (i % 2 == 0) {
                bookingNum[i] = alphabet[chance];
            } else {
                bookingNum[i] = nums[chance];
            }
        }

        code = new String(bookingNum);
        return code;

    }
}
