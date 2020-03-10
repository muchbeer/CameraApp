package raum.muchbeer.cameraapp.customview;

import android.graphics.Paint;
import android.graphics.Path;

public class Pen {

    Path path;
    Paint paint;

    Pen(int color, float width ) {
        path = new Path();
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(width);
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }
}
