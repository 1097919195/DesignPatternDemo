package com.magic.wangdongliang.designpatterndemo.mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.magic.wangdongliang.designpatterndemo.R;
import com.magic.wangdongliang.designpatterndemo.mvp.presenter.MvpDemoActivityPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wangdongliang on 16/8/24.
 */
public class MvpDemoActivity extends AppCompatActivity implements MvpDemoViewBase {
    @Bind(R.id.first_name_tv)
    protected TextView mFirstNameTV;

    @Bind(R.id.last_name_tv)
    protected TextView mLastNameTV;

    private MvpDemoActivityPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.mvp_demo_layout);
        ButterKnife.bind(this);

        mPresenter = new MvpDemoActivityPresenter(this);
    }

    @Override
    public void updateFirstNameView(String firstName) {
         mFirstNameTV.setText("First name: " + firstName);
    }

    @Override
    public void updateLastNameView(String lastName) {
        mLastNameTV.setText("Last name: " + lastName);
    }

    @Override
    public void showToastInfo(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.load_button)
    protected void onClickLoad(View v) {
        mPresenter.loadUserData();
    }
}
