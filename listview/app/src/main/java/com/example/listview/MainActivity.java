package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] names={"shaik","msahammafd","raju","niveda","anuradha","dell","laptop","kushal","keyboard","mouse","printer","monkey"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listview);
        /* arrayadapter has 3 parameters
        1- actvity address like this ,getcontext()
        2-style
        3-values
        * */
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);
    }
}