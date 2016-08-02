package com.jiugui.shop.resetbuild.jiugui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

import com.jiugui.shop.resetbuild.jiugui.R;

import java.util.Calendar;

/**
 * Created by wdk on 16/8/1.
 */
public class MyView extends View {

    /**
     * 定义画笔
     */
    private Paint paintLine;
    private Paint paintCicle;
    private Paint paintText;
    private Paint paintSecPoint;
    private Paint paintMinPoint;

    /**
     * 获取时间的类
     */
    private Calendar calendar;

    private static final int HANDLER_CICLE = 100;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case HANDLER_CICLE://定时刷新时钟
                    calendar = Calendar.getInstance();
                    invalidate();//告诉UI主线程重新绘制
                    handler.sendEmptyMessageDelayed(HANDLER_CICLE, 1000);//一秒刷新一次
                    break;
                default:
                    break;
            }
        }
    };

    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        /**
         * 画线
         */
        paintLine = new Paint();
        paintLine.setColor(getResources().getColor(R.color.rgb_220_20_60));
        paintLine.setStrokeWidth(10);
        paintLine.setStyle(Paint.Style.FILL);

        /**
         * 画圈
         */
        paintCicle = new Paint();
        paintCicle.setColor(getResources().getColor(R.color.rgb_34_0_0));
        paintCicle.setStrokeWidth(7);
        paintCicle.setAntiAlias(true);
        paintCicle.setStyle(Paint.Style.STROKE);//绘制边框

        /**
         * 写文字
         */
        paintText = new Paint();
        paintText.setColor(Color.BLUE);
        paintText.setStyle(Paint.Style.FILL);
        paintText.setAntiAlias(true);
        paintText.setTextSize(18);

        /**
         * 画秒针
         */
        paintSecPoint = new Paint();
        paintSecPoint.setColor(Color.BLUE);
        paintSecPoint.setStrokeWidth(3);
        paintSecPoint.setAntiAlias(true);

        /**
         * 画时针和秒针
         */
        paintMinPoint = new Paint();
        paintMinPoint.setColor(Color.BLUE);
        paintMinPoint.setAntiAlias(true);
        paintMinPoint.setStyle(Paint.Style.FILL);
        paintMinPoint.setStrokeWidth(7);

        calendar = Calendar.getInstance();

        handler.sendEmptyMessage(HANDLER_CICLE);

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

        int radious = 150;
        canvas.drawCircle(width / 2, height / 2, radious, paintCicle);

        canvas.drawCircle(width / 2, height / 2, 10, paintCicle);

        for (int i = 0; i < 12; i++) {
            canvas.save();
            canvas.rotate(360 / 12 * i, width / 2, height / 2);
            canvas.drawLine(width / 2, height / 2 - radious, width / 2, height / 2 - radious + 20, paintCicle);

            canvas.drawText(i + "", width / 2, height / 2 - radious + 40, paintText);
            canvas.restore();
        }

        int hour = calendar.get(Calendar.HOUR);//获得小时
        int minute = calendar.get(Calendar.MINUTE);//获得分钟数
        int second = calendar.get(Calendar.SECOND);//获得秒数

        float secDegree = second / 60f * 360;
        canvas.save();
        canvas.rotate(secDegree, width / 2, height / 2);
        canvas.drawLine(width / 2, height / 2 + 20, width / 2, height / 2 - radious + 55, paintSecPoint);
        canvas.restore();

        float minDegree = minute / 60f * 360;
        canvas.save();
        canvas.rotate(minDegree, width / 2, height / 2);
        canvas.drawLine(width / 2, height / 2 + 20, width / 2, height / 2 - radious + 70, paintMinPoint);
        canvas.restore();

        float hourDegree = (hour * 60 + minute) / 12 / 60f * 360;
        canvas.save();
        canvas.rotate(hourDegree, width / 2, height / 2);
        canvas.drawLine(width / 2, height / 2 + 15, width / 2, height / 2 - radious + 90, paintMinPoint);
        canvas.restore();
    }
}
