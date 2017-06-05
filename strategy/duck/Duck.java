package strategy.duck;

import strategy.strategy.fly.FlyStrategy;
import strategy.strategy.quack.QuackStrategy;

public abstract class Duck {
    protected FlyStrategy flyStrategy;
    protected QuackStrategy quackStrategy;

    public void fly() {
        flyStrategy.fly();
    }

    public void quack() {
        quackStrategy.quack();
    }

    public void swim() {
        // duck implementation of swiming
    }

    public abstract void display();
}
