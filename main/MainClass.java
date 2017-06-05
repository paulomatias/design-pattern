package main;

import strategy.duck.DecoyDuck;
import strategy.duck.MallardDuck;
import strategy.duck.RubberDuck;

public class MainClass {
    public static void main(String... a) {

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly(); // does compile ! call the nofly behaviour !
        rubberDuck.quack(); // does compile ! call the squeak behaviour !

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.fly(); // does compile ! call the nofly behaviour !
        decoyDuck.quack(); // does compile ! call the mutequack behaviour !

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.display();
        // mallardDuck has the good behaviours : call the flywithwings behaviour and the quackbehaviour

        // Design principles used :
        // Encapsulate what varies.
        // Program to an interface, not an implementation.
        // Favor composition over inheritance.

        // Strategy Pattern
        // defines a family of algorithms, encapsulates each one, and makes them interchangeable.
        // Strategy lets the algorithm vvary indepently from clients that use it.
    }
}
