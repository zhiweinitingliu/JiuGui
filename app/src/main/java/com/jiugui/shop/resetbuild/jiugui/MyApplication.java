package com.jiugui.shop.resetbuild.jiugui;

import android.app.Application;

import com.yolanda.nohttp.NoHttp;

/**
 * Created by wang on 2016/9/5.
 */
public class MyApplication  extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        NoHttp.initialize(this);
    }
}
