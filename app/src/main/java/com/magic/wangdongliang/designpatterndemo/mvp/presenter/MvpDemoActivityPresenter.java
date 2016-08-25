package com.magic.wangdongliang.designpatterndemo.mvp.presenter;

import com.magic.wangdongliang.designpatterndemo.mvp.model.MvpUserModel;
import com.magic.wangdongliang.designpatterndemo.mvp.view.MvpDemoViewBase;

/**
 * Created by wangdongliang on 16/7/27.
 */
public class MvpDemoActivityPresenter implements MvpLoadDataCallBack {
    private MvpDemoViewBase view;
    private MvpUserModel userModel;

    public MvpDemoActivityPresenter(MvpDemoViewBase view) {
        this.view = view;

        userModel = new MvpUserModel();
    }

    public void loadUserData() {
        userModel.loadUserDataFromNet(this);
    }

    @Override
    public void onLoadSuccess() {
        view.updateFirstNameView(userModel.firstName);
        view.updateLastNameView(userModel.lastName);

        view.showToastInfo("加载成功");
    }

    @Override
    public void onLoadFail() {

    }
}
