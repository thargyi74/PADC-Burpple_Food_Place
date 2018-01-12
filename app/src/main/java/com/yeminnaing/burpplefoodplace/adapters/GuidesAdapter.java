package com.yeminnaing.burpplefoodplace.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.yeminnaing.burpplefoodplace.R;
import com.yeminnaing.burpplefoodplace.data.vo.GuidesVO;
import com.yeminnaing.burpplefoodplace.viewholders.GuidesViewHolder;
import com.yeminnaing.burpplefoodplace.viewholders.PromotionsViewHolder;

/**
 * Created by yeminnaing on 1/11/18.
 */

public class GuidesAdapter extends BaseAdapter<GuidesViewHolder, GuidesVO> {


    public GuidesAdapter(Context context) {
        super(context);
    }

    @Override
    public GuidesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_item_burpple_guides, parent, false);
        return new GuidesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GuidesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
