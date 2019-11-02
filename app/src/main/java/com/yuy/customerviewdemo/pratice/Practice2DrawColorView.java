package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Coder: yuyang
 * Date: 2019/11/1
 * Description:
 * Version:
 */
public class Practice2DrawColorView extends View {

    int w,h,raduis;

    public Practice2DrawColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w = getWidth();

        h = getHeight();

        raduis = Math.min(w, h) / 6;

        Paint p1 = new Paint();
        p1.setStyle(Paint.Style.FILL);
        p1.setColor(Color.BLACK);
        p1.setAntiAlias(true);

        canvas.drawCircle(raduis + 120f, raduis + 80f, (raduis * 1.2f) , p1);


        p1.setStyle(Paint.Style.STROKE);
        p1.setStrokeWidth(5f);
        p1.setColor(Color.BLACK);
        p1.setAntiAlias(true);

        canvas.drawCircle(raduis * 3 + 250f, raduis + 80f, (raduis * 1.2f), p1);


        p1.setStyle(Paint.Style.FILL);
        p1.setColor(Color.parseColor("#3E859F"));
        p1.setAntiAlias(true);

        canvas.drawCircle(raduis + 120f, raduis * 3 + 180f, (raduis * 1.2f), p1);


        p1.setStyle(Paint.Style.STROKE);
        p1.setColor(Color.BLACK);
        p1.setStrokeWidth(40);
        p1.setAntiAlias(true);

        canvas.drawCircle(raduis * 3 + 250f, raduis * 3 + 180f, (raduis * 1.2f), p1);

    }




    //    int w, h, radius;
//    public Practice2DrawColorView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//
//        //        练习内容：使用 canvas.drawCircle() 方法画圆
////        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
//
//        radius = Math.min(w, h) / 6;
//        Paint p1 = new Paint();
//        p1.setStyle(Paint.Style.FILL);
//        p1.setColor(Color.BLACK);
//        canvas.drawCircle(radius + 20f, radius + 20f, radius + 0f, p1);
//
//    }
//
//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//
//        w = getWidth();
//
//        h = getHeight();
//    }
}
