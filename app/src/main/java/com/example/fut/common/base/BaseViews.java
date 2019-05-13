package com.example.fut.common.base;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

abstract class BaseViews<C extends Context> {
    private ViewGroup mRootView;
    protected boolean hasInitData;

    /**
     * context 되도록 init에서만 사용하고, 필드로 들고 있지 않도록 하는것이 좋음.
     * context를 별도의 필드로 들게 되는 경우 onDestroy 호출을 사용.
     */
    protected abstract void init(C context);

    /**
     * views가 context나 그 외의 메모리에서 들고 있으면 안되는 객체들에 null을 할당.
     */
    protected void onDestroy() {
        mRootView = null;
    }

    public boolean isDestroyed() {
        return mRootView == null;
    }

    public void setRootView(ViewGroup mRootView) {
        this.mRootView = mRootView;
    }

    public ViewGroup getRootView() {
        return mRootView;
    }

    @Nullable
    public Context getContext() {
        if (mRootView == null) {
            return null;
        }

        return mRootView.getContext();
    }

    public <T extends View> T findViewById(int id) {
        return (T) mRootView.findViewById(id);
    }

    public void post(Runnable action) {
        postDelayed(action, 0);
    }

    public void postDelayed(Runnable action, long duration) {
        if (isDestroyed()) {
            return;
        }

        if (duration == 0) {
            mRootView.post(action);
        } else {
            mRootView.postDelayed(action, duration);
        }
    }

    protected void removeCallbacks(Runnable action) {
        if (isDestroyed()) {
            return;
        }
        mRootView.removeCallbacks(action);
    }

    public void showToast(String text) {
        Toast.makeText(mRootView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    public boolean onBackPressed() {
        return false;
    }


    protected void initAdditionalFunction(BaseActivity activity) {
    }
}
