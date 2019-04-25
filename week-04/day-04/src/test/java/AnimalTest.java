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
    public void animalCanEat_hungerIsFortyNine() {

        animal.eat();
        assertEquals(49, animal.hunger);
    }
}
