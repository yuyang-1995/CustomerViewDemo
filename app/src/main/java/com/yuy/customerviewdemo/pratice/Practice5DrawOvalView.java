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
 * Date: 2019/11/1
 * Description:
 * Version:
 */
public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        int w = getWidth();
        int h = getHeight();
        canvas.drawOval(w / 4, h / 4, (w * 3) / 4, (h * 3) / 4, paint);
    }
}
