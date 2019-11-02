package com.yuy.customerviewdemo.pratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
public class Practice9DrawPathView extends View {


    Paint mPaint = new Paint();
    Path mPath = new Path();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Practice9DrawPathView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //使用Path 对图形进行描述
        mPath.arcTo(200, 200, 400, 400, -225, 225, true);
        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
        mPath.lineTo(400, 542);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPath(mPath, mPaint);// 绘制出 path 描述的图形（心形），大功告成
    }


}
