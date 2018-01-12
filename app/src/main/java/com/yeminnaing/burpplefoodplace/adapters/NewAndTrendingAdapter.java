package com.yeminnaing.burpplefoodplace.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.yeminnaing.burpplefoodplace.R;
import com.yeminnaing.burpplefoodplace.data.vo.NewAndTrendingVO;
import com.yeminnaing.burpplefoodplace.viewholders.NewAndTrendingViewHolder;

/**
 * Created by yeminnaing on 1/11/18.
 */

public class NewAndTrendingAdapter extends BaseAdapter<NewAndTrendingViewHolder, NewAndTrendingVO> {


    public NewAndTrendingAdapter(Context context) {
        super(context);
    }

    @Override
    public NewAndTrendingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.view_new_and_trending, parent, false);
        return new NewAndTrendingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewAndTrendingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
