package com.example.lab4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.*;

import java.text.DecimalFormat;


public class distconv extends AppCompatActivity {

    private EditText kiloMeters, miles;
    private TextView Miles, Kilometers;
    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distconv);

        //EditTexts
        kiloMeters = findViewById(R.id.kiloMeters);
        miles = findViewById(R.id.miles);

        //TextViews
        Miles = findViewById(R.id.milesDisplay);
        Kilometers = findViewById(R.id.kilometers);

        //Buttons
        convert = findViewById(R.id.convert);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void onClick (View v){

        if (miles.getText().length() == 0) {
            double km = Double.parseDouble(kiloMeters.getText().toString());
            double mi = (km * .62);
            Miles.setText(String.valueOf(mi));
        }


         if (kiloMeters.getText().length() == 0){
             double mi = Double.parseDouble(miles.getText().toString());
             double km = mi/.62;
             Kilometers.setText(String.valueOf(km));
             }
        if (kiloMeters.getText().length() != 0 && miles.getText().length() != 0){
            Double mi = Double.parseDouble(miles.getText().toString());
            double km = mi/.62;
            Kilometers.setText(String.valueOf(km));
        }
        if (kiloMeters.getText().length()==0 && miles.getText().length()==0){

        }


    }

}
