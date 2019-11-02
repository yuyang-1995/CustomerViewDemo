package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Coder: yuyang
 * Date: 2019/11/2
 * Description:
 * Version:
 */
public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Path path = new Path();


        int width = getWidth();
        int height = getHeight();

        int w = width / 12;

        paint.setAntiAlias(true);

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3f);
        paint.setStyle(Paint.Style.STROKE);

        path.moveTo(w, height / 7);

        path.rLineTo(0, 5 * (height / 7));

        path.rLineTo(10 * w, 0);

//        canvas.drawPath(path, paint);
        //
        paint.setColor(Color.parseColor("#34D53E"));

        paint.setStrokeWidth(15f);

        path.moveTo((float) (w*5.5), 5 * (height / 7));

        path.rLineTo(0, (height / 7));

        path.moveTo((float) (w*7.5), 5 * (height / 7));

        path.rLineTo(0, (float) ((height / 7) * 1.5));

        canvas.drawText("GB", (float) (w * 2.5), 6 * (height / 7), paint);

        canvas.drawPath(path, paint);


    }
}
