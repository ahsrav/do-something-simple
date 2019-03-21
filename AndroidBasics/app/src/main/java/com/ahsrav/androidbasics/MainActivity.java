package com.ahsrav.androidbasics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     // Tells the activity which layout file to use

        Button generateButton = findViewById(R.id.generateButton);  // Get a reference to the button

        // Set up an action to happen when the button is clicked
        generateButton.setOnClickListener(new View.OnClickListener() {

            // The onClick() method is called each time the button is clicked
            @Override
            public void onClick(View view) {

                // Intents are a way to tell the OR what you want to do.
                // In this case, the intent wants to do something with RandomNumberActivity.
                Intent randomNumberActivityIntent = new Intent(getBaseContext(), RandomNumberActivity.class);
                startActivity(randomNumberActivityIntent);      // Start the activity associated with the intent
            }
        });
    }
}
