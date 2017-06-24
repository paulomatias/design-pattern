package observer.display;

import observer.WeatherData;
import observer.observer.Observer;

public class StatisticDisplay implements Observer, Display {
    // kind of bad because we have weatherData AND weatherData's state here. We could have getters in weatherData which could be better
    private WeatherData weatherData;

    private Integer humidity;
    private Integer pressure;
    private Integer temperature;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Integer humidity, Integer pressure, Integer temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        displayThings();
    }

    @Override
    public void displayThings() {
        System.out.println("Updating StatisticDisplay with humidity:" + humidity + "%, pressure:" + pressure + "hPa, temperature" + temperature + "°C");
    }
}
