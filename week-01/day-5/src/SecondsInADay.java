// int hoursInDay = 24;
// int minutesInHour = 60;
// int secondsInMinute = 42;
// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by the variables

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        currentHours -= 24;
        currentMinutes -= 60;
        currentSeconds -= 60;

        System.out.println(currentSeconds);

        System.out.println((currentSeconds *= -1) + (-3600 * currentHours) + (-60 * currentMinutes));
        System.out.println(currentSeconds);
    }
}
