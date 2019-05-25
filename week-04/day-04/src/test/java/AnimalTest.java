import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void hasHungerAndThirst_HungerAndThirstEqualsFifty() {
        boolean result = false;
        if (animal.hunger == 50 && animal.thirst == 50) {
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void animalEats_hungerIsFortyNine() {
        animal.eat();
        assertEquals(49, animal.hunger);
    }

    @Test
    public void animalDrinks_thirstIsFortyNine() {
        animal.drink();
        assertEquals(49, animal.thirst);
    }

    @Test
    public void animalPlays_thirstAndHungerIncreases() {
        boolean result = false;
        animal.play();
        animal.play();
        animal.play();

        if (animal.hunger > 50 && animal.thirst > 50) {
            result = true;
        }
        assertTrue(result);
    }
}
