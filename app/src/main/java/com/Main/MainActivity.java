package com.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> spinnerDifficultArray = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinnerDifficult));
        spinnerDifficultArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner spinnerDifficult = findViewById(R.id.spinnerDifficult);
        spinnerDifficult.setAdapter(spinnerDifficultArray);
    }
}