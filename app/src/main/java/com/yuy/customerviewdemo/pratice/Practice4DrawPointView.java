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
public class Practice4DrawPointView extends View {


    public Practice4DrawPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int w = getWidth();
        int h = getHeight();

        int w1 = w / 3;
        int h1 = h / 3;

        Paint p1 = new Paint();
        p1.setStrokeWidth(60);
        p1.setColor(Color.BLACK);


        p1.setStrokeCap(Paint.Cap.ROUND); //圆点

        canvas.drawPoint(w1, h1, p1);

        //
        p1.setStrokeCap(Paint.Cap.SQUARE);
        p1.setColor(Color.BLACK);
        p1.setStrokeWidth(60);

        canvas.drawPoint(w1 * 2, h1, p1);

    }
}
