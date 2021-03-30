package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView exp,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exp=findViewById(R.id.textView);
        res=findViewById(R.id.result);

    }


    public void equal(View view) {
    }

    public void point(View view) {
        exp.append(".");
    }

    public void zero(View view) {
        exp.append("0");
    }

    public void squareroot(View view) {
        exp.append("√");
    }

    public void addition(View view) {
        exp.append("+");
    }

    public void three(View view) {
        exp.append("3");
    }

    public void two(View view) {
        exp.append("2");
    }

    public void one(View view) {
        exp.append("1");
    }

    public void subtraction(View view) {
        exp.append("-");
    }

    public void six(View view) {
        exp.append("6");
    }

    public void four(View view) {
        exp.append("4");
    }

    public void multiplication(View view) {
        exp.append("*");
    }

    public void eight(View view) {
        exp.append("8");
    }

    public void seven(View view) {
        exp.append("7");
    }

    public void division(View view) {
        exp.append("/");
    }

    public void exponent(View view) {
        exp.append("^");
    }

    public void paranthesis(View view) {

    }

    public void clear(View view) {
        exp.setText("");
    }

    public void backspace(View view) {
        String temp=exp.getText().toString();
        if (!temp.isEmpty())
        {int n =temp.length()-1;
        exp.setText(temp.substring(0,n));}
    }

    public void five(View view) {
        exp.append("5");
    }

    public void nine(View view) {
        exp.append("9");
    }
}