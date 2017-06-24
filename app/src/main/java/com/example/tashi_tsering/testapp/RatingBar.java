package com.example.tashi_tsering.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class RatingBar extends AppCompatActivity {

    android.widget.RatingBar rb;
    TextView rvalue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_rating_bar);


        rb = (android.widget.RatingBar) findViewById(R.id.ratingBar);
        rvalue = (TextView) findViewById(R.id.rvalue);


        rb.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(android.widget.RatingBar ratingBar, float v, boolean b)
            {

               rvalue.setText("value is " + v);

            }
        });






    }

}
