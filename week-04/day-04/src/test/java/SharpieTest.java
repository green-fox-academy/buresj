import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SharpieTest {

    @Test
    public void enterColorString_sharpieHasColor() {
        String color = "blue";
        Sharpie sharpie = new Sharpie(color, 3);

        assertEquals(color, sharpie.color);
    }

    @Test
    public void enterWidthFloat_sharpieHasWidth() {
        float width = 43.0f;
        Sharpie sharpie = new Sharpie("blue", width);

        assertEquals(width, sharpie.width);
    }

    @Test
    public void sharpieHasInkAmountOnInit_getInkAmount() {

        int ink = 100;
        Sharpie sharpie = new Sharpie("blue", 3);

        assertEquals(ink, sharpie.inkAmount);
    }

    @Test
    public void sharpieIsUsableOnInit_getTrue() {

        Sharpie sharpie = new Sharpie("blue", 3);

        assertEquals(true, sharpie.usable);
    }


    @Test
    public void sharpieIsDecreasesInk_getTrueIfDecreases() {

        boolean result = false;

        Sharpie sharpie = new Sharpie("blue", 3);

        sharpie.use();
        sharpie.use();

        if (sharpie.inkAmount == 0) {
            result = true;
        }

        assertEquals(true, result);
    }
}
