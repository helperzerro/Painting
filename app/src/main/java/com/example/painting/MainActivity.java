package com.example.painting;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import static com.example.painting.display.colorList;
import static com.example.painting.display.pathList;
import static com.example.painting.display.current_brush;


public class MainActivity extends AppCompatActivity {
    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pencil(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }
    public void eraser(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }

    public void redColor(View view) {
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }
    public void yelloColor(View view) {
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }
    public void greenColor(View view) {
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }
    public void cyanColor(View view) {
        paint_brush.setColor(Color.CYAN);
        currentColor(paint_brush.getColor());
    }
    public void blueColor(View view) {
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }

    public void currentColor(int c){
        current_brush = c;
        path = new Path();
    }

}