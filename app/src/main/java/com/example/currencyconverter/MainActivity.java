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

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText money_amount;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        money_amount = (EditText) findViewById(R.id.money);//links the variable money_amount to the element Text

        //instantiate spinner and load it with preset currencies
        spinner = (Spinner) findViewById(R.id.currency_sp);
        String[] currencies = {"","USD","LBP"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,currencies);
        spinner.setAdapter(adapter);





    }


    public void convert(View v){
        //for string formatting aesthetic purposes, i don't know how it will affect performance
        DecimalFormat df = new DecimalFormat("#.##");
        df.setGroupingUsed(true);
        df.setGroupingSize(3);

        Double output_money;
        Double input_money =  Double.parseDouble(money_amount.getText().toString());
        String formatted_output;

        if(spinner.getSelectedItem().toString() == "USD"){
            output_money = input_money/22000.0;
            formatted_output = df.format(output_money);
            String message = "The input amount (LBP) in USD is: " + formatted_output + "USD";
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
        }
        else if (spinner.getSelectedItem().toString() == "LBP"){
            output_money =  input_money*22000.0;
            formatted_output = df.format(output_money);
            String message = "The input amount (USD) in LBP is: " + formatted_output + "LBP";
            Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Select Currency",Toast.LENGTH_SHORT).show();
        }


    }

}