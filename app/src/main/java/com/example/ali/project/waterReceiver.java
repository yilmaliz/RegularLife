package com.example.ali.project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ali on 14.12.2017.
 */

public class waterReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        Intent reminder = new Intent(context,waterReminder.class);
        context.startService(reminder);
    }
}
