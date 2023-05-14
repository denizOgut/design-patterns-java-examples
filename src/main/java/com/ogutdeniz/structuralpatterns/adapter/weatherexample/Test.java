package com.ogutdeniz.structuralpatterns.adapter.weatherexample;

public class Test {
    public static void main(String[] args) {
    /*
        The WeatherDataAdapter class adapts the data returned by the WeatherService to the format expected by our application's WeatherData interface.
        The adapter's constructor takes a WeatherService object as a parameter and saves it as an instance variable.
        Then, the adapter's getLocation(), getTemperature(), and getHumidity() methods split the comma-separated weather data string into its parts and return the appropriate data as required by the WeatherData interface.
    */

        WeatherDataAdapter weatherDataAdapter = new WeatherDataAdapter(new WeatherService());
        System.out.println("Location: " + weatherDataAdapter.getLocation());
        System.out.println("Temperature: " + weatherDataAdapter.getTemperature());
        System.out.println("Humidity: " + weatherDataAdapter.getHumidity());
    }
}
