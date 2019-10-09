package cs2901.utec.edu.pe;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherdata = new WeatherData();
        CurrentConditions o1 = new CurrentConditions();
        StatisticsDisplay o2 = new StatisticsDisplay();
        ForecastDisplay o3 = new ForecastDisplay();

        weatherdata.registerObserver(o1);
        weatherdata.registerObserver(o2);
        weatherdata.registerObserver(o3);

        weatherdata.activate();
    }
}
