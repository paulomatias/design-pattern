package observer.display;

public class StatisticDisplay {
    public void update(Integer humidity, Integer pressure, Integer temperature) {
        System.out.println("Updating StatisticDisplay with humidity:" + humidity + "%, pressure:" + pressure + "hPa, temperature" + temperature + "°C");
    }
}
