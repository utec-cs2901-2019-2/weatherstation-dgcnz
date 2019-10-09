package cs2901.utec.edu.pe;

import java.util.*;
import java.lang.*;
import java.io.*;


public class StatisticsDisplay implements Observer {
    private List<Integer> temperatures = new ArrayList<>();
    private List<Integer> humidities = new ArrayList<>();
    private List<Integer> pressures = new ArrayList<>();


    @Override
    public void update(WeatherData s) {
        this.temperatures.add(s.getTemperature());
        this.humidities.add(s.getHumidity());
        this.pressures.add(s.getPressure());

        this.display();
    }

    public void display() {
        IntSummaryStatistics tempstats = this.temperatures.stream().mapToInt((x) -> x).summaryStatistics();
        IntSummaryStatistics humistats = this.humidities.stream().mapToInt((x) -> x).summaryStatistics();
        IntSummaryStatistics presstats = this.pressures.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.printf("Temperature > min: %d, avg %d, max %d\n", tempstats.getMin(), tempstats.getAverage(), tempstats.getMax());

        System.out.printf("Humidity > min: %d, avg %d, max %d\n", humistats.getMin(), humistats.getAverage(),
                humistats.getMax());

        System.out.printf("Pressure > min: %d, avg %d, max %d\n", presstats.getMin(), presstats.getAverage(),
                presstats.getMax());

    }
}
