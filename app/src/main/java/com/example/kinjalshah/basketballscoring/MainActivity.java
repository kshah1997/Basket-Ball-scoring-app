package com.example.kinjalshah.basketballscoring;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    int scoreA = 0;
    int scoreB = 0;


    public void threeB(View view) {
        
        scoreB += 3;
        displayforB(scoreB);
    }

    public void twoB(View view) {
        
        scoreB += 2;
        displayforB(scoreB);

    }

    public void freeB(View view) {
        
        scoreB += 1;
        displayforB(scoreB);

    }

    public void threeA(View view) {
        
        scoreA += 3;
        displayforA(scoreA);


    }

    public void twoA(View view) {
        
        scoreA += 2;
        displayforA(scoreA);

    }

    public void freeA(View view) {
        
        scoreA += 1;
        displayforA(scoreA);

    }

    public void reset(View view) {
        
        displayforA(0);
        displayforB(0);
    }

    public void displayforB(int score) {

        TextView textB = (TextView) findViewById(R.id.scoreB);
        textB.setText(String.valueOf(score));

    }

    public void displayforA(int score) {

        TextView textA = (TextView) findViewById(R.id.scoreA);
        textA.setText(String.valueOf(score));

    }
}
