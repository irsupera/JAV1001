//JAV-1001
//Iricher B Supera
//A00237146
package com.isupera.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView txv_dice;
    TextView txv_hist;
    EditText txp_side;
    Button btn_once;
    Button btn_twice;
    Button btn_add;
    Spinner spn_noside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set references for all xml elements
        txv_dice = findViewById(R.id.txv_dice);
        txv_hist = findViewById(R.id.txv_hist);
        txp_side = findViewById(R.id.txp_side);
        btn_once = findViewById(R.id.btn_once);
        btn_twice = findViewById(R.id.btn_twice);
        btn_add = findViewById(R.id.btn_add);
        spn_noside = findViewById(R.id.spn_noside);

        ArrayList<String> arraySpinner = new ArrayList<String>();

        // Create an ArrayAdapter using the string array and apply to spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn_noside.setAdapter(adapter);

        //Append entries to array spinner
        adapter.add("4");
        adapter.add("6");
        adapter.add("8");
        adapter.add("10");
        adapter.add("12");

        //set onclick listener for button roll once
        btn_once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hist = txv_hist.getText().toString();

                int maxVal = Integer.parseInt(spn_noside.getSelectedItem().toString());
                Die die = new Die(maxVal);

                txv_dice.setText(""+die.GetValue());
                txv_hist.setText(die.GetValue() + "\n" + hist);
            }
        });

        //set onclick listener for button roll twice
        btn_twice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hist = txv_hist.getText().toString();

                int maxVal = Integer.parseInt(spn_noside.getSelectedItem().toString());
                Die dice1 = new Die(maxVal);
                Die dice2 = new Die(maxVal);

                txv_dice.setText(dice1.GetValue()+","+dice2.GetValue());
                txv_hist.setText(dice1.GetValue()+","+dice2.GetValue()+ "\n" + hist);
            }
        });

        //set onclick listener for add sides
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String side = txp_side.getText().toString();
                if (!side.isEmpty()) {
                    adapter.add(side);
                    //Collections.sort(arraySpinner);
                    Toast.makeText(getBaseContext(),"Saved "+side,Toast.LENGTH_SHORT).show();
                    txp_side.setText("");
                }else{
                    Toast.makeText(getBaseContext(),"Enter a value",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}