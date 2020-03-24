package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button add_button,min_button,multiply_button,divide_button;
    TextView answer;
    EditText no3,no4;
    String num3,num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        answer = findViewById(R.id.textView5);
        add_button  =findViewById(R.id.add_btn);
        min_button  =findViewById(R.id.minus_btn);
        multiply_button  = findViewById(R.id.multi_btn);
        divide_button = findViewById(R.id.divide_btn);
        no3 = findViewById(R.id.num3);
        no4  =findViewById(R.id.num4);

        num3 = getIntent().getExtras().getString("Value1");
        num4 = getIntent().getExtras().getString("Value2");

        no3.setText(num3);
        no4.setText(num4);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no3.getText().toString().equals("") || no4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1+a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

        min_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no3.getText().toString().equals("") || no4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1-a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

        multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no3.getText().toString().equals("") || no4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1*a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(no3.getText().toString().equals("") || no4.getText().toString().equals("")){
                    Toast.makeText(SecondActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1/a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

    }
}
