package com.jpr.main;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 类描述:
 * 创建日期:2018/3/20 on 14:58
 * 作者:JiaoPeiRong
 */

public class IndexActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_activity);
        TextView tv = (TextView) findViewById(R.id.index);
        tv.setText("这是Module Index");
    }

    public void start(View view){
        ARouter.getInstance().build("/blib/bActivity").setProvider(new TestInterceptor()).navigation();
    }

    @Interceptor(priority = 8, name = "测试用拦截器")
    public class TestInterceptor implements IInterceptor {
        @Override
        public void process(Postcard postcard, InterceptorCallback callback) {
            Log.d("jiao" , "拦截器");
            Toast.makeText(IndexActivity.this , "拦截器" , Toast.LENGTH_SHORT).show();
            callback.onContinue(postcard);  // 处理完成，交还控制权
            // callback.onInterrupt(new RuntimeException("我觉得有点异常"));      // 觉得有问题，中断路由流程

            // 以上两种至少需要调用其中一种，否则不会继续路由
        }

        @Override
        public void init(Context context) {
            // 拦截器的初始化，会在sdk初始化的时候调用该方法，仅会调用一次
            Log.d("jiao" , "拦截器初始化");
        }
    }
}
