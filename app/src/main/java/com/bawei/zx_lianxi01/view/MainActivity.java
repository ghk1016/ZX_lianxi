package com.bawei.zx_lianxi01.view;

import android.util.Log;
import android.widget.GridView;

import com.bawei.zx_lianxi01.R;
import com.bawei.zx_lianxi01.base.BaseActivity;
import com.bawei.zx_lianxi01.contract.HomeContract;
import com.bawei.zx_lianxi01.presenter.HomePresenter;

public class MainActivity extends BaseActivity implements HomeContract.IView{

    private GridView grid_view;
    private HomePresenter homePresenter;
    String path="http://172.17.8.100/small/commodity/v1/findCommodityByKeyword?&page=1&count=30&keyword=%E7%94%B7%E9%9E%8B";

    public int getlayoutid() {
        return R.layout.activity_main;
    }

    public void initView() {
        //初始化控件
        grid_view = findViewById(R.id.grid_view);
        homePresenter = new HomePresenter();
        if (homePresenter!=null){
            homePresenter.onAttach(MainActivity.this);
            homePresenter.ongetPresenter(path);
        }
    }

    public void initData() {

    }

    @Override
    public void onHomeSuccess(String data) {
        Log.d("sss", "onHomeSuccess: "+data);
    }

    @Override
    public void onHomeLost(String e) {

    }
}
