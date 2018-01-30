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


public class Refreshment extends AppCompatActivity {

    private String[] refreshment={"Choose","Apple","Banana","Orange","One Slice Chocolate Cake","Pudding","Waffle",
            "Cookie","A Pakcet of Crisps","A Handful of Nuts","Popcorn"};


    private Spinner spinnerrefreshment1;
    private Spinner spinnerrefreshment2;
    private Spinner spinnerrefreshment3;
    private Spinner spinnerrefreshment4;
    private Spinner spinnerrefreshment5;
    private Spinner spinnerrefreshment6;
    private Spinner spinnerrefreshment7;
    private Spinner spinnerrefreshment8;
    private Spinner spinnerrefreshment9;
    private Spinner spinnerrefreshment10;

    private ArrayAdapter<String> dataAdapterForrefreshment;
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
        setContentView(R.layout.activity_refreshment);


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





        spinnerrefreshment1 = (Spinner) findViewById(R.id.spinner1);
        spinnerrefreshment2 = (Spinner) findViewById(R.id.spinner2);
        spinnerrefreshment3 = (Spinner) findViewById(R.id.spinner3);
        spinnerrefreshment4 = (Spinner) findViewById(R.id.spinner4);
        spinnerrefreshment5 = (Spinner) findViewById(R.id.spinner5);
        spinnerrefreshment6 = (Spinner) findViewById(R.id.spinner6);
        spinnerrefreshment7 = (Spinner) findViewById(R.id.spinner7);
        spinnerrefreshment8 = (Spinner) findViewById(R.id.spinner8);
        spinnerrefreshment9 = (Spinner) findViewById(R.id.spinner9);
        spinnerrefreshment10 = (Spinner) findViewById(R.id.spinner10);


        dataAdapterForrefreshment = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,refreshment);


        dataAdapterForrefreshment.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerrefreshment1.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment2.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment3.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment4.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment5.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment6.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment7.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment8.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment9.setAdapter(dataAdapterForrefreshment);
        spinnerrefreshment10.setAdapter(dataAdapterForrefreshment);


        spinnerrefreshment1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie1 = 47;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie1 = 131;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie1 = 47;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie1 = 75;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie1 = 132;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie1 = 291;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie1 = 52;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie1 = 719;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie1 = 135;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie1 = 246;
                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie1 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie2 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie2 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie2 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie2 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie2 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie2 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie2 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie2 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie2 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie2 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie2 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie3 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie3 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie3 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie3 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie3 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie3 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie3 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie3 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie3 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie3 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie3 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie4 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie4 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie4 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie4 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie4 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie4 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie4 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie4 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie4 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie4 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie4 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie5 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie5 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie5 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie5 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie5 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie5 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie5 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie5 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie5 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie5 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie5 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie6 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie6 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie6 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie6 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie6 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie6 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie6 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie6 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie6 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie6 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie6 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie7 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie7 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie7 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie7 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie7 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie7 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie7 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie7 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie7 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie7 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie7 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie8 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie8 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie8 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie8 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie8 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie8 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie8 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie8 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie8 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie8 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie8 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie9 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie9 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie9 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie9 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie9 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie9 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie9 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie9 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie9 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie9 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
                    calorie9 = 0;

                }}

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        spinnerrefreshment10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getSelectedItem().toString().equals(refreshment[1])) {
                    calorie10 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[2])) {
                    calorie10 = 131;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[3])) {
                    calorie10 = 47;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[4])) {
                    calorie10 = 75;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[5])) {
                    calorie10 = 132;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[6])) {
                    calorie10 = 291;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[7])) {
                    calorie10 = 52;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[8])) {
                    calorie10 = 719;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[9])) {
                    calorie10 = 135;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[10])) {
                    calorie10 = 246;

                }
                if (adapterView.getSelectedItem().toString().equals(refreshment[0])) {
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
