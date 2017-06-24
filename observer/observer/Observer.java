package observer.observer;

public interface Observer {
    void update(Integer humidity, Integer pressure, Integer temperature);
}
