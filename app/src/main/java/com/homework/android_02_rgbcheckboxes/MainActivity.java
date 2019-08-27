package com.homework.android_02_rgbcheckboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = findViewById(R.id.mainLL);

        CheckChangedEvent listener = new CheckChangedEvent(this);
        CheckBox ch = findViewById(R.id.red);
        ch.setOnCheckedChangeListener(listener);
        ch = findViewById(R.id.green);
        ch.setOnCheckedChangeListener(listener);
        ch = findViewById(R.id.blue);
        ch.setOnCheckedChangeListener(listener);
    }
}
