package observer;

import observer.observer.Observer;
import observer.observer.Subject;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class WeatherData implements Subject {
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Integer humidity = getHumidity();
        Integer pressure = getPressure();
        Integer temperature = getTemperature();

        // coding to interfaces here allows this. Passing the full state of WeatherData is still ugly
        observers.forEach(display -> display.update(humidity, pressure, temperature));
    }

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
        // every change, we notify every observers
        notifyObservers();
    }

}
