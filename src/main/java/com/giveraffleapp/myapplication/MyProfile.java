package com.giveraffleapp.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.andela_my_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getWindow().setStatusBarColor(getResources().getColor(R.color.Andela_blue));


//        TextView Textview1 = findViewById(R.id.textview_header1);
//        TextView Textview2 = findViewById(R.id.textView_header2);
//        TextView Textview3= findViewById(R.id.textView_header3);
//        TextView Textview4 = findViewById(R.id.textView_header4);
//        TextView Textview5= findViewById(R.id.textView_header5);

    }

}
