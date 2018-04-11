package com.udacity.aseelalawadh.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public double point = 0.0;

    //Declaration EditText
    public EditText name;

    //Declaration answers Quesion1
    public RadioButton answer3_question1;

    //Declaration answers Quesion2
    public CheckBox answer1_question2;
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
    public CheckBox answer3_question7;

    //Declaration answers Quesion8
    public RadioButton answer2_question8;

    private static String TAG = "MAIN_ACTIVITY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.edit_name);

        answer3_question1 = findViewById(R.id.radio_answer3_question1);

        answer1_question2 = findViewById(R.id.checkBox1_question2);
        answer3_question2 = findViewById(R.id.checkBox3_question2);

        answer2_question3 = findViewById(R.id.radio_answer2_question3);

        answer_question4 = findViewById(R.id.edit_question4);


        answer3_question5 = findViewById(R.id.radio_answer3_question5);

        answer_question6 = findViewById(R.id.edit_question6);


        answer1_question7 = findViewById(R.id.checkBox1_question7);
        answer3_question7 = findViewById(R.id.checkBox3_question7);

        answer2_question8 = findViewById(R.id.radio_answer2_question8);


    }


    public void submit(View view) {

        // Adding validation on the name if empty !
        String namePerson = name.getText().toString();
        if (namePerson == null || namePerson == "") {
            Toast.makeText(getApplicationContext(), "Please can you enter your name ?", Toast.LENGTH_LONG).show();
            return;
        }


        if (point > 0) {
            // reset value to 0 in case user answer the quiz twise
            point = 0;
        }

        // Radio
        if (answer3_question1.isChecked()) {
            point = point + 1;
        }

        // CheckBox
        if (answer1_question2.isChecked()) {
            point += 0.5;
        }

        if (answer3_question2.isChecked()) {
            point += 0.5;
        }

        // Radio
        if (answer2_question3.isChecked()) {
            point = point + 1;
        }

        // EditText
        String answer_q4 = answer_question4.getText().toString().toUpperCase();
        String correct_q4 = new String("PENNSYLVANIA");
        if (answer_q4.equals(correct_q4)) {
            point = point + 1;
        }

        // Radio
        if (answer3_question5.isChecked()) {
            point = point + 1;
        }

        String answer_q6 = answer_question6.getText().toString().toUpperCase();
        String correct_q6 = new String("RIYADH");
        if (answer_q6.equals(correct_q6)) {
            point = point + 1;
        }

        // CheckBox
        if (answer1_question7.isChecked()) {
            point += 0.5;
        }

        if (answer3_question7.isChecked()) {
            point += 0.5;
        }

        //Radio
        if (answer2_question8.isChecked()) {
            point = point + 1;
        }


        Toast.makeText(getApplicationContext(), "Hi " + namePerson + " Total of your point " + point + " from this question", Toast.LENGTH_SHORT).show();
    }
}