package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.uidesign.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String rate,seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil. setContentView(this,R.layout.activity_main);
       binding.togglebtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked)
                   Toast.makeText(MainActivity.this, "Toggled On", Toast.LENGTH_SHORT).show();
               else
                   Toast.makeText(MainActivity.this, "Toggled Off", Toast.LENGTH_SHORT).show();
           }
       });
       binding.ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
           @Override
           public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                rate=String.valueOf(rating);
           }
       });
       binding.seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               seek=String.valueOf(progress);
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });

    }

    public void showdata(View view) {
        String username=binding.username.getText().toString();
        String emailid=binding.emailid.getText().toString();
        String phone=binding.phone.getText().toString();
        String password=binding.password.getText().toString();
        String address=binding.address.getText().toString();
        Intent intent=new Intent(this,display.class);
        intent.putExtra("username",username);
        intent.putExtra("emailid",emailid);
        intent.putExtra("phone",phone);
        intent.putExtra("password",password);
        intent.putExtra("address",address);
        intent.putExtra("rating",rate);
        intent.putExtra("progress",seek);
        startActivity(intent);

    }
}