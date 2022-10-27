package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            RadioButton radioRb1 = findViewById(R.id.radio_10);
            if (radioRb1.isChecked()){
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioRb2  = findViewById(R.id.radio_8);
            if (radioRb2.isChecked()){
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioRb3 = findViewById(R.id.radio_12);
            if (radioRb3.isChecked()){
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }
            RadioButton radioRb4 = findViewById(R.id.radio_9);
            if (radioRb4.isChecked()){
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show();
            }

        });

    }
}