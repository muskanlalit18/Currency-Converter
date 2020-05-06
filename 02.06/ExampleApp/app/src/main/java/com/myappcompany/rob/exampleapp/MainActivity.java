package com.myappcompany.rob.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view) {
        EditText NameEditText = (EditText) findViewById(R.id.NameEditText);
        Log.i("Info", "Button Pressed");
        Log.i("Values", NameEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

