package com.ahsrav.androidbasics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        // Generate a random number
        int min = 0;
        int max = 1000;
        int random = new Random().nextInt((max - min) + 1) + min;

        // Get a reference to the textview and tell it what number to display
        TextView randomNumberView = findViewById(R.id.randomNumberView);
        randomNumberView.setText(String.valueOf(random));
    }
}
