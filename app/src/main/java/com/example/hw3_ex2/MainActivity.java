package com.example.hw3_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity<ColorApp> extends AppCompatActivity {

    private Button[] [] buttons;
    private ColorApp colorApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildGUIbyCode ();
    }

    private void buildGUIbyCode() {

        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w = size.x/colorApp.SIDE;   
    }
}