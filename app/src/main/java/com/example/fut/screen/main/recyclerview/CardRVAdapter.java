package com.example.fut.screen.main.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.fut.common.VO.CardVO;

import java.util.List;

public class CardRVAdapter extends RecyclerView.Adapter<CardRVHolder> {

    private List<CardVO> cardVOList;
    private RVItemClickListener RVItemClickListener;

    public CardRVAdapter(List<CardVO> cardVOList) {
        this.cardVOList = cardVOList;
    }

    @Override
    public CardRVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_food_item, parent, false);
//        CardRVHolder holder = new CardRVHolder(view, RVItemClickListener);
//        return holder;
        return null;
    }

    @Override
    public void onBindViewHolder(CardRVHolder holder, int position) {
        holder.bindView(cardVOList, position);
    }

    @Override
    public int getItemCount() {
        return cardVOList.size();
    }

    public void setCardVOList(List<CardVO> cardVOList) {
        this.cardVOList = cardVOList;
    }

    public void setOnClickItemListener(RVItemClickListener RVItemClickListener) {
        this.RVItemClickListener = RVItemClickListener;
    }
}
