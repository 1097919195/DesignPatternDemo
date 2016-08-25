package com.magic.wangdongliang.designpatterndemo.mvp.view;

/**
 * Created by wangdongliang on 16/7/27.
 */
public interface MvpDemoViewBase {
    void updateFirstNameView(String firstName);
    void updateLastNameView(String lastName);
    void showToastInfo(String toast);
}
