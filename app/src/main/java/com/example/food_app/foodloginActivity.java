package com.example.food_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class foodloginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlogin);

        // Initialize EditText fields
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);

        // Find the login button by its ID
        MaterialButton loginButton = findViewById(R.id.loginbtn);

        // Set an OnClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username and password
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Check if username is "admin" and password is a specific value (for example, "admin123")
                if (username.equals("admin") && password.equals("admin123")) {
                    // If it matches, navigate to activity_foodapp_registration.xml
                    Intent intent = new Intent(foodloginActivity.this, foodappRegistration.class);
                    startActivity(intent);
                } else {
                    // If it doesn't match, show a toast indicating invalid credentials
                    Toast.makeText(foodloginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set an OnClickListener for the "proceed" text
        TextView proceedTextView = findViewById(R.id.proceed);
        proceedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // When "proceed" text is clicked, navigate to activity_foodapp_registration.xml
                Intent intent = new Intent(foodloginActivity.this, foodappRegistration.class);
                startActivity(intent);
            }
        });
    }
}
