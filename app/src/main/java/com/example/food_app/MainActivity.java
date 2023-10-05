package com.example.food_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by its ID
        MaterialButton startButton = findViewById(R.id.start);

        // Set an OnClickListener for the button
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When the button is clicked, navigate to activity_foodlogin.xml
                Intent intent = new Intent(MainActivity.this, foodloginActivity.class);
                startActivity(intent);
            }
        });
    }
}
