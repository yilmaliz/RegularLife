package com.example.ali.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Lock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);


        final TextView sayı1=(TextView)findViewById(R.id.txt_n2);
        final TextView sayı2=(TextView)findViewById(R.id.txt_n1);
        final EditText cevp= (EditText)findViewById(R.id.txt_ans);


        Random rnd1 =new Random();
        int ara=rnd1.nextInt(900)+100;
        sayı1.setText(Integer.toString(ara));

        Random rnd2 =new Random();
        int ara1=rnd2.nextInt(900)+100;
        sayı2.setText((Integer.toString(ara1)));

        final int cevap;
        cevap=(ara+ara1);



        final Button alarmbtn = findViewById(R.id.btn_wakeup);
        alarmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int sayi1 = Integer.valueOf(cevp.getText().toString());
                if(sayi1 == cevap){
                    System.exit(0);
                }
            }
        });

    }
}
