package com.yeminnaing.burpplefoodplace.viewitems;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.yeminnaing.burpplefoodplace.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yeminnaing on 1/11/18.
 */

public class FoodPlacesImageViewItem extends FrameLayout {


    @BindView(R.id.iv_image_slide)
    ImageView ivFoodPlaceImage;


    public FoodPlacesImageViewItem(@NonNull Context context) {
        super(context);
    }

    public FoodPlacesImageViewItem(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FoodPlacesImageViewItem(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this, this);
    }

    public void setData(String imageUrl) {
    }
}
