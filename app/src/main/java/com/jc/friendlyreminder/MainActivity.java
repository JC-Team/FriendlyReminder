package com.jc.friendlyreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    boolean isVisible = true;
    public void onClick(View view) {

        Button b = (Button) view;
        b.setText("");

        if (isVisible) {
            b.setVisibility(View.INVISIBLE);
            isVisible = false;
        } else {
            b.setVisibility(View.VISIBLE);
            isVisible = true;
        }
    }
}
