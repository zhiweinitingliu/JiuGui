package com.jiugui.shop.resetbuild.jiugui.widget;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jiugui.shop.resetbuild.jiugui.R;

/**
 * Created by jyd on 16/8/2.
 */
public class JiuToolbar extends LinearLayout {

    public Toolbar toolbar;

    private static final String TAG = "HomeBar";

    /**
     * 居中标题
     */
    private TextView textView;

    public JiuToolbar(Context context) {
        this(context, null);
    }

    public JiuToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public JiuToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        View view = LayoutInflater.from(context).inflate(R.layout.jiu_toolbar, null);

        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.mipmap.back_button);

        textView = new TextView(context);
        textView.setTextSize(25);
        textView.setText("首页");
        Toolbar.LayoutParams lp_toolbar = new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
        toolbar.addView(textView, lp_toolbar);

        LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        addView(view);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "onMeasure: " + getMeasuredWidth());
        Log.e(TAG, "onMeasure: " + getMeasuredHeight());
    }
}
