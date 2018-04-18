package nl.saxion.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import nl.saxion.animals.Cat;

class CatTest {

    @Test
    void nameTest() {
        Cat cat = new Cat("Fred");
        assertEquals(cat.getName(), "Fred");
    }

    @Test
    void badNameTest() {
        Cat cat = new Cat("Fredi");
        assertNotEquals(cat.getName(), "Fred");
    }

    @Test
    void catchMouseTest() throws MouseNotAliveException {
        Cat cat = new Cat("Fred");
        Mouse mouse = new Mouse();
        assertEquals(mouse.getSize(), 10);
        cat.catchMouse(mouse);
        assertEquals(mouse.getSize(), 0);
    }

    @Test
    void catchDeadMouseTest() {
        Cat cat = new Cat("Fred");
        Mouse mouse = new Mouse(0);
        assertThrows(MouseNotAliveException.class, 
        ()->{
            cat.catchMouse(mouse);
        });
    }
}