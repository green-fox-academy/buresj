// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        System.out.println(collectsIPs("log.txt"));
        System.out.println(printRequestRatio("log.txt"));
    }

    public static List<String> collectsIPs(String logFile) {

        Path pathOne = Paths.get("assets/" + logFile);
        List<String> lines = new ArrayList<>();
        List<String> ipList = new ArrayList<>();

        try {
            lines = Files.readAllLines(pathOne);
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }

        for (String line : lines) {
            ipList.add(line.substring(27, 38));
        }

        return ipList;
    }

    public static double printRequestRatio(String logFile) {

        double counter = 0;
        double size = 0;

        Path pathOne = Paths.get("assets/" + logFile);
        List<String> lines = new ArrayList<>();
        List<String> requestList = new ArrayList<>();

        try {
            lines = Files.readAllLines(pathOne);
        } catch (Exception e) {
            System.out.println("Unable to reach a file.");
        }

        for (String line : lines) {
            requestList.add(line.substring(41, 44));
        }

        for (String line : requestList) {
            if (line.contains("GET")) {
                counter++;
            }
            size++;
        }
        return size / counter;
    }
}
