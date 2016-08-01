package com.abdallaadelessa.advancedzoomimageview;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                ZoomableImageView ivImageView = (ZoomableImageView) findViewById(R.id.ivImageView);
                if(ivImageView != null) {
                    ivImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                }

//        AdvancedZoomImageView ivImageView = (AdvancedZoomImageView) findViewById(R.id.ivImageView);
        //        if(ivImageView != null) {
        //            ivImageView.setScaleType(ImageView.ScaleType.MATRIX);
        //            ivImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        //        }
    }
}
