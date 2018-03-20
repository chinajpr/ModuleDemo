package com.debug;

import android.widget.Toast;

import com.jpr.common.BaseApplication;

/**
 * 类描述:
 * 创建日期:2018/3/20 on 15:35
 * 作者:JiaoPeiRong
 */

public class IndexApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this , "IndexApplication module" , Toast.LENGTH_SHORT).show();
    }
}
