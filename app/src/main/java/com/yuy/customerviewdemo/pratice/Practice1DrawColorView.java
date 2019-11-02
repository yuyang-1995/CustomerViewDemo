package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * Coder: yuyang
 * Date: 2019/11/1
 * Description:
 * Version:
 */
public class Practice1DrawColorView extends View {

    public Practice1DrawColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW

        canvas.drawColor(Color.YELLOW);

    }
}
