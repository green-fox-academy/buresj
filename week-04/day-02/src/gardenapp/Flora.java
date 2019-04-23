package gardenapp;

public class Flora {
    String color;
    String type;
    double waterAmount;
    boolean needsWater;


    public Flora() {
    }


    public Flora(String color, String type, int waterAmount) {
        this.color = color;
        this.waterAmount = waterAmount;
        this.type = type;
        needsWater = true;
    }


    public void watering(double water) {

        if (this.type.equals("tree")) {
            waterAmount += (water / 100) * 40;
        }

        if (this.type.equals("flower")) {
            waterAmount += (water / 100) * 75;
        }
    }

    @Override
    public String toString() {

        if (waterAmount < 20) {
            return "The " + color + " " + type + " needs water \n" + waterAmount;
        } else {
            return "The " + color + " " + type + " doesnt need water \n" + waterAmount;
        }
    }
}
