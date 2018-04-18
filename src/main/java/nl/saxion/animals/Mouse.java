package nl.saxion.animals;

public class Mouse {

    private static final int DEFAULT_SIZE = 10;
    private int size;

    public Mouse() {
        this.size = DEFAULT_SIZE;
    }

    public Mouse(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void kill() {
        size = 0;
    }

    @Override
    public String toString() {
        return "Mouse, size: " + size;
    }
}