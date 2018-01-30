package com.example.ali.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class CalorieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);

        Button breakfastbtn = findViewById(R.id.btn_br);
        breakfastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bri = new Intent(CalorieActivity.this, Breakfast.class);
                startActivity(bri);
            }

        });

        Button lunchbtn = findViewById(R.id.btn_lnch);
        lunchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent li = new Intent(CalorieActivity.this, Lunch.class);
                startActivity(li);
            }

        });

        Button dinnerbtn = findViewById(R.id.btn_dn);
        dinnerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent di = new Intent(CalorieActivity.this,Dinner.class);
                startActivity(di);
            }

        });

        Button refbtn = findViewById(R.id.btn_ref);
        refbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ri = new Intent(CalorieActivity.this, Refreshment.class);
                startActivity(ri);
            }


        });
    }
}