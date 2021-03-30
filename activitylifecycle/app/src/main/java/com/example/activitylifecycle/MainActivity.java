package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        textView.append("onCreate() \n ");
        Log.i("MainActivity","Oncreate()");
        Toast.makeText(this, "App is created", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart() \n ");
        Log.i("MainActivity","onStart()");
        Toast.makeText(this, "App is Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume() \n ");
        Log.i("MainActivity","Onresume()");
        Toast.makeText(this, "App is Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause() \n ");
        Log.i("MainActivity","onPause()");
        Toast.makeText(this, "App is paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop() \n ");
        Log.i("MainActivity","onStop()");
        Toast.makeText(this, "App is onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("reStart() \n ");
        Log.i("MainActivity","onRestart()");
        Toast.makeText(this, "App is reStarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy() \n ");
        Log.i("MainActivity","onDestroy()");
        Toast.makeText(this, "App is Destroyed", Toast.LENGTH_SHORT).show();
    }
}