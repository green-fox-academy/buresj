package day3.excercise.models;
import day3.excercise.models.MyColor;
import org.springframework.beans.factory.annotation.Qualifier;

public class BlueColor implements MyColor {

    @Override
    @Qualifier("blue")
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}
