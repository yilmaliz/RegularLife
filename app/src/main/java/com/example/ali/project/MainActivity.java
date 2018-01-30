package com.example.ali.project;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    ImageView i2;
    TextView kullanıcıIsmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullanıcıIsmi=(TextView)findViewById(R.id.kllncısmi);
        Bundle alınanIsim=getIntent().getExtras();
        String alınmısIsim=alınanIsim.getString("isim");
        kullanıcıIsmi.setText(alınmısIsim);



        Button alarmbtn = findViewById(R.id.alarmbtn);
        alarmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ali = new  Intent(MainActivity.this, AlarmActivity.class);
                startActivity(ali);
            }
        });

        Button rmndrA =findViewById(R.id.reqbtn) ;
        rmndrA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(MainActivity.this,ReminderActivity.class);
                startActivity(inte);
            }
        });

        Button calorieCalculater =findViewById(R.id.calculatebtn);
        calorieCalculater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hesapla = new Intent(MainActivity.this, CalorieActivity.class);
                startActivity(hesapla);
            }
        });
        Button infobtn =findViewById(R.id.helpbtn);
        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(MainActivity.this, infoActivity.class);
                startActivity(info);
            }
        });

    }

}


