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

public class Tip extends AppCompatActivity {

    private EditText bill, tip, guests;
    private TextView total;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        bill = (EditText)findViewById(R.id.bill);
        tip = (EditText)findViewById(R.id.tipPercent);
        guests = (EditText)findViewById(R.id.Guests);

        total = (TextView)findViewById(R.id.total);

        calculate = (Button)findViewById(R.id.Calculate);

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


        float b = Float.parseFloat(bill.getText().toString());
        float t = Float.parseFloat(tip.getText().toString());
        float g = Float.parseFloat(guests.getText().toString());

        float prod = (b*t+b)/g;
        DecimalFormat df = new DecimalFormat("$#0.##");

        total.setText(String.valueOf(df.format(prod)));
    }

}
