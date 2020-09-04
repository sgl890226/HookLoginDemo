package com.example.hooklogin;


import android.app.Application;

/**
 * Created by
 * 应用入口
 */

public class MyApplication extends Application {

    private static MyApplication context;//全局上下文
    public static  String pageName= "com.tal.kaoyan";
    public static MyApplication getAppContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

    }


}
