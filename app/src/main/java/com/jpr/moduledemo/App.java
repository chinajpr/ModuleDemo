package com.jpr.moduledemo;

import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jpr.common.BaseApplication;

/**
 * 类描述:
 * 创建日期:2018/3/20 on 16:01
 * 作者:JiaoPeiRong
 */

public class App extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
