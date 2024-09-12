package com.example.weather_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WeatherAndForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate your layout for this fragment (e.g., containing two fragment containers)
        View view = inflater.inflate(R.layout.activity_weather_and_forecast_fragment, container, false);

        // Dynamically load WeatherFragment and ForecastFragment
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.weatherFragmentContainer, new WeatherFragment());
        transaction.replace(R.id.forecastFragmentContainer, new ForecastFragment());
        transaction.commit();

        return view;
    }
}
