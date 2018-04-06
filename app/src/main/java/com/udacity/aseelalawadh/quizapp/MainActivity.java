package com.udacity.aseelalawadh.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public double point;

    //Declaration EditText
    public EditText name;

    //Declaration answers Quesion1
   /* public RadioButton answer1_question1;
    public RadioButton answer2_question1;*/
    public RadioButton answer3_question1;

    //Declaration answers Quesion2
    public CheckBox answer1_question2;
    //public CheckBox answer2_question2;
    public CheckBox answer3_question2;

    //Declaration answers Quesion3
    //public RadioButton answer1_question3;
    public RadioButton answer2_question3;
    //public RadioButton answer3_question3;

    //Declaration answers Quesion4
    public EditText answer_question4;

    //Declaration answers Quesion5
   /* public RadioButton answer1_question5;
    public RadioButton answer2_question5;*/
    public RadioButton answer3_question5;

    //Declaration answers Quesion6
    public EditText answer_question6;

    //Declaration answers Quesion7
    public CheckBox answer1_question7;
    //public CheckBox answer2_question7;
    public CheckBox answer3_question7;

    //Declaration answers Quesion8
    /*public RadioButton answer1_question8;
    public RadioButton answer2_question8;*/
    public RadioButton answer3_question8;

    // private static String TAG = "MAIN_ACTIVITY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  answer1_question1=findViewById(R.id.radio_answer1_question1);
        answer2_question1=findViewById(R.id.radio_answer2_question1);*/
        answer3_question1 = findViewById(R.id.radio_answer3_question1);

        answer1_question2 = findViewById(R.id.checkBox1_question2);
        answer3_question2 = findViewById(R.id.checkBox2_question2);

        answer2_question3 = findViewById(R.id.radio_answer2_question3);

        answer_question4 = findViewById(R.id.edit_question4);
        String answer_q4 = answer_question4.getText().toString();


        answer3_question5 = findViewById(R.id.radio_answer3_question5);

        answer_question6 = findViewById(R.id.edit_question6);
        String answer_q6 = answer_question6.getText().toString();

        answer1_question7 = findViewById(R.id.checkBox1_question7);
        answer3_question7 = findViewById(R.id.checkBox3_question7);

        answer3_question8 = findViewById(R.id.radio_answer3_question8);


    }

    /*
        //Question 1
        public void question1(View view) {

            RadioButton radio;
            if (view instanceof RadioButton) {
                radio = (RadioButton)view;
            }else {
                // Error in case the view isn't RadioButton
                Log.v(TAG, "the view is " + view.getClass().getName() );
                return;
            }

            // Is the button now checked?
            boolean checked = radio.isChecked();

            int id = radio.getId();

            if( id == answer1_question1.getId()) {

            }else if( id == answer2_question1.getId()) {

            }else if( id == answer3_question1.getId()) {
                if (answer3_question1.isChecked()) {
                    point++;
                }

            }else {
                // your view is none of them
                Log.v(TAG, "the view id is: " + id );
                return;
            }


            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_answer1_question1:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_answer2_question1:
                    if (checked)
                        // Ninjas rule
                        break;
                case R.id.radio_answer3_question1:
                    if (checked)
                        // Ninjas rule
                        point =+1;
                    Toast.makeText(getApplicationContext(), "you take "+point+"frpm this question", Toast.LENGTH_LONG).show();
                        break;
            }
        }

        //Question 2
        public void question2(View view) {

            answer1_question2=findViewById(R.id.checkBox1_question2);
            answer2_question2=findViewById(R.id.checkBox2_question2);
            answer3_question2=findViewById(R.id.checkBox3_question2);

            // String result = "Selected Answer";
            if(answer1_question2.isChecked()){
                point += 0.5;
            }
            if(answer3_question2.isChecked()){
                point += 0.5;
            }
            if(answer2_question2.isChecked()){
            }

            if(answer1_question2.isChecked()&&answer3_question2.isChecked()){
                point += 1;
            }
            Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
        }


        //Question 3
        public void question3(View view) {

            answer1_question3 = findViewById(R.id.radio_answer1_question3);
            answer2_question3 = findViewById(R.id.radio_answer2_question3);
            answer3_question3 = findViewById(R.id.radio_answer3_question3);

            Log.v("question3", "value change");
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_answer1_question3:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_answer2_question3:
                    if (checked)
                        // Ninjas rule
                        point =+1;
                    Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
                        break;
                case R.id.radio_answer3_question3:
                    if (checked)
                        // Ninjas rule
                    break;
            }
        }


        //Question 4
        public void question4(View view) {

            answer_question4=findViewById(R.id.edit_question4);
            String answer = answer_question4.getText().toString();

            if (answer == "Pennsylvania" || answer =="pennsylvania" || answer =="PENNSYLVANIA"){
                point=+1;
              //  Toast.makeText(this,"Right Answer", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
            }
        }


        //Question 5
        public void question5(View view) {

            answer1_question5=findViewById(R.id.radio_answer1_question5);
            answer2_question5=findViewById(R.id.radio_answer2_question5);
            answer3_question5=findViewById(R.id.radio_answer3_question5);

            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_answer1_question5:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_answer2_question5:
                    if (checked)
                        // Ninjas rule
                    break;
                case R.id.radio_answer3_question5:
                    if (checked)
                        // Ninjas rule
                        point =+1;
                    Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
                        break;
            }
        }


        //Question 6
        public void question6(View view) {

            answer_question6=findViewById(R.id.edit_question6);
            String answer = answer_question6.getText().toString();

            if (answer == "Riyadh" || answer =="riyadh" || answer =="RIYADH"){
                point=+1;
                //  Toast.makeText(this,"Right Answer", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
            }

        }

        //Question 7
        public void question7(View view) {
            answer1_question7=findViewById(R.id.checkBox1_question7);
            answer2_question7=findViewById(R.id.checkBox2_question7);
            answer3_question7=findViewById(R.id.checkBox3_question7);

            // String result = "Selected Answer";
            if(answer1_question7.isChecked()){
                point += 0.5;
            }
            if(answer2_question7.isChecked()){
            }
            if(answer3_question7.isChecked()){
                point += 0.5;
            }
            if(answer1_question7.isChecked()&&answer3_question7.isChecked()){
                point += 1;
            }
            Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
        }


        //Question8
        public void question8(View view) {

            answer1_question8=findViewById(R.id.radio_answer1_question8);
            answer2_question8=findViewById(R.id.radio_answer2_question8);
            answer3_question8=findViewById(R.id.radio_answer3_question8);

            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_answer1_question8:
                    if (checked)
                        // Pirates are the best
                        break;
                case R.id.radio_answer2_question8:
                    if (checked)
                        // Ninjas rule
                        break;
                case R.id.radio_answer3_question8:
                    if (checked)
                        // Ninjas rule
                        point =+1;
                    Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
                    break;
            }
        }

    */
    public void submit(View view) {

        if (point > 0) {
            point = 0;
        }

        String namePerson = name.getText().toString();

        //  answer_question4=findViewById(R.id.edit_question6);
        String answer_q4 = answer_question4.getText().toString();


        //answer_question6=findViewById(R.id.edit_question6);
        String answer_q6 = answer_question6.getText().toString();


        //Radio
        if (answer3_question1.isChecked()) {
            point++;
        }

        //Chek box
        if (answer1_question2.isChecked()) {
            point += 0.5;
        } else if (answer3_question2.isChecked()) {
            point += 0.5;
        } else if (answer1_question2.isChecked() && answer3_question2.isChecked()) {
            point++;
        }

        //Radio
        if (answer2_question3.isChecked()) {
            point++;
        }

        //EditText

        if ((answer_q4 == "Pennsylvania") || (answer_q4 == "pennsylvania") || (answer_q4 == "PENNSYLVANIA")) {
            point++;
            //  Toast.makeText(this,"Right Answer", Toast.LENGTH_SHORT).show();
            // Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
        }

        //Radio
        if (answer3_question5.isChecked()) {
            point++;
        }
        if ((answer_q6 == "Riyadh") || (answer_q6 == "riyadh") || (answer_q6 == "RIYADH")) {
            point++;
            //  Toast.makeText(this,"Right Answer", Toast.LENGTH_SHORT).show();
            // Toast.makeText(getApplicationContext(), "you get "+point+"from this question", Toast.LENGTH_LONG).show();
        }

        //CheckBox
        if (answer1_question7.isChecked()) {
            point += 0.5;
        } else if (answer3_question7.isChecked()) {
            point += 0.5;
        } else if (answer1_question7.isChecked() && answer3_question7.isChecked()) {
            point++;
        }


        //Radio
        if (answer3_question8.isChecked()) {
            point++;
        }


        Toast.makeText(getApplicationContext(), "Hi " + namePerson + " Total of your point " + point + "from this question", Toast.LENGTH_LONG).show();
    }

}