package strategy;

public class MallardDuck extends Duck implements Quackable, Flyable {

    @Override
    public void display() {
        // Mallard Duck !
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
