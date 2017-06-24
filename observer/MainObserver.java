package observer;

import observer.display.CurrentConditionDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticDisplay;

public class MainObserver {
    public static void main() {
        // not very beautiful here, but it's not the point. We can see clearly that every display that will be added is another param to the constructor :(
        WeatherData weatherData = new WeatherData(new StatisticDisplay(), new ForecastDisplay(), new CurrentConditionDisplay());
        weatherData.mesurementsChanged();
    }
}
