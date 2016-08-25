package com.magic.wangdongliang.designpatterndemo.mvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.magic.wangdongliang.designpatterndemo.R;
import com.magic.wangdongliang.designpatterndemo.databinding.MvvmDemoLayoutBinding;
import com.magic.wangdongliang.designpatterndemo.mvvm.viewmodel.MvvmUserViewModel;


/**
 * Created by wangdongliang on 16/8/24.
 */
public class MvvmDemoActivity extends AppCompatActivity {
    private TextView mFirstNameTV;
    private TextView mLastNameTV;
    private TextView mIsAdultTV;

    private MvvmUserViewModel userViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MvvmDemoLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.mvvm_demo_layout);

        userViewModel = new MvvmUserViewModel();
        binding.setUserViewModel(userViewModel);
        binding.setHandlers(this);

        mFirstNameTV = binding.firstNameTv;
        mLastNameTV = binding.lastNameTv;
        mIsAdultTV = binding.isAdultTv;
    }

    public void onClickFirstName(View view) {
        Toast.makeText(this, "First name is" + mFirstNameTV.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onClickLastName(View v) {
        Toast.makeText(this, "Last name is" + mLastNameTV.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onClickLoadData(View v) {
        userViewModel.loadUserData();
    }
}
