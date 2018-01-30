package com.example.ali.project;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.app.AlarmManager;
import android.content.Context;
import android.widget.CompoundButton;
import android.widget.Toast;
import java.util.Calendar;



public class ReminderActivity extends AppCompatActivity {

    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;
    private CheckBox cb6;
    private CheckBox cb7;
    private CheckBox cb8;
    private CheckBox cb9;
    private CheckBox cb10;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        cb1=(CheckBox)findViewById(R.id.cb_teeth);
        cb2=(CheckBox)findViewById(R.id.cb_pill);
        cb3=(CheckBox)findViewById(R.id.cb_water);
        cb4=(CheckBox)findViewById(R.id.cb_dishes);
        cb5=(CheckBox)findViewById(R.id.cb_cloth);
        cb6=(CheckBox)findViewById(R.id.cb_rubbish);
        cb7=(CheckBox)findViewById(R.id.cb_shop);
        cb8=(CheckBox)findViewById(R.id.cb_sport);
        cb9=(CheckBox)findViewById(R.id.cb_pet);
        cb10=(CheckBox)findViewById(R.id.cb_call);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb1.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb2.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb3.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb4.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb5.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb6.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb7.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb8.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        cb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb9.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });

        cb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(cb10.isChecked())
                    Toast.makeText(getApplicationContext(), buttonView.getText(), Toast.LENGTH_SHORT);
            }
        });


        Button show = (Button) findViewById(R.id.savebtn);

        show.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int noti=0;
                if(cb1.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_teeth=Calendar.getInstance();
                    calendar_teeth.set(Calendar.HOUR_OF_DAY,9);
                    calendar_teeth.set(Calendar.MINUTE,00);
                    calendar_teeth.set(Calendar.SECOND,00);

                    AlarmManager manager_teeth= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_teeth=new Intent(getApplicationContext(),teethReceiver.class);

                    PendingIntent alarmintent_teeth=PendingIntent.getBroadcast(getApplicationContext(),0,intent_teeth,0);
                    manager_teeth.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_teeth.getTimeInMillis(),1000*60*60*1,alarmintent_teeth);


                }
                if(cb2.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_pill=Calendar.getInstance();
                    calendar_pill.set(Calendar.HOUR_OF_DAY,9);
                    calendar_pill.set(Calendar.MINUTE,30);
                    calendar_pill.set(Calendar.SECOND,00);

                    AlarmManager manager_pill= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_pill=new Intent(getApplicationContext(),pillReceiver.class);

                    PendingIntent alarmintent_pill=PendingIntent.getBroadcast(getApplicationContext(),1,intent_pill,0);
                    manager_pill.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_pill.getTimeInMillis(),1000*60*60*1,alarmintent_pill);


                    }
                if(cb3.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_water=Calendar.getInstance();
                    calendar_water.set(Calendar.HOUR_OF_DAY,9);
                    calendar_water.set(Calendar.MINUTE,00);
                    calendar_water.set(Calendar.SECOND,00);

                    AlarmManager manager_water= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_water=new Intent(getApplicationContext(),waterReceiver.class);

                    PendingIntent alarmintent_water=PendingIntent.getBroadcast(getApplicationContext(),2,intent_water,0);
                    manager_water.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_water.getTimeInMillis(),1000*60*60*4,alarmintent_water);
                    }
                if(cb4.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_dish=Calendar.getInstance();
                    calendar_dish.set(Calendar.HOUR_OF_DAY,9);
                    calendar_dish.set(Calendar.MINUTE,00);
                    calendar_dish.set(Calendar.SECOND,00);

                    AlarmManager manager_dish= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_dish=new Intent(getApplicationContext(),dishReceiver.class);

                    PendingIntent alarmintent_dish=PendingIntent.getBroadcast(getApplicationContext(),3,intent_dish,0);
                    manager_dish.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_dish.getTimeInMillis(),1000*60*60*2,alarmintent_dish);
                    }
                if(cb5.isChecked()){
                    noti = noti+1 ;

                    Calendar  calendar_clothes=Calendar.getInstance();
                    calendar_clothes.setTimeInMillis(System.currentTimeMillis());
                    calendar_clothes.set(Calendar.HOUR_OF_DAY,2);
                    calendar_clothes.set(Calendar.MINUTE,00);
                    calendar_clothes.set(Calendar.SECOND,00);

                    AlarmManager manager_clothes= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_clothes=new Intent(getApplicationContext(),clothesReceiver.class);

                    PendingIntent alarmintent_clothes=PendingIntent.getBroadcast(getApplicationContext(),4,intent_clothes,0);
                    manager_clothes.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar_clothes.getTimeInMillis(),1000*60*60*24,alarmintent_clothes);


                    }
                if(cb6.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_rubbish=Calendar.getInstance();
                    calendar_rubbish.set(Calendar.HOUR_OF_DAY,10);
                    calendar_rubbish.set(Calendar.MINUTE,00);
                    calendar_rubbish.set(Calendar.SECOND,00);

                    AlarmManager manager_rub= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_rub=new Intent(getApplicationContext(),rubbishReceiver.class);

                    PendingIntent alarmintent_rub=PendingIntent.getBroadcast(getApplicationContext(),5,intent_rub,0);
                    manager_rub.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar_rubbish.getTimeInMillis(),1000*60*60*4,alarmintent_rub);
                    }
                if(cb7.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_shop=Calendar.getInstance();
                    calendar_shop.set(Calendar.HOUR_OF_DAY,17);
                    calendar_shop.set(Calendar.MINUTE,00);
                    calendar_shop.set(Calendar.SECOND,00);

                    AlarmManager manager_shop= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_shop=new Intent(getApplicationContext(),shopReceiver.class);

                    PendingIntent alarmintent_shop=PendingIntent.getBroadcast(getApplicationContext(),6,intent_shop,0);
                    manager_shop.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_shop.getTimeInMillis(),1000*60*60*24,alarmintent_shop);
                    }
                if(cb8.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_sport=Calendar.getInstance();
                    calendar_sport.set(Calendar.HOUR_OF_DAY,9);
                    calendar_sport.set(Calendar.MINUTE,30);
                    calendar_sport.set(Calendar.SECOND,00);

                    AlarmManager manager_sport= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent=new Intent(getApplicationContext(),sportReceiver.class);

                    PendingIntent alarmintent=PendingIntent.getBroadcast(getApplicationContext(),7,intent,0);
                    manager_sport.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_sport.getTimeInMillis(),1000*60*60*24,alarmintent);
                    }
                if(cb9.isChecked()){
                    noti = noti+1 ;

                    Calendar calendar_pet=Calendar.getInstance();
                    calendar_pet.set(Calendar.HOUR_OF_DAY,8);
                    calendar_pet.set(Calendar.MINUTE,00);
                    calendar_pet.set(Calendar.SECOND,00);

                    AlarmManager manager_pet= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_pet=new Intent(getApplicationContext(),petReceiver.class);

                    PendingIntent alarmintent_pet=PendingIntent.getBroadcast(getApplicationContext(),8,intent_pet,0);
                    manager_pet.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_pet.getTimeInMillis(),1000*60*60*12,alarmintent_pet);
                    }
                if(cb10.isChecked()){
                    noti = noti+1 ;


                    Calendar calendar_call=Calendar.getInstance();
                    calendar_call.set(Calendar.HOUR_OF_DAY,15);
                    calendar_call.set(Calendar.MINUTE,00);
                    calendar_call.set(Calendar.SECOND,00);

                    AlarmManager manager_call= (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                    Intent intent_call=new Intent(getApplicationContext(),callReceiver.class);

                    PendingIntent alarmintent_call=PendingIntent.getBroadcast(getApplicationContext(),9,intent_call,0);
                    manager_call.setInexactRepeating(AlarmManager.RTC_WAKEUP,calendar_call.getTimeInMillis(),1000*60*60*24,alarmintent_call);
                    }

                if(noti==1){
                    String sonuc = noti+ " reminder has saved";
                    Toast.makeText(getApplicationContext(), sonuc, Toast.LENGTH_LONG).show();
                } else if (noti==0){
                        String sonuc = "There is no reminder has saved";
                        Toast.makeText(getApplicationContext(), sonuc, Toast.LENGTH_LONG).show();
                }else {
                    String sonuc = noti + " reminders have saved";
                    Toast.makeText(getApplicationContext(), sonuc, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}



