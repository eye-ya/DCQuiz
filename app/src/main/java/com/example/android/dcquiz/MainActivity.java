package com.example.android.dcquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    HashMap<String,Boolean> answers = new HashMap<>();

    public boolean question3(boolean ansCorrect2, boolean ansCorrect3){

        if (ansCorrect2&&ansCorrect3){
            return true;
        }else {
            return false;
        }
    }

    public boolean question6(boolean ansCorrect5, boolean ansCorrect6, boolean ansCorrect7){

        if (ansCorrect5&&ansCorrect6&&ansCorrect7){
            return true;
        }else {
            return false;
        }

    }

    public void submit (View view ){

        EditText textAns1 = (EditText) findViewById(R.id.text);
        String value1 = textAns1.getText().toString();
        boolean correctText1 = Boolean.parseBoolean("zambesi");


        EditText textAns2 = (EditText) findViewById(R.id.text2);
        String value2 = textAns1.getText().toString();
        boolean correctText2 = Boolean.parseBoolean("victor stone");

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

        answers.put("text", correctText1);
        answers.put("text2", correctText2);
        answers.put("q1c1", ans1Correct);
        answers.put("ques2", question3(ans2Correct,ans3Correct));
        answers.put("q4c1", ans4Correct);
        answers.put("ques6", question6(ans5Correct,ans6Correct,ans7Correct));


        int count = Collections.frequency(answers.values(), true);

        TextView results = (TextView) findViewById(R.id.results);


        switch(count){
            case 0:
                results.setText(getString(R.string.response1));
                break;
            case 1:
                results.setText(getString(R.string.response2));
                break;
            case 2:
                results.setText(getString(R.string.response3));
                break;
            case 3:
               results.setText(getString(R.string.response4));
               break;
            case 4:
                results.setText(getString(R.string.response5));
                break;
            case 5:
               results.setText(getString(R.string.response6));
                break;
            case 6:
               results.setText(getString(R.string.response7));
               break;
            default: results.setText("dfaskf");
            break;
        }

    }
}

