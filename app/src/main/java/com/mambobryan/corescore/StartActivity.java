package com.mambobryan.corescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    LinearLayout selectionLayout;

    Switch selectionSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        selectionLayout = findViewById(R.id.selection_layout);
        selectionSwitch = findViewById(R.id.selection_switch);

        selectionSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    selectionLayout.setBackground(getResources().getDrawable(R.drawable.blue_bg));
                } else {
                    selectionLayout.setBackground(getResources().getDrawable(R.drawable.peach_bg));
                }
            }
        });
    }

}
