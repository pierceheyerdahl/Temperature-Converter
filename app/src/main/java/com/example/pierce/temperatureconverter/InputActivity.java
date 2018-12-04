package com.example.pierce.temperatureconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity
{

    public final static String EXTRA_FAHRENHEIT = "com.example.pierce.temperatureconverter.FAHRENHEIT";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }

    public void calculate(View button)
    {
        TextView fahrenheitText = (TextView) findViewById(R.id.fahrenheit_text);

        String fahrenheitString = fahrenheitText.getText().toString();

        try
        {
            float f = Float.parseFloat(fahrenheitString);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Please enter temperature", Toast.LENGTH_SHORT).show();
            Log.e("inputError", "Error: Invalid Input");
            return;
        }


        Intent intent = new Intent(this, OutputActivity.class);

        intent.putExtra(EXTRA_FAHRENHEIT, Double.parseDouble(fahrenheitString));

        startActivity(intent);
    }
}
