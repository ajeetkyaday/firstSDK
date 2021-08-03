package com.example.sdkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.TosterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TosterMessage.s(MainActivity.this,"hhhhhhhhhhh");
    }
}