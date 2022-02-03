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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText money_amount;
    Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        money_amount = (EditText)findViewById(R.id.money);//links the variable money_amount to the element Text
        button = (Button) findViewById(R.id.button);

        spinner = (Spinner) findViewById(R.id.currency_sp);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.currencies, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    public void convert(View v){

        Double output_money;
        Double input_money =  Double.parseDouble(money_amount.getText().toString());
        if(spinner.getSelectedItem().toString() == "USD"){
            output_money = input_money/22000;
            String message = "The input amount (LBP) in USD is: " + output_money;
        }
        else{
            output_money = input_money*22000;
            String message = "The input amount (USD) in LBP is: " + output_money;

        }
        Toast.makeText(getApplicationContext(),"message", Toast.LENGTH_LONG).show();

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}