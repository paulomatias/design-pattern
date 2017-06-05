package strategy.duck;

import strategy.strategy.fly.NoFly;
import strategy.strategy.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyStrategy = new NoFly(); // RubberDuck does not fly
        quackStrategy = new Squeak(); // RubberDuck does squeak and not quack
    }

    @Override
    public void display() {
        // RubberDuck Duck !!
    }
}
