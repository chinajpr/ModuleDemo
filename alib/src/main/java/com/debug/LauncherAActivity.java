package com.debug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jpr.alib.R;

/**
 * 类描述:
 * 创建日期:2018/3/20 on 15:21
 * 作者:JiaoPeiRong
 */

public class LauncherAActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("这是Launcher A");
    }
}
