package com.example.marcgregor.youtubedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Page7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
    }


    public void func_page7(View v){
        Intent i = new Intent(Page7Activity.this, Page8Activity.class);
        startActivity(i);
    }

}
