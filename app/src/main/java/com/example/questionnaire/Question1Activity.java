package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.inputmethod.CorrectionInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Button verifyBtn = findViewById(R.id.verify_ans_btn);
        verifyBtn.setOnClickListener(view -> {
            CheckBox mercuryCb = findViewById(R.id.mercury_cbx);
            CheckBox sunCb = findViewById(R.id.sun_cbx);
            CheckBox moonCb = findViewById(R.id.moon_cbx);
            CheckBox jupiterCb = findViewById(R.id.jupiter_cbx);
            CheckBox saturnCb = findViewById(R.id.saturn_cbx);
            CheckBox plutoCb = findViewById(R.id.pluto_cbx);
            if (mercuryCb.isChecked() == true && sunCb.isChecked() == false && moonCb.isChecked() == false && jupiterCb.isChecked() == true && saturnCb.isChecked() == true && plutoCb.isChecked() == false) {

                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Not Correct", Toast.LENGTH_SHORT).show();
            }

        });
    }
}
