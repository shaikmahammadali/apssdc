package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etxt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etxt=(EditText)findViewById(R.id.Etxt);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        /*String str =etxt.getText().toString();
        Intent intent =new Intent(this,display.class);
        intent.putExtra("data",str);
        startActivity(intent);*/
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://codeforwin.org/2015/09/c-program-to-create-and-traverse-singly-linked-list.html"));
        startActivity(intent);

    }
}