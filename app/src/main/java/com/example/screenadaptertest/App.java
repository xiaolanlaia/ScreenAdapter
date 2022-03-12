package com.example.screenadaptertest;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by wenkaichuang on 2017/8/11.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //需要传入ui设计给的大小
        new ScreenAdaptation(this, 411).register();
    }
}
