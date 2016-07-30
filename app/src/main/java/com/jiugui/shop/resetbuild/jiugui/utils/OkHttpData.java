package com.jiugui.shop.resetbuild.jiugui.utils;

import android.content.Context;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by jyd on 16/7/29.
 */
public class OkHttpData {

    Context context;

    /**
     * 超时时间5秒
     */
    private final int CONNECT_TIME_OUT = 5000;

    public OkHttpData(Context context) {
        this.context = context;
    }

    /**
     * get请求没有参数
     *
     * @param callback
     * @param url
     * @throws IOException
     */
    public void get(Callback callback, String url) throws IllegalArgumentException {
        OkHttpUtils.get()
                .url(url)
                .tag(context)
                .build()
                .connTimeOut(CONNECT_TIME_OUT)
                .execute(callback);

    }

    /**
     * get请求有参数
     *
     * @param callback
     * @param url
     * @param params
     * @throws IOException
     */
    public void get(Callback callback, String url, HashMap<String, String> params) throws IllegalArgumentException {
        OkHttpUtils.get()
                .url(url)
                .tag(context)
                .params(params)
                .build()
                .connTimeOut(CONNECT_TIME_OUT)
                .execute(callback);
    }


    /**
     * post请求没有参数
     *
     * @param callback
     * @param url
     * @throws IllegalArgumentException
     */
    public void post(Callback callback, String url) throws IllegalArgumentException {
        OkHttpUtils.post()
                .url(url)
                .tag(context)
                .build()
                .connTimeOut(CONNECT_TIME_OUT)
                .execute(callback);
    }

    /**
     * post请求有参数
     *
     * @param callback
     * @param url
     * @param params
     * @throws IllegalArgumentException
     */
    public void post(Callback callback, String url, HashMap<String, String> params) throws IllegalArgumentException {
        OkHttpUtils.post()
                .url(url)
                .tag(context)
                .params(params)
                .build()
                .connTimeOut(CONNECT_TIME_OUT)
                .execute(callback);
    }

}
