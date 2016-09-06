package com.example.enterprise.on_off_switch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Get widgets reference from XML layout
        final TextView tView = (TextView) findViewById(R.id.tv);
        Switch sButton = (Switch) findViewById(R.id.switch_btn);

        //Set a CheckedChange Listener for Switch Button
        sButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean on) {
                if (on) {
                    //Do something when Switch button is on/checked
                    tView.setText("Switch is on.....");
                } else {
                    //Do something when Switch is off/unchecked
                    tView.setText("Switch is off.....");
                }
            }
        });
    }
}
