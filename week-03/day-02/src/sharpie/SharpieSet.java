package sharpie;
import java.util.ArrayList;


public class SharpieSet {
    ArrayList<Sharpie> sharpies;


    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public void removeTrash() {

        countUsable();
        ArrayList<Integer> toEmptyBin = new ArrayList<>();

        for (Sharpie sharp : this.sharpies) {

            if (!sharp.usable) {
                toEmptyBin.add(sharpies.indexOf(sharp));
            }
        }
        for (int toEmpty :
                toEmptyBin) {
            sharpies.remove(toEmpty);
        }
    }

    public int countUsable() {

        int count = 0;

        for (Sharpie sharp : this.sharpies) {
            if (sharp.inkAmount > 0) {
                count++;
            } else {
                sharp.usable = false;
            }
        }
        return count;
    }

    public void printAllSharpies() {

        for (Sharpie sharp : this.sharpies) {
            System.out.println("I have " + sharp.color + " sharpie.");
        }
    }
}