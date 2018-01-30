package com.example.ali.project;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    EditText isim;
    Bundle bnd;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bnd = new Bundle();
        isim=(EditText)findViewById(R.id.txtname);
        final Intent i= new Intent(getApplicationContext(),MainActivity.class);


        Button btnlogn = (Button) findViewById(R.id.btnlogn);
        btnlogn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alınanIsim=isim.getText().toString();
                bnd.putString("isim",alınanIsim);
                i.putExtras(bnd);
                startActivity(i);

            }


        });


    }




    }




