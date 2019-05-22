package day3.excercise;

import day3.excercise.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcerciseApplication implements CommandLineRunner {

    @Autowired
    private Printer printer;

    public static void main(String[] args) {
        SpringApplication.run(ExcerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hi");
    }

}
