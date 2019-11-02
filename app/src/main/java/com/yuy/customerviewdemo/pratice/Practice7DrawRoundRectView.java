package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.RequiresApi;

/**
 * Coder: yuyang
 * Date: 2019/11/2
 * Description:
 * Version:
 */
public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int w = getWidth();
        int h = getHeight();

        int w1 = w / 6;
        float h1 = h / 6;

        float w2 = w1 * 5;
        float h2 = h1 * 5;

        Paint p1 = new Paint();

        p1.setStyle(Paint.Style.FILL);
        p1.setAntiAlias(true);
        p1.setColor(Color.BLACK);


        canvas.drawRoundRect(w1, h1, w2, h2, 50f, 50f, p1);

    }
}
