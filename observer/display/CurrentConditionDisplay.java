package observer.display;

public class CurrentConditionDisplay {
    public void update(Integer humidity, Integer pressure, Integer temperature) {
        System.out.println("Updating CurrentConditionDisplay with humidity:" + humidity + "%, pressure:" + pressure + "hPa, temperature" + temperature + "°C");
    }
}
