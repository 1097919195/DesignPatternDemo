package com.magic.wangdongliang.designpatterndemo.mvvm.model;


import com.magic.wangdongliang.designpatterndemo.mvvm.viewmodel.MvvmLoadDataCallBack;

/**
 * Created by wangdongliang on 16/7/26.
 */
public class MvvmUserModel {
    public String firstName;
    public String lastName;
    public boolean isAdult;

    public MvvmUserModel() {
        firstName = "";
        lastName = "";
        isAdult = false;
    }

    public void loadUserDataFromNet(MvvmLoadDataCallBack callBack) {
        // todo: 这里省略了网络请求的过程
        this.firstName = "Jack";
        this.lastName = "Wang";
        this.isAdult = true;

        callBack.onLoadSuccess();
    }
}
