package com.ruqii.com.opengles31sample;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ruqii.com.opengles31sample.gl.MyGLSurfaceView;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //GLSurfaceView必须在setContentView之前初始化
        mGLView = new MyGLSurfaceView(this);

        setContentView(mGLView);
    }
}
