package com.keyur.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    EditText etnum1,etnum2;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);

        etnum1=findViewById(R.id.etnum);
        etnum2=findViewById(R.id.etnum2);

        tView=findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1=etnum1.getText().toString();
                String nm2=etnum2.getText().toString();

                int num1,num2,sum;
                num1=Integer.parseInt(nm1);
                num2=Integer.parseInt(nm2);
                sum=num1+num2;
                tView.setText("sum is " + sum);
                Toast.makeText(MainActivity.this, "sum is" + sum, Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1=etnum1.getText().toString();
                String nm2=etnum2.getText().toString();

                int num1,num2,sum;
                num1=Integer.parseInt(nm1);
                num2=Integer.parseInt(nm2);
                sum=num1-num2;
                tView.setText("diffrence is " + sum);
                Toast.makeText(MainActivity.this, "diffrence" + sum, Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1=etnum1.getText().toString();
                String nm2=etnum2.getText().toString();

                int num1,num2,mul;
                num1=Integer.parseInt(nm1);
                num2=Integer.parseInt(nm2);
                mul=num1*num2;
                tView.setText("multiply is " + mul);
                Toast.makeText(MainActivity.this, "multiply is" + mul, Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm1=etnum1.getText().toString();
                String nm2=etnum2.getText().toString();

                float num1,num2,divison;
                num1=Integer.parseInt(nm1);
                num2=Integer.parseInt(nm2);
                divison=num1/num2;
                tView.setText("divison is " + divison);
                Toast.makeText(MainActivity.this, "sum is" + divison, Toast.LENGTH_SHORT).show();
            }
        });
    }
}