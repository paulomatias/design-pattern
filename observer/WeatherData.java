package observer;

import observer.display.CurrentConditionDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticDisplay;

import java.util.concurrent.ThreadLocalRandom;

public class WeatherData {
    // this is quite bad, because if we want to add another display, we have to add another display here
    private StatisticDisplay statisticDisplay;
    private ForecastDisplay forecastDisplay;
    private CurrentConditionDisplay currentConditionDisplay;

    public WeatherData(StatisticDisplay statisticDisplay,
                       ForecastDisplay forecastDisplay,
                       CurrentConditionDisplay currentConditionDisplay) {

        this.statisticDisplay = statisticDisplay;
        this.forecastDisplay = forecastDisplay;
        this.currentConditionDisplay = currentConditionDisplay;
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
     * This method should be called whenever the weather mesurements have been updated
     */
    public void mesurementsChanged() {
        Integer humidity = getHumidity();
        Integer pressure = getPressure();
        Integer temperature = getTemperature();

        // It seems like displays are using the same method on mesurementsChanged... could be improved.
        statisticDisplay.update(humidity, pressure, temperature);
        forecastDisplay.update(humidity, pressure, temperature);
        currentConditionDisplay.update(humidity, pressure, temperature);

    }

}
