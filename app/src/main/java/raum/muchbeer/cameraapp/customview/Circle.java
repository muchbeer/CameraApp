package raum.muchbeer.cameraapp.customview;

import android.graphics.Paint;

public class Circle {

    private float width = 8f;
    float x, y;
    Paint paint;

    Circle(int color, float x, float y) {
        this.x = x;
        this.y = y;
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(width);
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
