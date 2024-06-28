package com.example.belajarmengajarreal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.belajarmengajarreal.R;

public class LoginPage extends AppCompatActivity {

    private static final String PREFS_NAME = "MyPrefsFile";
    private static final String PREFS_IS_LOGGED_IN = "isLoggedIn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final EditText usernameEditText = findViewById(R.id.etUsername);
        final EditText passwordEditText = findViewById(R.id.etPassword);
        Button signUpButton = findViewById(R.id.button_signUp);
        Button loginButton = findViewById(R.id.button_login);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSignUpActivity();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Dummy check for login credentials
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
//                Nanti ada password sama username disini ya nevun
                if (username.equals("user") && password.equals("password")) {
                    SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
                    SharedPreferences.Editor editor = settings.edit();
                    editor.putBoolean(PREFS_IS_LOGGED_IN, true);
                    editor.apply();

                    goToMainActivity();
                } else {
                    // Show login error
                }
            }
        });
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void goToSignUpActivity() {
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
        finish();
    }
}