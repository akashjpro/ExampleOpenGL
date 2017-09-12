package com.example.tmha.exampleopengl.lesson4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tmha.exampleopengl.R;

public class LessonFourActivity extends AppCompatActivity {

    private GLSurfaceView mGLSurfaceView;
    private LessonFourRenderer mLessonFourRenderer;
    private int mIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_four);
        //mGLSurfaceView = new GLSurfaceView(this);
        mGLSurfaceView = (GLSurfaceView) findViewById(R.id.gl_surface_view);
        mLessonFourRenderer = new LessonFourRenderer(this);

        // Check if the system supports OpenGL ES 2.0.
        final ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        final ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();
        final boolean supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000;

        if (supportsEs2)
        {
            // Request an OpenGL ES 2.0 compatible context.
            mGLSurfaceView.setEGLContextClientVersion(2);

            // Set the renderer to our demo renderer, defined below.
            mGLSurfaceView.setRenderer(mLessonFourRenderer);
        }
        else
        {
            // This is where you could create an OpenGL ES 1.x compatible
            // renderer if you wanted to support both ES 1 and ES 2.
            return;
        }

        mGLSurfaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndex = mLessonFourRenderer.getmIndex();
                if ( mIndex > 4){
                    mIndex = 0;
                }else {
                    mIndex++;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mLessonFourRenderer.changeDrawable(mIndex);
                    }
                });
            }
        });

       // setContentView(mGLSurfaceView);
    }

    @Override
    protected void onResume()
    {
        // The activity must call the GL surface view's onResume() on activity onResume().
        super.onResume();
        mGLSurfaceView.onResume();
    }

    @Override
    protected void onPause()
    {
        // The activity must call the GL surface view's onPause() on activity onPause().
        super.onPause();
        mGLSurfaceView.onPause();
    }
}
