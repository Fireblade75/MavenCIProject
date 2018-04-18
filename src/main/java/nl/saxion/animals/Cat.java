package nl.saxion.animals;

public class Cat extends Carnivore {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat, name: " + name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Fred");
        System.out.println(cat);
    }
}