package strategy.duck;

import strategy.strategy.fly.NoFly;
import strategy.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyStrategy = new NoFly(); // DecoyDuck does not fly
        quackStrategy = new MuteQuack(); // DecoyDuck does not quack
    }

    @Override
    public void display() {
        // DecoyDuck Duck !!
    }
}
