package com.naa.myparkage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5;
    EditText editText1, editText2;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView1 = (TextView) findViewById(R.id.textView1);


    }

    public void buttonSum(View view) {
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        int ans = num1 + num2;

        textView1.setText(String.valueOf(ans));



    }

    public void butnsub(View view) {
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        int ans = num1 - num2;
        textView1.setText(String.valueOf(ans));

    }

    public void buttmult(View view) {
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        int ans = num1 * num2;
        textView1.setText(String.valueOf(ans));

    }

    public void buttnmodulus(View view) {
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        int ans = num1 % num2;
        textView1.setText(String.valueOf(ans));

    }




    public void buttexponent(View view) {
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        double ans = Math.pow(num1,num2);
        textView1.setText(Double.toString(ans));
    }

    public void buttdivision(View view) {
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        int ans = num1 /num2;
        textView1.setText(String.valueOf(ans));
    }
}