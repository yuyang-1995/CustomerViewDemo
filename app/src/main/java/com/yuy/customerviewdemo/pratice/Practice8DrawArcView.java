package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
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
public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);


        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);

        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);

        paint.setStyle(Paint.Style.STROKE);

        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);


    }
}
