package com.example.tashi_tsering.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class test_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();//get hundle of those three menu or fill the menu

        inflater.inflate(R.menu.menu_main,menu);

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())

        {
            case R.id.settings:
                Toast.makeText(this,"now you can configure",Toast.LENGTH_LONG).show();
                return true;
            case R.id.about:
                Toast.makeText(this,"my name is tashi tsering",Toast.LENGTH_LONG).show();
                return true;
            case R.id.contact:
                Toast.makeText(this,"www.sontsa.com",Toast.LENGTH_LONG).show();
                return true;



        }

        return super.onOptionsItemSelected(item);
    }
}
