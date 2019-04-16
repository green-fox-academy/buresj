package sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpieTest = new Sharpie("Blue", 10);

        sharpieTest.use();
        sharpieTest.use();
        sharpieTest.use();
        sharpieTest.use();
        sharpieTest.use();

        System.out.println(sharpieTest.inkAmount);
    }
}
