package com.example.marcgregor.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }


    public void func_page1(View v){
        Intent i = new Intent(Page1Activity.this, Page2Activity.class);
        startActivity(i);
    }
}
