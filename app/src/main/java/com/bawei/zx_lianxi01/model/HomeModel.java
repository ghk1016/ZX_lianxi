package com.bawei.zx_lianxi01.model;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bawei.zx_lianxi01.app.App;
import com.bawei.zx_lianxi01.contract.HomeContract;

/*
 *author:郭昊坤
 *date:2019/9/5
 *function:*/public class HomeModel implements HomeContract.IModel{
    @Override
    public void getHomeDate(String page, final IModelCallBack iModelCallBack) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, page, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                iModelCallBack.onHomeSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
iModelCallBack.onHomeLost(error.toString());
            }
        });
        App.requestQueue.add(stringRequest);
    }
}
