package com.bawei.zx_lianxi01.presenter;

import android.view.View;

import com.bawei.zx_lianxi01.contract.HomeContract;
import com.bawei.zx_lianxi01.model.HomeModel;

import java.lang.ref.WeakReference;

/*
 *author:郭昊坤
 *date:2019/9/5
 *function:*/public class HomePresenter implements HomeContract.getPresenter {

    private HomeModel homeModel;
    private WeakReference<HomeContract.IView> iViewWeakReference;

    @Override
    public void onAttach(HomeContract.IView iView) {
        homeModel = new HomeModel();
        iViewWeakReference = new WeakReference<>(iView);
    }

    @Override
    public void onDetach() {
        if (iViewWeakReference!=null){
            iViewWeakReference.clear();
            iViewWeakReference=null;
        }
    }
    public HomeContract.IView getView(){
        return iViewWeakReference.get();
    }

    @Override
    public void ongetPresenter(String path) {
        homeModel.getHomeDate(path, new HomeContract.IModel.IModelCallBack() {
            @Override
            public void onHomeSuccess(String data) {
                getView().onHomeSuccess(data);
            }

            @Override
            public void onHomeLost(String lost) {
                getView().onHomeLost(lost);
            }
        });
    }
}
