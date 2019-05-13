package com.example.fut.screen.main;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.fut.R;
import com.example.fut.common.base.BaseActivity;

public class MainActivity extends BaseActivity<MainController, MainViews> {

    @NonNull
    @Override
    protected MainController createController() {
        return new MainController();
    }

    @NonNull
    @Override
    protected MainViews createViews() {
        return  new MainViews();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

}
