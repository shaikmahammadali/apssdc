package com.example.uicomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.uicomponents.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    String g,progress,userrating;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this ,R.layout.activity_main);




    }
    public void showdata(View view)
    {   String username= binding.userName.getText().toString();

        String phone= binding.userName.getText().toString();
        String password= binding.userName.getText().toString();

        String emailid= binding.userName.getText().toString();
        String address= binding.userName.getText().toString();
        if(binding.male.isChecked())
            g="male";
        else if(binding.female.isChecked())
            g="female";
        Intent intent =new Intent(this,details.class);
        startActivity(intent);
        intent.putExtra("username",username);
        intent.putExtra("emailid",emailid);
        intent.putExtra("phone",phone);
        intent.putExtra("password",password);
        intent.putExtra("address",address);
        intent.putExtra("gender",g);
        binding.rating.setOnRatingBarChangeListener(new RatingBar().setOnRatingBarChangeListener(););


    }
}