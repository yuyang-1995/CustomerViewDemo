package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Coder: yuyang
 * Date: 2019/11/2
 * Description:
 * Version:
 */
public class Practice6DrawLineView extends View {

    public Practice6DrawLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int w = getWidth();
        int h = getHeight();

        int w1 = w / 6;
        int h1 = h / 6;

        int w2 = w1 * 5;
        int h2 = h1 * 5;

        Paint p1 = new Paint();

        p1.setStyle(Paint.Style.STROKE);
        p1.setAntiAlias(true);
        p1.setStrokeWidth(6f);
        p1.setColor(Color.BLACK);

        canvas.drawLine(w1, h1, w2, h2, p1);

    }
}
