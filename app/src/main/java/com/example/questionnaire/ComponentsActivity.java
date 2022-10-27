package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        Button radioBtn = findViewById(R.id.radio_btn);
        radioBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,RadioActivity.class);
            startActivity(intent);

        });
        Button checkBtn = findViewById(R.id.check_btn);
        checkBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,Question1Activity.class);
            startActivity(intent);
        });
        Button otherBtn = findViewById(R.id.other_btn);
        otherBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalenderActivity.class);
            startActivity(intent);
        });

    }


}