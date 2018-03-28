package com.example.sky.skyproduct;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sky on 2018/3/1.
 */

public class NotificationActivity extends Activity implements View.OnClickListener{
    static final int NOTIFICATION_ID = 0x123;
    NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview);
        nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn:{
                this.send(null);
            }break;
        }
    }
    public void send(View source){
        Intent intent = new Intent(NotificationActivity.this,TextViewActivity.class);
        PendingIntent pi = PendingIntent.getActivity(NotificationActivity.this,0,intent,0);
        Notification notify = new Notification.Builder(this)
                .setAutoCancel(true)
                .setTicker("有新消息")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("一条通知")
                .setContentText("一条通知ededaddadas")
                .setContentIntent(pi).build();
        nm.notify(NOTIFICATION_ID,notify);
    }
    public void  del(View v){
        nm.cancel(NOTIFICATION_ID);
    }
}
