package com.example.tashi_tsering.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class list_view_test extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);


        lv = (ListView) findViewById(R.id.prolist);

        String values[] ={"c","c++","Java","c#","Assembly","Pytho","Ruby","VB","Scala"};

        //Adapter



    }
}
