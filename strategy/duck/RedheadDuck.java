package strategy.duck;

import strategy.strategy.fly.FlyWithWings;
import strategy.strategy.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyStrategy = new FlyWithWings();
        quackStrategy = new Quack();
    }

    @Override
    public void display() {
        // Redhead duck !!
    }
}
