package com.magic.wangdongliang.designpatterndemo.mvvm.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.magic.wangdongliang.designpatterndemo.BR;
import com.magic.wangdongliang.designpatterndemo.mvvm.model.MvvmUserModel;

/**
 * Created by wangdongliang on 16/7/26.
 */
public class MvvmUserViewModel extends BaseObservable implements MvvmLoadDataCallBack {
    private MvvmUserModel user;

    public MvvmUserViewModel() {
        user = new MvvmUserModel();
    }

    @Bindable
    public String getFirstName() {
        return "First name: " + user.firstName;
    }

    @Bindable
    public String getLastName() {
        return "Last name: " + user.lastName;
    }

    @Bindable
    public boolean isAdult() {
        return user.isAdult;
    }

    public void loadUserData() {
        user.loadUserDataFromNet(this);
    }

    @Override
    public void onLoadSuccess() {
        notifyPropertyChanged(BR.firstName);
        notifyPropertyChanged(BR.lastName);
        notifyPropertyChanged(BR.adult);

        // todo: 这里单纯的MVVM模式如何展示一条toast变得困难, 必须配合MVP模式添加一个Presenter层才能实现
    }

    @Override
    public void onLoadFail() {

    }
}
