package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText money_amount;
    Spinner sp1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        money_amount = (EditText)findViewById(R.id.money);//links the variable money_amount to the element Text
        sp1 = (Spinner) findViewById(R.id.currency_sp);
        b1 = (Button) findViewById(R.id.button);
    }

    public void convert(View v){
        Double input_money =  Double.parseDouble(money_amount.getText().toString());


        Toast.makeText(getApplicationContext(),"insert converted amount here", Toast.LENGTH_LONG).show();

    }
}