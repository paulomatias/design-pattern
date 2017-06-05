package strategy;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void display() {
        // Redhead duck !!
    }

    @Override
    public void fly() {
        // an implementation of flying
    }

    @Override
    public void quack() {
        // an implementation of quacking
    }
}
