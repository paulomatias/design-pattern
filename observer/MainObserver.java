package observer;

import observer.display.CurrentConditionDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticDisplay;

public class MainObserver {
    public static void main() {
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
