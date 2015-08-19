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
public class sketchUp extends View  {
    int firstCharacterY;
int x = (int) getRandomX();
    int[] xArray= getXArray();

    int y=0;
    double lastCharacterY=0;
    String check;
    Rect disRect;
    Canvas canvas;
    public sketchUp(Context context) {
        super(context);

    }
String [] arr = {"Dedic","love","happiness"};
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

            for (int i = 0; i < arr.length; i++) {
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

                    canvas.drawText(check, xArray[i], y + 40 * j, txt);

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

//     Log.d("Activity",Integer.toString(y));
//           Log.v("Activity",Double.toString(lastCharacterY));

                invalidate();

            }
        }



    public  double getRandomX(){

        double X = (Math.random()*super.getWidth() -0) +0;
return X;
    }

public int[] getXArray(){
    xArray= new int[3];
   for(int i=0; i<xArray.length; i++){

       xArray[i] = x;
      // Log.v("Activity", Integer.toString(super.getWidth()));


   }
return xArray;
}


}








