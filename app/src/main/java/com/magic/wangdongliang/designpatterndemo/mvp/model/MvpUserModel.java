package com.magic.wangdongliang.designpatterndemo.mvp.model;

import com.magic.wangdongliang.designpatterndemo.mvp.presenter.MvpLoadDataCallBack;

/**
 * Created by wangdongliang on 16/7/26.
 */
public class MvpUserModel {
    public String firstName;
    public String lastName;

    public MvpUserModel() {
        this.firstName = "";
        this.lastName = "";
    }

    public void loadUserDataFromNet(MvpLoadDataCallBack callBack) {
        // todo: 这里省略了网络请求的过程
        this.firstName = "Jack";
        this.lastName = "Wang";

        callBack.onLoadSuccess();
    }
}
