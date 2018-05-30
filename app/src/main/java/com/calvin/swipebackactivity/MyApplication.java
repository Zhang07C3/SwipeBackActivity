package com.calvin.swipebackactivity;

import android.app.Application;

import com.calvin.swipeback.ActivityLifecycleHelper;

/**
 * Created by zhangming on 2018-05-30.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(ActivityLifecycleHelper.build());
    }
}
