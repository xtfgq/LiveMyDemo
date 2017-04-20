package com.example.livemydemo;

import android.app.Application;
import com.tencent.TIMManager;


public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TIMManager.getInstance().init(getApplicationContext());
    }


}
