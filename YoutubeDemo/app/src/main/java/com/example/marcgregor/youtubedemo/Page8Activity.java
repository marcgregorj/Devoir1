package com.example.marcgregor.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
    }

    public void func_page8(View v){
        Intent i = new Intent(Page8Activity.this, page9Activity.class);
        startActivity(i);
    }

    public void func_page8a(View v){
        Intent i = new Intent(Page8Activity.this, Page10Activity.class);
        startActivity(i);
    }
}
