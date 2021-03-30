package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {
    TextView textView;String u,e,p,pssd,address,rate,seek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_display);
        textView=findViewById(R.id.text);
        Intent intent=getIntent();
        u=intent.getStringExtra("username");
        e=intent.getStringExtra("emailid");
        p=intent.getStringExtra("phone");
        pssd=intent.getStringExtra("password");
        address=intent.getStringExtra("address");
        rate=intent.getStringExtra("rating");
        seek=intent.getStringExtra("progress");

        textView.setText("Username : "+ u +"\n"+
                        "emailid : "+ e +"\n"+
                        "phone : "+p+"\n"+
                        "adress : "+address+"\n"+
                "rating : "+rate+"\n"+
                    "progress"+seek+"\n");

    }
}