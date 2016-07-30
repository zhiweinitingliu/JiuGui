package com.jiugui.shop.resetbuild.jiugui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jyd on 16/7/30.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContent();
        initView();
        initData();
    }

    /**
     * 设置activity的布局
     */
    public abstract void setContent();

    /**
     * 初始化控件
     */
    public abstract void initView();

    /**
     * 获取数据
     */
    public abstract void initData();
}
