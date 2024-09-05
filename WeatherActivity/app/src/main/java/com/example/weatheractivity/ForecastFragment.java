package com.example.weatheractivity;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;




public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create a FrameLayout as the root layout
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
        ));

        // Create a LinearLayout inside the FrameLayout
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayout.setLayoutParams(linearParams);
        linearLayout.setPadding(16, 16, 16, 16);
        linearLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));

        // Center the LinearLayout inside the FrameLayout
        FrameLayout.LayoutParams frameParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        frameParams.gravity = Gravity.CENTER;
        linearLayout.setLayoutParams(frameParams);

        // Create a TextView for the day
        TextView dayTextView = new TextView(getContext());
        dayTextView.setText("USTH");
        dayTextView.setTextSize(20f);
        dayTextView.setTextColor(getResources().getColor(android.R.color.white));
        dayTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        // Create an ImageView for the weather icon
        ImageView weatherIconView = new ImageView(getContext());
        weatherIconView.setImageResource(R.drawable.icons8_cloud_100);
        weatherIconView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        // Add the TextView and ImageView to the LinearLayout
        linearLayout.addView(dayTextView);
        linearLayout.addView(weatherIconView);

        // Add the LinearLayout to the FrameLayout
        frameLayout.addView(linearLayout);

        // Return the FrameLayout as the view
        return frameLayout;
    }
}
