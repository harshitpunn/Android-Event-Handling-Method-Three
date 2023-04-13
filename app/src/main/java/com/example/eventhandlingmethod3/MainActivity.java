package com.example.eventhandlingmethod3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout constraintLayout;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);
    }

    public void ChangeToCyan(View view) {
        constraintLayout.setBackgroundColor(Color.CYAN);
        Log.e(TAG, "Color changed to CYAN!");
    }

    public void ChangeToYellow(View view) {
        constraintLayout.setBackgroundColor(Color.YELLOW);
        Log.e(TAG, "Color changed to YELLOW!");
    }
}