package strategy.duck;

import strategy.strategy.fly.FlyWithWings;
import strategy.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyStrategy = new FlyWithWings();
        quackStrategy = new Quack();
    }

    @Override
    public void display() {
        // Mallard Duck !
    }
}
