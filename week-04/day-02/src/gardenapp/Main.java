package gardenapp;

public class Main {
    public static void main(String[] args) {
        Garden eden = new Garden();

        eden.show();
        eden.watering(40);
        eden.show();
        eden.watering(70);
        eden.show();
        eden.watering(40);
        eden.show();

    }
}
