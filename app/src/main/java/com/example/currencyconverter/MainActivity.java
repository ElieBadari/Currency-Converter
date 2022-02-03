package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText money_amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        money_amount = (EditText)findViewById(R.id.money);//links the variable money_amount to the element Text
    }

    public void convert(View v){
        Double input_money =  Double.parseDouble(money_amount.getText().toString());


        Toast.makeText(getApplicationContext(),"insert converted amount here", Toast.LENGTH_LONG).show();

    }
}