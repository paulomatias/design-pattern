package main;

import strategy.DecoyDuck;
import strategy.MallardDuck;
import strategy.RubberDuck;

public class MainClass {
    public static void main(String... a) {

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly(); // does not compile ! yeah !
        rubberDuck.quack(); // does not compile ! yeah !

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.fly(); // does not compile ! yeah !
        decoyDuck.quack(); // does not compile ! yeah !

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.display();
        // mallardDuck has the good behaviours

        // The problem is that we can have multiple code duplication through every class of Ducks implementing Flyable.
        // every time we add a behaviour, it's another interface to implement for every Duck...
        // every Duck we add, it's more code that we may duplicate...
        // Putting behaviour through interface is not a good idea after all.
    }
}
