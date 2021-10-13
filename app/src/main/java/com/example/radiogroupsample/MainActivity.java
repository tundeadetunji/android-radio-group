package com.example.radiogroupsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup groupGender;
    RadioButton radioMale;
    RadioButton radioFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        groupGender = findViewById(R.id.groupGender);

        //adding oncheck listener to the radio buttons via their parent container (i.e. groupGender)
        groupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //checkedId provides reference to each radio button
                //we can determine exactly which one the user presses by using an if/else statement
                if(checkedId == R.id.radioMale){
                    //do something relevant
                    //e.g.
                    Toast.makeText(getApplicationContext(), "Male", Toast.LENGTH_LONG).show();
                }
                else if(checkedId == R.id.radioFemale){
                    //do something relevant
                    //e.g.
                    Toast.makeText(getApplicationContext(), "Female", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}