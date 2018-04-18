package nl.saxion.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import nl.saxion.animals.Snake;
import nl.saxion.animals.Mouse;;

class SnakeTest {

    @Test
    void growSnakeTest() throws MouseNotAliveException {
        Snake snake = new Snake("red");
        assertEquals(snake.getLength(), 10);

        Mouse mouse = new Mouse();
        snake.catchMouse(mouse);
        assertEquals(snake.getLength(), 11);
    }

    @Test
    void getColorTest() {
        Snake snake = new Snake("red");
        assertEquals(snake.getColor(), "red");
    }
}