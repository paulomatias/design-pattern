package observer.display;

public class ForecastDisplay {
    public void update(Integer humidity, Integer pressure, Integer temperature) {
        System.out.println("Updating ForecastDisplay with humidity:" + humidity + "%, pressure:" + pressure + "hPa, temperature" + temperature + "°C");
    }
}
