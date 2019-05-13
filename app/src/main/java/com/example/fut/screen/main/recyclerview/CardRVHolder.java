package com.example.fut.screen.main.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.fut.common.VO.CardVO;

import java.util.List;

import butterknife.ButterKnife;

public class CardRVHolder extends RecyclerView.ViewHolder {

    private RVItemClickListener RVItemClickListener;

    public CardRVHolder(View view, RVItemClickListener RVItemClickListener) {
        super(view);
        ButterKnife.bind(this, view);

        this.RVItemClickListener = RVItemClickListener;
    }

    /**
     * RecyclerView에 변화가 생길 때 호출되는 Method.
     * ex) 새로운 내용이 나타나거나, 삭제되거나, 변경되거나 등..
     */
    public void bindView(List<CardVO> cardVOList, int position) {
//        user = memberVOList.get(position);
//        nameView.setText(user.getName());
    }

    /**
     * Butterknife Library OnClick Method
     */
//    @OnClick({R.id.memberCall, R.id.memberInfo})
//    public void onClick(View view) {
//        int id = view.getId();
//        if (id == R.id.memberCall) {
//            RVItemClickListener.onClickPhoneCall(user.getPhoneNum());
//        } else if (id == R.id.memberInfo) {
//            RVItemClickListener.onClickUserInfo(user);
//        }
//    }
}
