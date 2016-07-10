package com.example.marcgregor.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
    }

    public void func_page5(View v){
        Intent i = new Intent(Page5Activity.this, Page6Activity.class);
        startActivity(i);
    }

}
