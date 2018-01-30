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


public class Breakfast extends AppCompatActivity {

    private String[] breakfast={"Choose","A Glass of Milk","A Glass of Orange Juice"
            ,"A Piece of Cheese (20gr)","One Egg","A Spoon of Peanut Butter","One Slice Bread"
            ,"Olive (100gr)","Pancake","A Handful of Nuts","A Bowl of Cornflakes"};


    private Spinner spinnerbreakfast1;
    private Spinner spinnerbreakfast2;
    private Spinner spinnerbreakfast3;
    private Spinner spinnerbreakfast4;
    private Spinner spinnerbreakfast5;
    private Spinner spinnerbreakfast6;
    private Spinner spinnerbreakfast7;
    private Spinner spinnerbreakfast8;
    private Spinner spinnerbreakfast9;
    private Spinner spinnerbreakfast10;

    private ArrayAdapter<String> dataAdapterForbreakfast;
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
        setContentView(R.layout.activity_breakfast);


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





        spinnerbreakfast1 = (Spinner) findViewById(R.id.spinner1);
        spinnerbreakfast2 = (Spinner) findViewById(R.id.spinner2);
        spinnerbreakfast3 = (Spinner) findViewById(R.id.spinner3);
        spinnerbreakfast4 = (Spinner) findViewById(R.id.spinner4);
        spinnerbreakfast5 = (Spinner) findViewById(R.id.spinner5);
        spinnerbreakfast6 = (Spinner) findViewById(R.id.spinner6);
        spinnerbreakfast7 = (Spinner) findViewById(R.id.spinner7);
        spinnerbreakfast8 = (Spinner) findViewById(R.id.spinner8);
        spinnerbreakfast9 = (Spinner) findViewById(R.id.spinner9);
        spinnerbreakfast10 = (Spinner) findViewById(R.id.spinner10);


        dataAdapterForbreakfast = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,breakfast);


        dataAdapterForbreakfast.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerbreakfast1.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast2.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast3.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast4.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast5.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast6.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast7.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast8.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast9.setAdapter(dataAdapterForbreakfast);
        spinnerbreakfast10.setAdapter(dataAdapterForbreakfast);


        spinnerbreakfast1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie1 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie1 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie1 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie1 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie1 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie1 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie1 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie1 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie1 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie1 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie1 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie2 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie2 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie2 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie2 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie2 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie2 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie2 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie2 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie2 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie2 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie2 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie3 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie3 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie3 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie3 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie3 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie3 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie3 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie3 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie3 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie3 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie3 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie4 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie4 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie4 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie4 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie4 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie4 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie4 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie4 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie4 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie4 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie4 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie5 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie5 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie5 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie5 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie5 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie5 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie5 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie5 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie5 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie5 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie5 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie6 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie6 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie6 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie6 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie6 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie6 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie6 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie6 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie6 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie6 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie6 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie7 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie7 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie7 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie7 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie7 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie7 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie7 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie7 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie7 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie7 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie7 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie8 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie8 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie8 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie8 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie8 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie8 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie8 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie8 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie8 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie8 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie8 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie9 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie9 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie9 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie9 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie9 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie9 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie9 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie9 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie9 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie9 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
                    calorie9 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerbreakfast10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(breakfast[1])) {
                    calorie10 = 150;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[2])) {
                    calorie10 = 100;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[3])) {
                    calorie10 = 60;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[4])) {
                    calorie10 = 80;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[5])) {
                    calorie10 = 35;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[6])) {
                    calorie10 = 90;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[7])) {
                    calorie10 = 115;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[8])) {
                    calorie10 = 227;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[9])) {
                    calorie10 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[10])) {
                    calorie10 = 179;

                }
                if (adapterView.getSelectedItem().toString().equals(breakfast[0])) {
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
