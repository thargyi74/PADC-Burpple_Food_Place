package com.yeminnaing.burpplefoodplace.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.yeminnaing.burpplefoodplace.R;
import com.yeminnaing.burpplefoodplace.data.vo.PromotionVO;
import com.yeminnaing.burpplefoodplace.viewholders.PromotionsViewHolder;

/**
 * Created by yeminnaing on 1/10/18.
 */

public class PromotionsAdapter extends BaseAdapter<PromotionsViewHolder, PromotionVO> {

    public PromotionsAdapter(Context context) {
        super(context);
    }


    @Override
    public PromotionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_promotions, parent, false);
        return new PromotionsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(PromotionsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
