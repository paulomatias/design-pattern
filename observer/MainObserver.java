package observer;

import observer.display.CurrentConditionDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticDisplay;

public class MainObserver {
    public static void main() {
        // Design Principles used : use loosely coupled designs
        // Obersever Pattern : defines a one-to-many dependency between objects so that when one object changes state,
        // all its dependents are notified and updated automatically
        
        WeatherData weatherData = new WeatherData();
        // slightly better initialization, but we can do better
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new CurrentConditionDisplay(weatherData);

        weatherData.measurementsChanged();

        weatherData.deleteObserver(statisticDisplay);

        weatherData.measurementsChanged();
    }
}
