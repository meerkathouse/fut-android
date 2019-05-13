package com.example.fut.screen.main;

import android.content.Intent;

import com.example.fut.common.VO.CardVO;
import com.example.fut.common.base.BaseController;

import java.util.ArrayList;
import java.util.List;

public class MainController extends BaseController<MainViews> implements MainEventDelegate {

    private CardVO cardVO = new CardVO();

    @Override
    public void initAfterViewInflated() {
        if (getActivity() == null) {
            finishActivity();
            return;
        }

        Intent intent = getActivity().getIntent();
        if (intent != null) {
        }

        if (getViews() == null || cardVO == null) {
            finishActivity();
            return;
        }
    }

    public List<CardVO> getFoodList(){
        return new ArrayList<>();
    }
}
