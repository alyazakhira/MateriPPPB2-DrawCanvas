package com.example.drawcanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyCanvasView myCanvasView = new MyCanvasView(this);
        setContentView(myCanvasView);
    }
}