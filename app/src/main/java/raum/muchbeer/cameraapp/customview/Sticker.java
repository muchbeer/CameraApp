package raum.muchbeer.cameraapp.customview;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class Sticker {

    public static final int STICKER_STARTING_WIDTH = 300;
    private static final int STICKER_STARTING_HEIGHT = 300;


        Paint paint;
        Bitmap bitmap;
        Drawable drawable;
        int x, y;
        Rect rect;


        Sticker(Bitmap bitmap, Drawable drawable, int x, int y){
            paint = new Paint();
            this.x = x;
            this.y = y;
            this.bitmap = bitmap;
            this.drawable = drawable;
            rect = new Rect(x, y, x + STICKER_STARTING_WIDTH, y + STICKER_STARTING_HEIGHT);
        }

        public void adjustRect(){
            rect.left = x;
            rect.top = y;
            rect.right = x + bitmap.getWidth();
            rect.bottom = y + bitmap.getHeight();
        }
    }


