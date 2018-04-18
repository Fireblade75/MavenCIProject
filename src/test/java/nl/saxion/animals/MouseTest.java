package nl.saxion.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import nl.saxion.animals.Cat;

class MouseTest {

    @Test
    void sizeTest() {
        Mouse mouse = new Mouse(14);
        assertEquals(mouse.getSize(), 14);
    }

    @Test
    void defaultSizeTest() {
        Mouse mouse = new Mouse();
        assertEquals(mouse.getSize(), 10);
    }
}