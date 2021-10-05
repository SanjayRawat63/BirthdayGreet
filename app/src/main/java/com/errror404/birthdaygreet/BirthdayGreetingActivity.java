package com.errror404.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        TextView bgreet=(TextView)findViewById(R.id.birthdaygreet);
        String b_person=getIntent().getStringExtra("Name");
        bgreet.setText("Happy Birthday \n"+b_person+"!!");


    }
}