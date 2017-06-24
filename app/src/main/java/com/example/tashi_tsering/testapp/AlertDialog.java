package com.example.tashi_tsering.testapp;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlertDialog extends AppCompatActivity {


    TextView txtName,txtAcc,txtBal;
    Button btnName,btnAcc,btnBal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        txtName = (TextView) findViewById(R.id.txtName);
        txtAcc = (TextView) findViewById(R.id.txtAcc);
        txtBal = (TextView) findViewById(R.id.txtBal);

        btnName = (Button) findViewById(R.id.btnName);
        btnAcc = (Button) findViewById(R.id.btnAcc);
        btnBal = (Button) findViewById(R.id.btnBal);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtName.setText("Tashi");


            }
        });

        btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtAcc.setText("SBI1234567");

            }
        });

        // Builder Design Pattern in Java

        btnBal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              // we use inflate to fill the dialog box with login page we created
                View v = LayoutInflater.from(AlertDialog.this).inflate(R.layout.activity_demo_alert,null);

                final EditText username = view.findViewById(R.id.username);
                final EditText password = view.findViewById(R.id.password);

                android.support.v7.app.AlertDialog.Builder  builder= new android.support.v7.app.AlertDialog.Builder(AlertDialog.this);

                builder.setMessage("login Here")
                        .setView(v)
                        .setPositiveButton("Login", new DialogInterface.OnClickListener() { // onclicklistener for dialog positive
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i)
                            {
                                String u = username.getText().toString();
                                String p = password.getText().toString();

                                if(u.equals("tashi") && p.equals("0000"))
                                    txtBal.setText("5000"); // showing the balance after click the ok
                                else
                                    txtBal.setText("100");

                            }
                        })

                        .setNegativeButton("Cancel",null)// onclicklistner for dialog negative
                        .setCancelable(false);


                android.support.v7.app.AlertDialog alert = builder.create(); //create alert box
                alert.show();



            }
        });


    }
    @Override
    public void onBackPressed() // using the back button
    {
        android.support.v7.app.AlertDialog.Builder  builder= new android.support.v7.app.AlertDialog.Builder(AlertDialog.this);
        builder.setTitle("Really Exit ?");
        builder.setMessage("Are You Sure ?")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() { // onclicklistener for dialog positive
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                       AlertDialog.super.onBackPressed();

                    }
                })

                .setNegativeButton("Cancel",null).setCancelable(false); // clicking the outside dialog still unchange 

        android.support.v7.app.AlertDialog alert = builder.create(); //create alert box
        alert.show();

    }


}
