//JAV-1001 - Lab 4-5
//Iricher B Supera
//A00237146
//MAPD0101
package com.irsupera.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textv_s1;
    TextView textv_s2;
    Button button_p1;
    Button button_p2;
    Button button_m1;
    Button button_m2;
    Spinner spin_pnts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set references for all xml elements
        textv_s1 = findViewById(R.id.textv_score1);
        textv_s2 = findViewById(R.id.textv_score2);
        button_p1 = findViewById(R.id.button_add1);
        button_p2 = findViewById(R.id.button_add2);
        button_m1 = findViewById(R.id.button_sub1);
        button_m2 = findViewById(R.id.button_sub2);
        spin_pnts = findViewById(R.id.spinner_points);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.afb_scores, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spin_pnts.setAdapter(adapter);

        //set onclick listener for team A plus button
        button_p1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //get current team score and selected points
                int score1 = Integer.parseInt(textv_s1.getText().toString());
                int point = Integer.parseInt(spin_pnts.getSelectedItem().toString());
                //add selected points to current team score
                score1 = score1 + point;
                textv_s1.setText(""+score1);
            }
        });

        //set onclick listener for team B plus button
        button_p2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //get current team score and selected points
                int score2 = Integer.parseInt(textv_s2.getText().toString());
                int point = Integer.parseInt(spin_pnts.getSelectedItem().toString());
                //add selected points to current team score
                score2 = score2 + point;
                textv_s2.setText(""+score2);
            }
        });

        //set onclick listener for team A minus button
        button_m1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //get current team score and selected points
                int score1 = Integer.parseInt(textv_s1.getText().toString());
                int point = Integer.parseInt(spin_pnts.getSelectedItem().toString());
                //subtract selected points to current team score
                score1 = score1 - point;
                if (score1 < 0) {
                    score1 = 0;
                }
                textv_s1.setText(""+score1);
            }
        });

        //set onclick listener for team B minus button
        button_m2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //get current team score and selected points
                int score2 = Integer.parseInt(textv_s2.getText().toString());
                int point = Integer.parseInt(spin_pnts.getSelectedItem().toString());
                //subtract selected points to current team score
                score2 = score2 - point;
                if (score2 < 0) {
                    score2 = 0;
                }
                textv_s2.setText(""+score2);
            }
        });

    }
}