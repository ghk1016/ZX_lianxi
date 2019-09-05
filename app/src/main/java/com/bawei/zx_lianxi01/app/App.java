package com.bawei.zx_lianxi01.app;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/*
 *author:郭昊坤
 *date:2019/9/5
 *function:*/public class App extends Application {
     public static RequestQueue requestQueue;
    public static Context context;
     @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        requestQueue= Volley.newRequestQueue(context);
    }
}
