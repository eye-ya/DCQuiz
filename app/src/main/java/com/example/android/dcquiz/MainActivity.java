package com.example.android.dcquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void correct(){

        String wans1 = "Zambesi";
        String wans2 ="Victor Stone";

        RadioButton ans1 = (RadioButton) findViewById(R.id.q1c1);
        boolean ans1Correct = ans1.callOnClick();
        CheckBox ans2 = (CheckBox) findViewById(R.id.q2c1);
        CheckBox ans3 = (CheckBox) findViewById(R.id.q2c2);
        RadioButton ans4 = (RadioButton) findViewById(R.id.q4c1);
        CheckBox ans5 = (CheckBox) findViewById(R.id.q6c1);
        CheckBox ans6 = (CheckBox) findViewById(R.id.q6c2);
        CheckBox ans7 = (CheckBox) findViewById(R.id.q6c3);





    }
}
