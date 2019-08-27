package com.homework.android_02_rgbcheckboxes;

import android.graphics.Color;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class CheckChangedEvent implements CompoundButton.OnCheckedChangeListener {
    private MainActivity mainActivity;
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    public CheckChangedEvent(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()){
            case R.id.red:
                red = compoundButton.isChecked()?172:0;
                break;
            case R.id.green:
                green = compoundButton.isChecked()?172:0;
                break;
            case R.id.blue:
                blue = compoundButton.isChecked()?172:0;
                break;
        }
        mainActivity.ll.setBackgroundColor(Color.rgb(red, green, blue));
    }
}
