package com.example.livemydemo;

import android.app.Application;
import com.tencent.TIMManager;

/**
 * Created by zhuguohui on 2016/9/14.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TIMManager.getInstance().init(getApplicationContext());
    }


}
