package com.myappcompany.rob.exampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurreny(View view){
        Log.i("Info","Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editText);

        String amountInrmb = editText.getText().toString();

        double amamountInrmbdouble = Double.parseDouble(amountInrmb);
        double amamountIndoldouble = amamountInrmbdouble / 7;

        String amountIndolstring = String.format("%.2f",amamountIndoldouble);

        Toast.makeText(this,"$" +amountIndolstring+" is rmb" +amountInrmb, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
