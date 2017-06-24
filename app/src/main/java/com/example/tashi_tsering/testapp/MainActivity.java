package com.example.tashi_tsering.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv,tv1;
    SeekBar sb;
    Button rbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb =(SeekBar) findViewById(R.id.seekBar);
        tv = (TextView) findViewById(R.id.value);
        tv1 = (TextView) findViewById(R.id.v);
        rbutton = (Button) findViewById(R.id.Rat_btn);

        rbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            {

                Intent rintent = new Intent(MainActivity.this,test_menu.class);
                startActivity(rintent);
                finish();

            }
        });


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {

                tv.setTextSize(i);
                tv1.setText(i + "");


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

                Toast.makeText(MainActivity.this,"Started",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
