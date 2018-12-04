package com.example.pierce.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class OutputActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        Intent intent = getIntent();

        double fahrenheit = intent.getDoubleExtra(InputActivity.EXTRA_FAHRENHEIT, 1.0d);
        double celsius = (fahrenheit - 32) * .5556;

        TextView outputCelsius = (TextView) findViewById(R.id.output_celsius);

        DecimalFormat format = new DecimalFormat("#.##");

        outputCelsius.setText(getString(R.string.output_text) + " " + format.format(celsius) + "C");
    }
}
