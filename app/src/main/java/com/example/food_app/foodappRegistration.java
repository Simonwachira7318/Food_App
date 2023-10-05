package com.example.food_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class foodappRegistration extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodapp_registration);

        // Initialize EditText fields
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirm);

        // Find the register button by its ID
        MaterialButton registerButton = findViewById(R.id.registerbtn);

        // Set an OnClickListener for the register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user inputs
                String username = usernameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String confirmPassword = confirmPasswordEditText.getText().toString().trim();

                //   user registration logic here
                // validate the inputs and store them in a database

                // After successful registration, navigate to the home page (foodapphome.xml)
                Intent intent = new Intent(foodappRegistration.this, foodapphome.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the "Proceed" text
        TextView proceedTextView = findViewById(R.id.homeproceed);
        proceedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When "Proceed" text is clicked, navigate to foodapphome.xml
                Intent intent = new Intent(foodappRegistration.this, foodapphome.class);
                startActivity(intent);
            }
        });
    }
}
