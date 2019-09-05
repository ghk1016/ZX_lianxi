package com.bawei.zx_lianxi01.contract;

/*
 *author:郭昊坤
 *date:2019/9/5
 *function:*/public interface HomeContract {
     //view model presenter
    //成功  失败
    interface IView{
        void onHomeSuccess(String data);
        void onHomeLost(String e);
     }
     //获取数据
    interface IModel{
        void getHomeDate(String page,IModelCallBack iModelCallBack);
        interface IModelCallBack{
            void onHomeSuccess(String data);
            void onHomeLost(String lost);
        }
     }
     //解绑绑定初始化
     interface getPresenter{
        void onAttach(HomeContract.IView iView);
        void onDetach();
        void ongetPresenter(String path);
     }
}
