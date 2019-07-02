package com.coolopool.coolopool.Application;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class MyApplication extends Application {


    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();

    }

    public static Context getAppContext(){
        return MyApplication.context;
    }
}
