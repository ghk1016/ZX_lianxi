package com.bawei.zx_lianxi01.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*
 *author:郭昊坤
 *date:2019/9/5
 *function:*/public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutid());
        initData();
        initView();
    }
    public abstract int getlayoutid();
    public abstract void initView();
    public abstract void initData();
}
