package com.example.android.dcquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText textAns1 = (EditText) findViewById(R.id.text);
    String value1 = textAns1.getText().toString();
    boolean correctText1 = Boolean.parseBoolean("zambesi");


    EditText textAns2 = (EditText) findViewById(R.id.text2);
    String value2 = textAns1.getText().toString();
    boolean correctText2 = Boolean.parseBoolean("cyborg");


    RadioButton ans1 = (RadioButton) findViewById(R.id.q1c1);
    boolean ans1Correct = ans1.isChecked();

    CheckBox ans2 = (CheckBox) findViewById(R.id.q2c1);
    boolean ans2Correct = ans2.isChecked();
    CheckBox ans3 = (CheckBox) findViewById(R.id.q2c2);
    boolean ans3Correct = ans3.isChecked();

    RadioButton ans4 = (RadioButton) findViewById(R.id.q4c1);
    boolean ans4Correct = ans4.isChecked();

    CheckBox ans5 = (CheckBox) findViewById(R.id.q6c1);
    boolean ans5Correct = ans5.isChecked();
    CheckBox ans6 = (CheckBox) findViewById(R.id.q6c2);
    boolean ans6Correct = ans6.isChecked();
    CheckBox ans7 = (CheckBox) findViewById(R.id.q6c3);
    boolean ans7Correct = ans7.isChecked();

    public void submit (View view ){
        boolean[]trues = {correctText1,correctText2, ans1Correct,ans2Correct,ans3Correct,ans4Correct,ans5Correct,ans6Correct,ans7Correct};

        correct(trues);
    }


    public  boolean correct( boolean [] trues) {

       trues = new boolean[]{correctText1,correctText2, ans1Correct,ans2Correct,ans3Correct,ans4Correct,ans5Correct,ans6Correct,ans7Correct};

        for (boolean value : trues) {
            if (!value)
                return false;
        }
        return true;
    }


}

