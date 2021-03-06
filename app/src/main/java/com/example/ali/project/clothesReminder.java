package com.example.ali.project;

/**
 * Created by ali on 15.12.2017.
 */

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class clothesReminder extends Service {
    android.support.v4.app.NotificationCompat.Builder notification;
    private static final int uniqueID=  5;

    @Override
    public void onStart(Intent intent, int startId) {


        notification = new android.support.v4.app.NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        Log.d("clothesReminder", "onCreate");
        setNotification();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        notification = new android.support.v4.app.NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        Log.d("clothesReminder", "onCreate");
        setNotification();
        return START_STICKY;

    }
    public void setNotification(){
        notification.setSmallIcon(R.drawable.ic_info);
        notification.setTicker("ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Regular Life");
        notification.setContentText("HADİ GİT YAT VAKİT HAYLİ ÇOK GEÇ OLDU GİT YATTT");

        Intent noti = new Intent(this,clothesReminder.class);
        PendingIntent pendinIntent = PendingIntent.getActivities(this,0, new Intent[]{noti},PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendinIntent);
        NotificationManager nm =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID,notification.build());

    }
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
