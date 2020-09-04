package com.example.hooklogin;


import android.app.Application;

/**
 * Created by
 * 应用入口
 */

public class MyApplication extends Application {

    private static MyApplication context;//全局上下文
    public static  String pageName= "com.tal.kaoyan"; //经过测试失败-hootlogin取值最早于APPlication 所以没有效果，放弃挣扎
    public static MyApplication getAppContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

    }


}
