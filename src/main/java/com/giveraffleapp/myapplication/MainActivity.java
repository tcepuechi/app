package com.giveraffleapp.myapplication;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button aboutMe;
    private Button about;
   // private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        getWindow().setStatusBarColor(getResources().getColor(R.color.Andela_blue));
        about = findViewById(R.id.button_aboutalc);

        about.setOnClickListener((View v) -> {
            Intent intent = new Intent(MainActivity.this, AboutAndela.class);
            intent.putExtra("urls","https://pluralsight.com" );
            startActivity(intent);



       });
        aboutMe = findViewById(R.id.button_myprofile);
        aboutMe.setOnClickListener((View v) -> {
                Intent intent = new Intent(MainActivity.this, MyProfile.class);
                startActivity(intent);



        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

