package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        Button setBtn = findViewById(R.id.set_btn);
        setBtn.setOnClickListener(view -> {
            CalendarView calendarView = findViewById(R.id.calender_cv);
            TextView dateTxt = findViewById(R.id.date_txt);


           /* long selectedDate = calendarView.getDate();
            TextView dateTxt = findViewById(R.id.date_txt);
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
            calendar = Calendar.getInstance();
            long SelectedDate = calendar.getTimeInMillis();
            calendarView.setMinDate(selectedDate);*/

        });

    }
}