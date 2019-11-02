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
public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);


        int w = getWidth();
        int h = getHeight();

        int l = w /3;
        int t = h /3;
        int r = l *2;
        int b = t * 2;

        canvas.drawRect(l, t, r, b, paint);


    }
}
