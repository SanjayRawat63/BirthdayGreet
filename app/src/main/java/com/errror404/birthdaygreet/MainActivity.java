package com.errror404.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button birthdaygreet=(Button)findViewById(R.id.createBirthdayButton);
//        birthdaygreet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }

    public void createBirthdayGreet(View view) {

        EditText EditTextName=(EditText)findViewById(R.id.nameinput);
        String name=EditTextName.getText().toString();

        // Toast.makeText(this,"Name is: "+name, Toast.LENGTH_LONG).show();
        Intent intent= new Intent(this, BirthdayGreetingActivity.class);
        intent.putExtra("Name",name);
        startActivity(intent);
    }
}