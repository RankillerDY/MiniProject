package com.example.miniproject;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private ImageButton loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = findViewById(R.id.login_button);
        loginButton.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                ImageButton view = (ImageButton ) v;
                view.getBackground().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                v.invalidate();
                break;
            }
            case MotionEvent.ACTION_UP:

                // Your action here on button click

            case MotionEvent.ACTION_CANCEL: {
                ImageButton view = (ImageButton) v;
                view.getBackground().clearColorFilter();
                view.invalidate();
                break;
            }
        }
        return true;
    }
}