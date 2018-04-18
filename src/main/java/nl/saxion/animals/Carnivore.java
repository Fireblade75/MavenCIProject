package nl.saxion.animals;

public abstract class Carnivore {

    public void catchMouse(Mouse mouse) throws MouseNotAliveException {
        if(mouse.getSize() > 0) {
            mouse.kill();
        } else {
            throw new MouseNotAliveException();
        }
    }

}
