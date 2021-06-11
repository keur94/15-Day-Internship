package com.keyur.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class dataactivity extends AppCompatActivity {
    TextView tv01,tv02,tv03,tv04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dataactivity);
        tv01=findViewById(R.id.tv01);
        tv02=findViewById(R.id.tv02);

        tv03=findViewById(R.id.tv03);
        tv04=findViewById(R.id.tv04);

        Intent intent=getIntent();
        String name1=intent.getStringExtra("nm");
        String email1=intent.getStringExtra("mail");
        String number1=intent.getStringExtra("num");

        String hobbie1=intent.getStringExtra("hobb");

        tv01.setText(name1);
        tv02.setText(email1);
        tv03.setText(number1);
        tv04.setText(hobbie1);
    }
}