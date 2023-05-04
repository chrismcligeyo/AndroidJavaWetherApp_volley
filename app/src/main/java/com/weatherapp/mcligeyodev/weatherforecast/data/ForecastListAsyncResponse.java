package com.weatherapp.mcligeyodev.weatherforecast.data;

import java.util.ArrayList;

import com.weatherapp.mcligeyodev.weatherforecast.model.Forecast;



public interface ForecastListAsyncResponse {
    void processFinished(ArrayList<Forecast> forecastArrayList);
}
