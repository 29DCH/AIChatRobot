package com.tensorflow.chatinterface;

import android.app.Application;
import android.content.Context;

/**
 * Description:自定义的Application
 */
public class ChatApplication extends Application {

    //一个全局的Context变量
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
}
