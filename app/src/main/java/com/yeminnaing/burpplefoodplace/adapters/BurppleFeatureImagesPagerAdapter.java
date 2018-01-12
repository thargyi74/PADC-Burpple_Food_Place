package com.yeminnaing.burpplefoodplace.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeminnaing.burpplefoodplace.R;
import com.yeminnaing.burpplefoodplace.viewitems.FoodPlacesImageViewItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeminnaing on 1/11/18.
 */

public class BurppleFeatureImagesPagerAdapter extends PagerAdapter {

    private LayoutInflater mLayoutInflater;
    private List<String> mImages;

    public BurppleFeatureImagesPagerAdapter(Context context){
        mLayoutInflater = LayoutInflater.from(context);
        mImages = new ArrayList<>();

    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       FoodPlacesImageViewItem itemView = (FoodPlacesImageViewItem) mLayoutInflater.inflate(R.layout.view_item_image_food_places, container, false);
       container.addView(itemView);
       return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public void setImages(List<String> images) {
        this.mImages = images;
        notifyDataSetChanged();
    }
}
