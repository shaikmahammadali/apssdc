package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.uicomponents.databinding.ActivityMainBinding;

public class Second extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_second);
        Intent i=getIntent();
        String a= i.getStringExtra("hai");
        binding.tv.setText(a);
    }
}