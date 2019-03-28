package com.example.lr1_jo_android;

import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Rect;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
        setTitle("Test App created by Jo");
    }

    class DrawView extends View {
        Paint p;
        Paint b;
        Rect rect;
        public DrawView(Context context){
            super(context);
            p = new Paint();
            b = new Paint();
            rect = new Rect();
        }
        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawARGB(80, 0, 0, 0);
            //p.setColor(Color.rgb(255, 190, 200)); //pink

            //3
            p.setColor(Color.rgb(120, 220, 255)); //blue
            b.setColor(Color.rgb(250, 250, 250)); //white or gray
            canvas.drawRect(60, 60, 1020, 700, p);

            canvas.drawRect(60, 760, 340, 960, b);
            canvas.drawRect(400, 760, 680, 960, b);
            canvas.drawRect(740, 760, 1020, 960, b);
            canvas.drawRect(60, 1020, 340, 1220, b);
            canvas.drawRect(400, 1020, 680, 1220, b);
            canvas.drawRect(740, 1020, 1020, 1220, b);
            canvas.drawRect(60, 1280, 340, 1480, b);
            canvas.drawRect(400, 1280, 680, 1480, b);
            canvas.drawRect(740, 1280, 1020, 1480, b);
            canvas.drawRect(60, 1540, 340, 1720, b);
            canvas.drawRect(400, 1540, 680, 1720, b);
            canvas.drawRect(740, 1540, 1020, 1720, b);








            // 2
            //canvas.drawCircle(550, 700, 497, p); //screen area = 2332800 px
            //                    divide by 3 = 777600 ;      ~~  circle area = 776001 px


            //1
            //canvas.drawCircle(550, 700, 497, p);
            //canvas.drawRect(1000, 1000, 400, 1500, p);
            //p.setStrokeWidth(10);
            //float[] points = new float[]{100, 1000, 1000, 200};
            //canvas.drawLines(points, p);
            //canvas.drawText("1998", 500, 400, p);
        }
    }
}
