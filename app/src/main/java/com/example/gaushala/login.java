package com.example.gaushala;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity  {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.email_edit_text);
        editTextPassword = findViewById(R.id.login_password);
        buttonLogin = findViewById(R.id.btnlogin);

        // Set a click listener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve entered username and password
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Implement authentication logic here
                if (username.equals("Admin") && password.equals("123")) {
                    // Successful login
                    Toast.makeText(com.example.gaushala.login.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    // Failed login
                    Toast.makeText(com.example.gaushala.login.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}