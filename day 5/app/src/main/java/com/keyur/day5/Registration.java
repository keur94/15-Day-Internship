package com.keyur.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = et1.getText().toString();
                String email = et2.getText().toString();
                String hobbie = et5.getText().toString();
                String number = et3.getText().toString();
                String password = et4.getText().toString();

                Intent intent = new Intent(Registration.this, dataactivity.class);
                intent.putExtra("nm", name);
                intent.putExtra("mail", email);
                intent.putExtra("num", number);
                intent.putExtra("Password", password);
                intent.putExtra("hobb", hobbie);
                startActivity(intent);

            }
        });
}
}