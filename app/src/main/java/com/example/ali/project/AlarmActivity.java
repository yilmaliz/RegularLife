package com.example.ali.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        Button pzt = findViewById(R.id.btnmon);
        Button sal = findViewById(R.id.btntue);
        Button crs = findViewById(R.id.btnwed);
        Button prs = findViewById(R.id.btnthu);
        Button cum = findViewById(R.id.btnfrı);
        Button cmt = findViewById(R.id.btnsat);
        Button pzr = findViewById(R.id.btnsun);
        Button hic = findViewById(R.id.btnday);
        Button hsn = findViewById(R.id.btnend);
        pzt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo);
            }

        });
        sal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo1 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo1);
            }

        });
        crs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo2 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo2);
            }

        });
        prs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo3 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo3);
            }

        });
        cum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo4 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo4);
            }

        });
        cmt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo5 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo5);
            }

        });
        pzr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo6 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo6);
            }

        });
        hic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo7 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo7);
            }

        });
        hsn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent niyo8 = new Intent(AlarmActivity.this, SetAlarmActivity.class);
                startActivity(niyo8);
            }

        });
    }
    public void startTimer(View view) {
    }
}
