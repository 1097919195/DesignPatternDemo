package com.magic.wangdongliang.designpatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magic.wangdongliang.designpatterndemo.mvp.view.MvpDemoActivity;
import com.magic.wangdongliang.designpatterndemo.mvvm.view.MvvmDemoActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wangdongliang on 16/8/24.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity_layout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.mvp_test_tv)
    protected void onMVPTestClicked(View v) {
        Intent intent = new Intent(this, MvpDemoActivity.class);

        startActivity(intent);
    }

    @OnClick(R.id.mvvm_test_tv)
    protected void onMVVMTestClicked(View v) {
        Intent intent = new Intent(this, MvvmDemoActivity.class);

        startActivity(intent);
    }
}
