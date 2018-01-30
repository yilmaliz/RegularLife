package com.example.ali.project;



import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class RingtonePlayingService extends Service {

    private boolean isRunning;
    private Context context;
    MediaPlayer mMediaPlayer;
    private int startId;


    @Nullable

    public IBinder onBind(Intent intent) {
        Log.e("MyActivity", "In the Richard service");
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Intent in7 =new Intent(RingtonePlayingService.this,Lock.class);
        in7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(in7);



        String state = intent.getExtras().getString("extra");

        Log.e("what is going on here  ", state);

        assert state != null;
        switch (state) {
            case "no":
                startId = 0;
                break;
            case "yes":
                startId = 1;
                break;
            default:
                startId = 0;
                break;
        }


        if(!this.isRunning && startId == 1) {
            Log.e("if there was not sound ", " and you want start");
            mMediaPlayer = MediaPlayer.create(this, R.raw.richard_dawkins_1);
            mMediaPlayer.start();


           // mNM.notify(0, mNotify);

            this.isRunning = true;
            this.startId = 0;

        }
        else if (!this.isRunning && startId == 0){
            Log.e("if there was not sound ", " and you want end");

            this.isRunning = false;
            this.startId = 0;

        }

        else if (this.isRunning && startId == 1){
            Log.e("if there is sound ", " and you want start");

            this.isRunning = true;
            this.startId = 0;

        }
        else {
            Log.e("if there is sound ", " and you want end");

            mMediaPlayer.stop();
            mMediaPlayer.reset();

            this.isRunning = false;
            this.startId = 0;
        }


        Log.e("MyActivity", "In the service");

        return START_NOT_STICKY;

    }


    @Override
    public void onDestroy() {
        Log.e("JSLog", "on destroy called");
        super.onDestroy();

        this.isRunning = false;
    }









}


   /* final NotificationManager mNM = (NotificationManager)
            getSystemService(NOTIFICATION_SERVICE);


    Intent intent1 = new Intent(this.getApplicationContext(), MainActivity.class);
    PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent1, 0);

    Notification mNotify  = new Notification.Builder(this)
            .setContentTitle("Kalk La Kalk " + "!")
            .setContentText("Click me!")
            .setSmallIcon(R.drawable.ic_alarm2)
            .setContentIntent(pIntent)
            .setAutoCancel(true)
            .build();
*/