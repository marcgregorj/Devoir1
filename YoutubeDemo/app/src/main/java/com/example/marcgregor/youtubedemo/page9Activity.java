package com.example.marcgregor.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);
    }


    public void func_page9(View v){
        Intent i = new Intent(page9Activity.this, Page8Activity.class);
        startActivity(i);
    }


    public void func_page9a(View v){
        Intent i = new Intent(page9Activity.this, Page10Activity.class);
        startActivity(i);
    }
}
