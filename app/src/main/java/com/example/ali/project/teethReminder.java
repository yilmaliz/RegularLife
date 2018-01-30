package com.example.ali.project;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class teethReminder extends Service {
    android.support.v4.app.NotificationCompat.Builder notification;
    private static final int uniqueID=  1;


    public void onStart(Intent intent, int startId) {


        notification = new android.support.v4.app.NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        Log.d("sportReminder", "onCreate");
        setNotification();

    }

    public int onStartCommand(Intent intent, int flags, int startId) {

        notification = new android.support.v4.app.NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        Log.d("sportReminder", "onCreate");
        setNotification();
        return START_STICKY;

    }

    public void setNotification(){
        notification.setSmallIcon(R.drawable.ic_info);
        notification.setTicker("MALATYA'YA ATANMAK İÇİN");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("KPSS");
        notification.setContentText("DERS ÇALIŞŞŞŞŞŞŞŞŞ");

        Intent noti = new Intent(this,teethReminder.class);
        PendingIntent pendinIntent = PendingIntent.getActivities(this,0, new Intent[]{noti},PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendinIntent);
        NotificationManager nm =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID,notification.build());

    }
    public IBinder onBind(Intent intent)
    {
        return null;
    }



}
