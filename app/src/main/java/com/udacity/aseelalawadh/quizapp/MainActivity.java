package com.udacity.aseelalawadh.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MAIN_ACTIVITY";
    //  counter for incorrect answers
    public int incorrect = 0;
    // counter for  correct answwer
    public int point = 0;
    //Declaration EditText
    public EditText name;
    //Declaration answers Quesion1
    public RadioButton answer3_question1;
    //Declaration answers Quesion2
    public CheckBox answer1_question2;
    public CheckBox answer2_question2;
    public CheckBox answer3_question2;
    //Declaration answers Quesion3
    public RadioButton answer2_question3;
    //Declaration answers Quesion4
    public EditText answer_question4;
    //Declaration answers Quesion5
    public RadioButton answer3_question5;
    //Declaration answers Quesion6
    public EditText answer_question6;
    //Declaration answers Quesion7
    public CheckBox answer1_question7;
    public CheckBox answer2_question7;
    public CheckBox answer3_question7;
    //Declaration answers Quesion8
    public RadioButton answer2_question8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.edit_name);
        //Declaration answers Quesion1
        answer3_question1 = findViewById(R.id.radio_answer3_question1);
        //Declaration answers Quesion2
        answer1_question2 = findViewById(R.id.checkBox1_question2);
        answer2_question2 = findViewById(R.id.checkBox2_question2);
        answer3_question2 = findViewById(R.id.checkBox3_question2);
        //Declaration answers Quesion3
        answer2_question3 = findViewById(R.id.radio_answer2_question3);
        //Declaration answers Quesion4
        answer_question4 = findViewById(R.id.edit_question4);
        //Declaration answers Quesion5
        answer3_question5 = findViewById(R.id.radio_answer3_question5);
        //Declaration answers Quesion6
        answer_question6 = findViewById(R.id.edit_question6);
        //Declaration answers Quesion7
        answer1_question7 = findViewById(R.id.checkBox1_question7);
        answer2_question7 = findViewById(R.id.checkBox2_question7);
        answer3_question7 = findViewById(R.id.checkBox3_question7);
        //Declaration answers Quesion8
        answer2_question8 = findViewById(R.id.radio_answer2_question8);
    }


    public void submit(View view) {

        // Adding validation on the name if empty !
        String namePerson = name.getText().toString();
        if (namePerson == null || namePerson == "") {
            Toast.makeText(MainActivity.this, "Please can you enter your name ?", Toast.LENGTH_LONG).show();
            return;
        }

        // reset value to 0 in case user answer the quiz twise
        point = 0;
        incorrect = 0;

        // Radio
        if (answer3_question1.isChecked()) {
            point += 1;
        } else {
            incorrect += 1;
        }

        // CheckBox
        if (answer1_question2.isChecked() && answer3_question2.isChecked() && (answer2_question2.isChecked() == false)) {
            point += 1;
        } else {
            incorrect += 1;
        }

        // Radio
        if (answer2_question3.isChecked()) {
            point += 1;
        } else {
            incorrect += 1;
        }

        // EditText
        String answer_q4 = answer_question4.getText().toString().toUpperCase();
        if (answer_q4.equalsIgnoreCase("PENNSYLVANIA")) {
            point += 1;
        } else {
            incorrect += 1;
        }

        // Radio
        if (answer3_question5.isChecked()) {
            point += 1;
        } else {
            incorrect += 1;
        }

        String answer_q6 = answer_question6.getText().toString().toUpperCase();
        if (answer_q6.equalsIgnoreCase("RIYADH")) {
            point += 1;
        } else {
            incorrect += 1;
        }

        // CheckBox
        if (answer1_question7.isChecked() && answer3_question7.isChecked() && (answer2_question7.isChecked() == false)) {
            point += 1;
        } else {
            incorrect += 1;
        }

        //Radio
        if (answer2_question8.isChecked()) {
            point += 1;
        } else {
            incorrect += 1;
        }

        Toast.makeText(MainActivity.this, "Hi " + namePerson + " Total of your point " + point + " from this question & incorrect answers is/are " + incorrect, Toast.LENGTH_LONG).show();
    }
}