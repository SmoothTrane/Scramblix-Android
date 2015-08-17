package com.example.garycoltrane.scramblix;

import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.widget.Toast;
import android.util.Log;
import android.view.SurfaceView;
;import static java.lang.Thread.State;

/**
 * Created by garycoltrane on 8/11/15.
 */
public class sketchUp extends View {
    int firstCharacterY;
int x=0;
    int xArray [];
    int y=0;
    double lastCharacterY=0;
    String check;
    Rect disRect;
    public sketchUp(Context context) {
        super(context);

    }
String  [] arr = {"Dedic","love"};
    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
        disRect = new Rect();
        disRect.set(0, 0, canvas.getWidth(), canvas.getHeight() / 2);
        Paint col = new Paint();
        Paint txt = new Paint();
        txt.setTextSize(20);
        txt.setColor(Color.BLACK);
        col.setColor(Color.GREEN);
        col.setStyle(Paint.Style.FILL);
        canvas.drawRect(disRect, col);
invalidate();

//       if(x<canvas.getWidth()){
//            x+=10;
//        }
//        else{
//           x=0;
//       }

        for (int i = 0; i < arr.length; i++) {
            x= (int) getRandomX();
            if (y < canvas.getHeight() / 2) {
                y += 2;


            }
            if (y > canvas.getHeight() / 2) {
                y = 0;
                x = (int) getRandomX();

            }

//      if(lastCharacterY>canvas.getHeight()/2){
//          y=0;
//      }
            for (int j = 0; j < arr[i].length(); j++) {
                char result = arr[i].charAt(j);
                check = String.valueOf(result);

                canvas.drawText(check, x, y + 40 * j, txt);
                Log.v("Activity", check);

//        }

                // }


            }

            if (y < canvas.getHeight() / 2) {

                lastCharacterY += arr[i].length() / 1.6;


            }
            if (lastCharacterY > canvas.getHeight() / 2) {
                y = 0;
                lastCharacterY = arr[i].length() / 1.6;
                x = (int) getRandomX();
            }

//      Log.d("Activity",Integer.toString(y));
//           Log.v("Activity",Double.toString(lastCharacterY));


        }
    }



    public  double getRandomX(){

        double X = (Math.random()*disRect.width()+1 -0) +0;

        //(disRect.width+1 - 0) + 0
return X;
    }
}








