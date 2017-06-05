package main;

import strategy.DecoyDuck;
import strategy.RubberDuck;

public class MainClass {
    public static void main(String... a) {

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly(); // rubberduck don't fly !
        rubberDuck.quack(); // rubberduck don't quack !
        
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.fly(); // decoyDuck don't fly !
        decoyDuck.quack(); // decoyDuck don't quack !
    }
}
