package observer.display;

import observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, Display {
    private Observable observable;

    private Integer humidity;
    private Integer pressure;
    private Integer temperature;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            // PULLING need state from public setter here : we take everything but we could just take humidity and pressure if we wanted
            // We could also PUSH at the Observable level what data we want through arg.
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.temperature = weatherData.getTemperature();
            displayThings();
        }
    }

    @Override
    public void displayThings() {
        System.out.println("Updating StatisticDisplay with humidity:" + humidity + "%, pressure:" + pressure + "hPa, temperature" + temperature + "°C");
    }
}
