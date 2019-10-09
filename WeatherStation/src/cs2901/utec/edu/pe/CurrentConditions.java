package cs2901.utec.edu.pe;

import java.util.*;

public class CurrentConditions implements Observer {
    
    @Override
    public void update(WeatherData s) {
        int t = s.getTemperature();
        int h = s.getHumidity();
        int p = s.getPressure();
        this.display(t, h, p);
    }

    public void display(int temperature, int humidity, int pressure) {
        System.out.printf("Temperature: %d\n", temperature);
        System.out.printf("Humidity: %d\n", humidity);
        System.out.printf("Pressure: %d\n", pressure);
    }
}
