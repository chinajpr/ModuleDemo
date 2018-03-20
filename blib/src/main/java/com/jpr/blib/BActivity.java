package com.jpr.blib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 类描述:
 * 创建日期:2018/3/20 on 15:09
 * 作者:JiaoPeiRong
 */
@Route(path = "/blib/bActivity")
public class BActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity);
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("这是Module B");
    }
}
