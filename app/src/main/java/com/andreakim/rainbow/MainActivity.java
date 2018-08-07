package com.andreakim.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.andreakim.rainbow.R.color.*;

public class MainActivity extends AppCompatActivity {

    Button redButton;
    Button orangeButton;
    Button yellowButton;
    Button greenButton;
    Button blueButton;
    Button purpleButton;
    View background;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redButton = findViewById(R.id.btn_red);
        orangeButton = findViewById(R.id.btn_orange);
        yellowButton = findViewById(R.id.btn_yellow);
        greenButton = findViewById(R.id.btn_green);
        blueButton = findViewById(R.id.btn_blue);
        purpleButton = findViewById(R.id.btn_purple);
        background = findViewById(R.id.background);
        clearButton = findViewById(R.id.btn_clear);

    }

    public void changeToRed(View view) {
        background.setBackgroundColor(getResources().getColor(colorRed));
        clearButton.setVisibility(View.VISIBLE);
    }
    public void changeToOrange(View view) {
        background.setBackgroundColor(getResources().getColor(colorOrange));
        clearButton.setVisibility(View.VISIBLE);
    }
    public void changeToYellow(View view) {
        background.setBackgroundColor(getResources().getColor(colorYellow));
        clearButton.setVisibility(View.VISIBLE);
    }
    public void changeToGreen(View view) {
        background.setBackgroundColor(getResources().getColor(colorGreen));
        clearButton.setVisibility(View.VISIBLE);
    }
    public void changeToBlue(View view) {
        background.setBackgroundColor(getResources().getColor(colorBlue));
        clearButton.setVisibility(View.VISIBLE);
    }
    public void changeToPurple(View view) {
        background.setBackgroundColor(getResources().getColor(colorPurple));
        clearButton.setVisibility(View.VISIBLE);
    }

    public void clearAndRestart(View view) {
        background.setBackgroundColor(getResources().getColor(colorWhite));
        clearButton.setVisibility(View.INVISIBLE);
    }
}
