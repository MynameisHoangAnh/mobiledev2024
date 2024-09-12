package com.example.weather_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

public class WeatherActivity extends AppCompatActivity {

    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // Initialize the ViewPager2
        viewPager = findViewById(R.id.viewPager);

        // Set up the ViewPager with the adapter
        setupViewPager(viewPager);
    }
    private void setupViewPager(ViewPager2 viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);

        // Add the fragments
        adapter.addFragment(new WeatherAndForecastFragment(), "Page 1");
        adapter.addFragment(new WeatherAndForecastFragment(), "Page 2");
        adapter.addFragment(new WeatherAndForecastFragment(), "Page 3");

        viewPager.setAdapter(adapter);
    }
}




