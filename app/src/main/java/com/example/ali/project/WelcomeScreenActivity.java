package com.example.ali.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeScreenActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    Thread mythread= new Thread(){
        public void run(){
            try{

                sleep(4000);
                Intent intent =new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                finish();
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
    };
        mythread.start();
    }
}
