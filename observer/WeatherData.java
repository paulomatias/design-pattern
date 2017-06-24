package observer;

import java.util.Observable;
import java.util.concurrent.ThreadLocalRandom;

// Drawback : Observable is a class, not an interface... (WeatherData can't have another superclass...)
public class WeatherData extends Observable {

    // Temperature, humidity and pressure are just information we can get from an API, not really relevant
    public Integer getTemperature() {
        return ThreadLocalRandom.current().nextInt(-30, 51);
    }

    public Integer getHumidity() {
        return ThreadLocalRandom.current().nextInt(0, 100);
    }

    public Integer getPressure() {
        return ThreadLocalRandom.current().nextInt(0, 2000);
    }

    /**
     * This method should be called whenever the weather measurements have been updated
     */
    public void measurementsChanged() {
        // with Java built-in observer pattern, it is possible to give flexibility with the method setChanged
        // we could for example, call setChanged only if the temperature would fluctuate significantly
        // thus, we would call our observers only when it's important and manage our notifications
        setChanged(); // IMPORTANT because not calling it would prevent observers to be notified

        notifyObservers(); // here using PULL strategy with public getter

        // we could use notifyObservers(Object arg); for a PUSHING strategy


        // IMPORTANT : We don't know in which order le observers will be notified. We should not depend on any order.
    }

}
