package sharpie;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpieBlue = new Sharpie("Blue", 10);
        Sharpie sharpieGreen = new Sharpie("Green", 5);
        Sharpie sharpieBlack = new Sharpie("Black", 10);

        sharpieBlue.use();

        System.out.println(sharpieBlue.inkAmount);

        SharpieSet sharpies = new SharpieSet();

        sharpies.add(sharpieBlue);
        sharpies.add(sharpieGreen);
        sharpies.add(sharpieBlack);

        sharpies.printAllSharpies();

        sharpieBlue.use();
        sharpieBlue.use();
        sharpieBlue.use();

        System.out.println(sharpies.countUsable());

        sharpies.removeTrash();
        sharpies.printAllSharpies();

        sharpieBlack.use();
        sharpieBlack.use();
        sharpieBlack.use();

        sharpies.removeTrash();
        sharpies.printAllSharpies();
    }
}
