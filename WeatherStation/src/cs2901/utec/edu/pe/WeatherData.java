package cs2901.utec.edu.pe;

import java.util.*;
import java.util.Random; 

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int current_temperature = 0;
    private int current_humidity = 0;
    private int current_pressure = 0;

    void activate() {
        Random rand = new Random();
        while (true) {
            this.current_pressure = rand.nextInt(100);
            this.current_temperature = rand.nextInt(100);
            this.current_humidity = rand.nextInt(100);
            this.notifyObservers();
        }
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this);
        }
    }

    public int getTemperature() {
        return this.current_temperature;
    }

    public int getHumidity() {
        return this.current_humidity;
    }

    public int getPressure() {
        return this.current_pressure;
    }
 
}
