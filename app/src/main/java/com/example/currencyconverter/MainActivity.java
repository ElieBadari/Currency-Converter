package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText money_amount;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        money_amount = (EditText) findViewById(R.id.money);//links the variable money_amount to the element Text
        button = (Button) findViewById(R.id.button);

        spinner = (Spinner) findViewById(R.id.currency_sp);
        String[] currencies = {"USD","LBP"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,currencies);
        spinner.setAdapter(adapter);


    }

    public void convert(View v){

        long output_money;
        Double input_money =  Double.parseDouble(money_amount.getText().toString());

        if(spinner.getSelectedItem().toString() == "USD"){
            output_money = Math.round(input_money/22000);
            String message = "The input amount (LBP) in USD is: $" + output_money;
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
        }
        else if (spinner.getSelectedItem().toString() == "LBP"){
            output_money =  Math.round(input_money*22000);
            String message = "The input amount (USD) in LBP is: " + output_money;
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Select Currency",Toast.LENGTH_LONG).show();
        }


    }

}