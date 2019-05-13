package com.example.fut.screen.main;

import android.app.Activity;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.fut.R;
import com.example.fut.common.base.BaseActivity;
import com.example.fut.common.base.EventDelegateViews;
import com.example.fut.common.util.EventClickManager;

import butterknife.BindView;
import butterknife.OnClick;

public class MainViews extends EventDelegateViews<MainEventDelegate> {


    @OnClick({})
    void onClickButton(View view) {
        if (!EventClickManager.isClickable(view)) {
            return;
        }
        switch (view.getId()) {
            default:
                break;
        }
    }

    @Override
    protected void init(BaseActivity context) {
        initView();
        initListener();
    }

    private void initView() {
        initStatusBarColor(getActivity());
    }

    private void initListener() {
    }

    private static void initStatusBarColor(Activity context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = context.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
        }
    }
}
