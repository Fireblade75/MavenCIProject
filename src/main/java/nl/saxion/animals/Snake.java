package nl.saxion.animals;

/**
 * This class describes a snake.
 * @author Arnold
 * @version 1.0.0
 */
public class Snake extends Carnivore {

    /**
     * The default length of a snake.
     */
    private static final int DEFAULT_LENGTH = 10;

    /**
     * The color of the snake.
     */
    private final String color;

    /**
     * The length of the snake in centimeters.
     */
    private int length;

    /**
     * Create a new snake of the default length.
     * @param snakeColor the color of the snake.
     */
    public Snake(final String snakeColor) {
        this.length = DEFAULT_LENGTH;
        this.color = snakeColor;
    }

    /**
     * Get the length of the snake.
     * @return the length of the snake.
     */
    public final int getLength() {
        return length;
    }

    /**
     * Get the color of the snake
     * @throws UnsupportedOperationException this method is not implemented yet
     * @return the color of the snake
     */
    public final String getColor() {
        return color;
    }

    /**
     * Catch, kill and eat a mouse.
     * @param mouse the mouse to eat.
     * @throws MouseNotAliveException when the mouse is already dead.
     */
    public final void catchMouse(final Mouse mouse)
            throws MouseNotAliveException {
        super.catchMouse(mouse);
        length++;
    }

    @Override
    public final String toString() {
        return "Snake, color: " + color + ", length: " + length;
    }
}
