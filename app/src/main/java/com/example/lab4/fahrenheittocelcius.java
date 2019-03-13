package com.example.lab4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;
public class fahrenheittocelcius extends AppCompatActivity {

    //edit texts
    private EditText celcius, fahrenheit;

    // text views
    private TextView celcDisplay, fahrDisplay;

    //button
    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheittocelcius);

        //EditTexts
        celcius = findViewById(R.id.celcius);
        fahrenheit = findViewById(R.id.fahrenheit);

        //TextViews
        fahrDisplay = findViewById(R.id.fahrDisplay);
        celcDisplay = findViewById(R.id.celcDisplay);

        //button
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

    public void onClick(View v){

                if (celcius.getText().length() != 0){
                    double c = Double.parseDouble(celcius.getText().toString());
                    double f = (c * 9/5)+32;
                    fahrDisplay.setText(String.valueOf(f));


                }

                if (fahrenheit.getText().length() != 0 && celcius.getText().length() == 0){
                    double f = Double.parseDouble(fahrenheit.getText().toString());
                    double c = (f -32)/1.8;
                    celcDisplay.setText(String.valueOf(c));

                }

                if (fahrenheit.getText().length() == 0 && celcius.getText().length() == 0){
                    fahrDisplay.setText(" ");
                    celcDisplay.setText(" ");

                }

                    if (fahrenheit.getText().length() != 0 && celcius.getText().length() == 0){
                        double f = Double.parseDouble(fahrenheit.getText().toString());
                        double c = (f -32)/1.8;
                        celcDisplay.setText(String.valueOf(c));

                }

        }
    }



