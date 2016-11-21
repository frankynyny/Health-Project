package com.example.android.grademyhealth;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int healthIndex = 100;

    //Score the quiz when the submit quiz answer button is clicked
    public void submitQuiz(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        CheckBox healthy_Condition = (CheckBox) findViewById(R.id.healthyCondition);
        boolean conditionHealthy = healthy_Condition.isChecked();

        CheckBox p_t_s_d = (CheckBox) findViewById(R.id.ptsd);
        boolean pt_sd = p_t_s_d.isChecked();

        CheckBox sad = (CheckBox) findViewById(R.id.depression);
        boolean sad_Face = sad.isChecked();

        CheckBox afraid = (CheckBox) findViewById(R.id.anxiety);
        boolean afraid_Face = afraid.isChecked();

        CheckBox hard_Upbringing = (CheckBox) findViewById(R.id.hardUpbringing);
        boolean upbringingHard = hard_Upbringing.isChecked();

        CheckBox normal_Upbringing = (CheckBox) findViewById(R.id.normalUpbringing);
        boolean upbringing_Normal = normal_Upbringing.isChecked();

        CheckBox soft_Upbringing = (CheckBox) findViewById(R.id.softUpbringing);
        boolean upbringing_Soft = soft_Upbringing.isChecked();

        CheckBox minor_Disability = (CheckBox) findViewById(R.id.minorDisability);
        boolean disability_minor = minor_Disability.isChecked();

        CheckBox moderate_Disability = (CheckBox) findViewById(R.id.moderateDisability);
        boolean disability_Moderate = moderate_Disability.isChecked();

        CheckBox severe_Disability = (CheckBox) findViewById(R.id.severeDisability);
        boolean disability_severe = severe_Disability.isChecked();

        if (conditionHealthy) {
            healthIndex = healthIndex + 30;
        }
        if (pt_sd) {
            healthIndex = healthIndex - 30;
        }
        if (sad_Face) {
            healthIndex = healthIndex - 15;
        }
        if (afraid_Face) {
            healthIndex = healthIndex - 15;
        }
        if (upbringingHard) {
            healthIndex = healthIndex + 30;
        }
        if (upbringing_Normal) {
            healthIndex = healthIndex - 10;
        }
        if (upbringing_Soft) {
            healthIndex = healthIndex - 35;
        }
        if (disability_minor) {
            healthIndex = healthIndex - 10;
        }
        if (disability_Moderate) {
            healthIndex = healthIndex - 40;
        }
        if (disability_severe) {
            healthIndex = 80;
        }
    }
        public void onRadioButtonClicked(View view) {
            //Is this button checked?
            boolean checked = ((RadioButton) view).isChecked();


            switch (view.getId()) {
                case R.id.noPain:
                    if (checked) ;
                    //no pain occured.
                    healthIndex = healthIndex - 0;
                    break;

                case R.id.mildPain:
                    if (checked) ;
                    //mild pain
                    healthIndex = healthIndex - 10;
                    break;

                case R.id.moderatePain:
                    if (checked) ;
                    //moderate pain
                    healthIndex = healthIndex - 15;
                    break;

                case R.id.severePain:
                    if (checked) ;
                    //severe pain
                    healthIndex = healthIndex - 20;
                    break;

                case R.id.intensePain:
                    if (checked) ;
                    //intense pain
                    healthIndex = healthIndex - 30;
                    break;

                case R.id.unbearablePain:
                    if (checked) ;
                    //unbearable pain
                    healthIndex = healthIndex - 40;
                    break;
            }

            switch (view.getId()) {
                case R.id.minutes:
                    if (checked) ;
                    //minutes
                    healthIndex = healthIndex - 10;
                    break;

                case R.id.hours:
                    if (checked) ;
                    //hours
                    healthIndex = healthIndex - 20;
                    break;

                case R.id.days:
                    if (checked) ;
                    //days
                    healthIndex = healthIndex - 30;
                    break;

                case R.id.months:
                    if (checked) ;
                    //months
                    healthIndex = healthIndex - 40;
                    break;
            }
        }

    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
        //Is this button checked?
        boolean check = ((CheckBox) view).isChecked();

            case R.id.healthyCondition:
                if (check) ;
                //hours
                healthIndex = healthIndex + 20;
                break;

            case R.id.ptsd:
                if (check) ;
                //hours
                healthIndex = healthIndex - 20;
                break;

            case R.id.depression:
                if (check) ;
                //days
                healthIndex = healthIndex - 30;
                break;

            case R.id.anxiety:
                if (check) ;
                //months
                healthIndex = healthIndex - 40;
                break;

            case R.id.hardUpbringing:
                if (check) ;
                //minutes
                healthIndex = healthIndex - 10;
                break;

            case R.id.normalUpbringing:
                if (check) ;
                //hours
                healthIndex = healthIndex - 20;
                break;

            case R.id.softUpbringing:
                if (check) ;
                //days
                healthIndex = healthIndex - 30;
                break;

            case R.id.minorDisability:
                if (check) ;
                //months
                healthIndex = healthIndex - 40;
                break;

            case R.id.moderateDisability:
                if (check) ;
                //days
                healthIndex = healthIndex - 30;
                break;

            case R.id.severeDisability:
                if (check) ;
                //months
                healthIndex = healthIndex - 40;
                break;
        }

        EditText editAnswerField = (EditText) findViewById(R.id.overall_Health_Edit);
        String statusAnswerField = editAnswerField.getText().toString();
        Log.v("MainActivity", "editAnswerField: " + statusAnswerField);
        if (statusAnswerField.equalsIgnoreCase("heart disease")) healthIndex = healthIndex - 10;
    }


}


