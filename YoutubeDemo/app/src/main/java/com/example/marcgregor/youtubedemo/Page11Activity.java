package com.example.marcgregor.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
    }


    public void func_page11(View v){
        Intent i = new Intent(Page11Activity.this, Page12Activity.class);
        startActivity(i);
    }

    public void func_page11a(View v){
        Intent i = new Intent(Page11Activity.this, Page15Activity.class);
        startActivity(i);
    }

    public void func_page11b(View v){
        Intent i = new Intent(Page11Activity.this, Page13Activity.class);
        startActivity(i);
    }
}
