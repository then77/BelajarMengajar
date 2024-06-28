package com.example.belajarmengajarreal.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarmengajarreal.R;
import com.example.belajarmengajarreal.activities.MainActivity;

public class SplashScreen extends AppCompatActivity {

    private static final String PREFS_NAME = "MyPrefsFile";
    private static final String PREFS_IS_LOGGED_IN = "isLoggedIn";
    private static final int SPLASH_DISPLAY_LENGTH = 2000; // 2000 milliseconds = 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
                boolean isLoggedIn = settings.getBoolean(PREFS_IS_LOGGED_IN, false);

                if (isLoggedIn) {
                    goToMainActivity();
                } else {
                    goToLoginActivity();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void goToLoginActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
