package com.example.capstone.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Market extends AppCompatActivity { //전자 욕실 등 6가지 item이 있고 클릭시 해당하는 카테고리로 넘어감.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton btn1 = (ImageButton) findViewById(R.id.Electronic);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Market.this,listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.Bathroom);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Market.this,listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn3 = (ImageButton) findViewById(R.id.Kitchen);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Market.this,listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn4 = (ImageButton) findViewById(R.id.Office);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Market.this,listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn5 = (ImageButton) findViewById(R.id.Interior);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Market.this,listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn6 = (ImageButton) findViewById(R.id.Daily_supplies);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Market.this,listActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}


