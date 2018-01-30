package com.example.ali.project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ali on 15.12.2017.
 */

public class rubbishReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        Intent reminder = new Intent(context,rubbishReminder.class);
        context.startService(reminder);
    }

}
