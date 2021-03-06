package day3.excercise;

import day3.excercise.models.MyColor;
import day3.excercise.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcerciseApplication implements CommandLineRunner {

    @Autowired
    private Printer printer;

    @Autowired
    private MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(ExcerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hi");
        myColor.printColor();
    }
}
