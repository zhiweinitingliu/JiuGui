package com.jiugui.shop.resetbuild.jiugui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.jiugui.shop.resetbuild.jiugui.R;

/**
 * Created by wdk on 16/8/1.
 */
public class MyView extends View {

    /**
     * 定义画笔
     */
    private Paint paintLine;
    private Paint paintCicle;

    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
        initView();
    }

    private void init() {
        /**
         * 画线
         */
        paintLine = new Paint();
        paintLine.setColor(getResources().getColor(R.color.rgb_220_20_60));

        /**
         * 画圈
         */
        paintCicle = new Paint();
        paintCicle.setColor(getResources().getColor(R.color.rgb_34_0_0));
        paintCicle.setStrokeWidth(10);
        paintCicle.setAntiAlias(true);
        paintCicle.setStyle(Paint.Style.STROKE);
    }

    private void initView() {

    }

    private int width;
    private int height;

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        height = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float radious = 150;
        canvas.drawCircle(width/2, height/2, radious, paintCicle);
//        canvas.restore();

        canvas.drawCircle(width/2,height/2,20,paintCicle);

    }
}
