package com.yeminnaing.burpplefoodplace.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by yeminnaing on 1/8/18.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder implements View.OnClickListener {

    private T mData;


    public BaseViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    public abstract void setData(T data);

}
