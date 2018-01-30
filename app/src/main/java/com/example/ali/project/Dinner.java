package com.example.ali.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Dinner extends AppCompatActivity {

    private String[] Dinner={"Choose","A Glass of Coke","A Beer Glass of Beer(500ml) ","A Glass of Ayran"
            ,"A Glass of Sparkling Water","Hamburger","One Slice Pizza","Chicken Sandwich"
            ,"Meat Sandwich","Chicken Wing","Schinitzel","Fried Fish","French Fries","One Bowl Soup"
            ,"One Bowl Rice","One Bowl Salad","Spaghetti Bolognez","A Plate of Homemade Food With Meat"
            ,"A Plate of Homemade Food With Chicken","A Plate of Homemade Food With Vegetable"
            ,"One Slice Bread"};


    private Spinner spinnerDinner1;
    private Spinner spinnerDinner2;
    private Spinner spinnerDinner3;
    private Spinner spinnerDinner4;
    private Spinner spinnerDinner5;
    private Spinner spinnerDinner6;
    private Spinner spinnerDinner7;
    private Spinner spinnerDinner8;
    private Spinner spinnerDinner9;
    private Spinner spinnerDinner10;

    private ArrayAdapter<String> dataAdapterForDinner;
    private int calorie1 = 0;
    private int calorie2 = 0;
    private int calorie3 = 0;
    private int calorie4 = 0;
    private int calorie5 = 0;
    private int calorie6 = 0;
    private int calorie7 = 0;
    private int calorie8 = 0;
    private int calorie9 = 0;
    private int calorie10 = 0;

    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private int num4 = 0;
    private int num5 = 0;
    private int num6 = 0;
    private int num7= 0;
    private int num8 = 0;
    private int num9 = 0;
    private int num10 = 0;

    private int sonuc =0;


    @Override // Bu metod uygulama açıldığında çalıştırılan metod.
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("hello", "O ne");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);


        final EditText value1= (EditText)findViewById(R.id.v1);
        final EditText value2= (EditText)findViewById(R.id.v2);
        final EditText value3= (EditText)findViewById(R.id.v3);
        final EditText value4= (EditText)findViewById(R.id.v4);
        final EditText value5= (EditText)findViewById(R.id.v5);
        final EditText value6= (EditText)findViewById(R.id.v6);
        final EditText value7= (EditText)findViewById(R.id.v7);
        final EditText value8= (EditText)findViewById(R.id.v8);
        final EditText value9= (EditText)findViewById(R.id.v9);
        final EditText value10= (EditText)findViewById(R.id.v10);





        spinnerDinner1 = (Spinner) findViewById(R.id.spinner1);
        spinnerDinner2 = (Spinner) findViewById(R.id.spinner2);
        spinnerDinner3 = (Spinner) findViewById(R.id.spinner3);
        spinnerDinner4 = (Spinner) findViewById(R.id.spinner4);
        spinnerDinner5 = (Spinner) findViewById(R.id.spinner5);
        spinnerDinner6 = (Spinner) findViewById(R.id.spinner6);
        spinnerDinner7 = (Spinner) findViewById(R.id.spinner7);
        spinnerDinner8 = (Spinner) findViewById(R.id.spinner8);
        spinnerDinner9 = (Spinner) findViewById(R.id.spinner9);
        spinnerDinner10 = (Spinner) findViewById(R.id.spinner10);


        dataAdapterForDinner = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,Dinner);


        dataAdapterForDinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerDinner1.setAdapter(dataAdapterForDinner);
        spinnerDinner2.setAdapter(dataAdapterForDinner);
        spinnerDinner3.setAdapter(dataAdapterForDinner);
        spinnerDinner4.setAdapter(dataAdapterForDinner);
        spinnerDinner5.setAdapter(dataAdapterForDinner);
        spinnerDinner6.setAdapter(dataAdapterForDinner);
        spinnerDinner7.setAdapter(dataAdapterForDinner);
        spinnerDinner8.setAdapter(dataAdapterForDinner);
        spinnerDinner9.setAdapter(dataAdapterForDinner);
        spinnerDinner10.setAdapter(dataAdapterForDinner);


        spinnerDinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie1 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie1 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie1 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie1 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie1 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie1 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie1 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie1 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie1 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie1 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie1 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie1 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie1 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie1 = 10;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie1 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie1 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie1 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie1 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie1 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie1 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie1 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie2 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie2 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie2 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie2 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie2 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie2 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie2 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie2 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie2 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie2 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie2 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie2 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie2 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie2 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie2 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie2 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie2 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie2 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie2 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie2 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie2 = 0;
                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie3 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie3 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie3 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie3 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie3 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie3 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie3 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie3 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie3 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie3 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie3 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie3 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie3 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie3 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie3 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie3 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie3 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie3 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie3 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie3 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie3 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie4 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie4 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie4 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie4 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie4 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie4 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie4 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie4 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie4 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie4 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie4 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie4 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie4 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie4 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie4 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie4 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie4 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie4 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie4 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie4 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie4 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie5 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie5 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie5 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie5 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie5 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie5 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie5 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie5 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie5 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie5 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie5 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie5 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie5 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie5 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie5 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie5 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie5 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie5 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie5 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie5 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie5 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie6 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie6 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie6 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie6 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie6 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie6 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie6 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie6 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie6 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie6 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie6 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie6 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie6 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie6 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie6 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie6 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie6 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie6 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie6 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie6 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie6 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie7 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie7 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie7 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie7 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie7 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie7 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie7 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie7 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie7 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie7 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie7 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie7 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie7 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie7 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie7 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie7 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie7 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie7 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie7 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie7 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie7 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie8 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie8 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie8 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie8 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie8 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie8 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie8 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie8 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie8 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie8 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie8 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie8 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie8 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie8 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie8 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie8 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie8 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie8 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie8 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie8 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie8 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie9 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie9 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie9 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie9 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie9 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie9 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie9 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie9 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie9 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie9 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie9 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie9 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie9 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie9 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie9 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie9 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie9 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie9 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie9 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie9 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie9 = 0;
                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerDinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(Dinner[1])) {
                    calorie10 = 89;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[2])) {
                    calorie10 = 210;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[3])) {
                    calorie10 = 76;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[4])) {
                    calorie10 = 0;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[5])) {
                    calorie10 = 295;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[6])) {
                    calorie10 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[7])) {
                    calorie10 = 299;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[8])) {
                    calorie10 = 240;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[9])) {
                    calorie10 = 38;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[10])) {
                    calorie10 = 285;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[11])) {
                    calorie10 = 220;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[12])) {
                    calorie10 = 111;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[13])) {
                    calorie10 = 70;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[14])) {
                    calorie10 = 180;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[15])) {
                    calorie10 = 45;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[16])) {
                    calorie10 = 424;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[17])) {
                    calorie10 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[18])) {
                    calorie10 = 194;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[19])) {
                    calorie10 = 108;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[20])) {
                    calorie10 = 90;
                }
                if (adapterView.getSelectedItem().toString().equals(Dinner[0])) {
                    calorie10 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        final TextView result = (TextView) findViewById(R.id.caltxt);


        Button rmndrA =findViewById(R.id.btn_cal) ;
        rmndrA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("hello", "O ne");

                if (value1.getText().toString().equals("")) {
                    num1 = 0;
                }
                else{
                    num1 = Integer.valueOf(value1.getText().toString());
                }

                if (value2.getText().toString().equals("")) {
                    num2 = 0;
                }
                else{
                    num2 = Integer.valueOf(value2.getText().toString());
                }
                if (value3.getText().toString().equals("")) {
                    num3 = 0;
                }
                else{
                    num3 = Integer.valueOf(value3.getText().toString());
                }

                if (value4.getText().toString().equals("")) {
                    num4 = 0;
                }
                else{
                    num4 = Integer.valueOf(value4.getText().toString());
                }

                if (value5.getText().toString().equals("")) {
                    num5 = 0;
                }
                else{
                    num5 = Integer.valueOf(value5.getText().toString());
                }
                if (value6.getText().toString().equals("")) {
                    num6 = 0;
                }
                else{
                    num6 = Integer.valueOf(value6.getText().toString());
                }

                if (value7.getText().toString().equals("")) {
                    num7 = 0;
                }
                else{
                    num7 = Integer.valueOf(value7.getText().toString());
                }
                if (value8.getText().toString().equals("")) {
                    num8= 0;
                }
                else{
                    num8 = Integer.valueOf(value8.getText().toString());
                }
                if (value9.getText().toString().equals("")) {
                    num9 = 0;
                }
                else{
                    num9 = Integer.valueOf(value9.getText().toString());
                }
                if (value10.getText().toString().equals("")) {
                    num10 = 0;
                }
                else{
                    num10 = Integer.valueOf(value10.getText().toString());
                }


                sonuc = (calorie1 * num1) + (calorie2 * num2) + (calorie3 * num3) + (calorie4 * num4) + (calorie5 * num5) +
                        (calorie6 * num6) + (calorie7 * num7) + (calorie8 * num8) + (calorie9 * num9) + (calorie10 * num10);

                Log.d("hello", "O ne");

                String as= "You get " +sonuc+ " kcal. ";



                result.setText(as);

            }
        });

    }

}
