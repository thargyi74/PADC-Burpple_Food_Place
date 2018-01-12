package com.yeminnaing.burpplefoodplace.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;


import com.yeminnaing.burpplefoodplace.R;
import com.yeminnaing.burpplefoodplace.adapters.BurppleFeatureImagesPagerAdapter;
import com.yeminnaing.burpplefoodplace.adapters.GuidesAdapter;
import com.yeminnaing.burpplefoodplace.adapters.NewAndTrendingAdapter;
import com.yeminnaing.burpplefoodplace.adapters.PromotionsAdapter;
import com.yeminnaing.burpplefoodplace.components.PageIndicatorView;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {


    @BindView(R.id.rv_promotions)
    RecyclerView rvPromotions;

    @BindView(R.id.rv_burpple_guides)
    RecyclerView rvBurppleGuides;

    @BindView(R.id.rv_new_trending)
    RecyclerView rvNewTrending;

    @BindView(R.id.vp_highlight_food_places_images)
    ViewPager vpHighlightFoodPlacesImages;

    @BindView(R.id.piv_high_light_images)
    PageIndicatorView pivHighLightImages;

    private TextView mTextMessage;

    private Timer timer;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_explore:
                    mTextMessage.setText(R.string.explore);
                    return true;
                case R.id.navigation_all_guides:
                    mTextMessage.setText(R.string.all_guides);
                    return true;
                case R.id.navigation_to_gallery:
                    return true;
                case R.id.navigation_activity:
                    mTextMessage.setText(R.string.activity);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.profile);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        rvPromotions.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        PromotionsAdapter mPromotionsAdapter = new PromotionsAdapter(getApplicationContext());
        rvPromotions.setAdapter(mPromotionsAdapter);

        rvBurppleGuides.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false));
        GuidesAdapter mGuidesAdapter = new GuidesAdapter(getApplicationContext());
        rvBurppleGuides.setAdapter(mGuidesAdapter);

        rvNewTrending.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        NewAndTrendingAdapter mNewAndTrendingAdapter = new NewAndTrendingAdapter(getApplicationContext());
        rvNewTrending.setAdapter(mNewAndTrendingAdapter);

        final BurppleFeatureImagesPagerAdapter mBurppleFeatureImagesPagerAdapter = new BurppleFeatureImagesPagerAdapter(getApplicationContext());
        vpHighlightFoodPlacesImages.setAdapter(mBurppleFeatureImagesPagerAdapter);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                vpHighlightFoodPlacesImages.post(new Runnable(){

                    @Override
                    public void run() {
                        vpHighlightFoodPlacesImages.setCurrentItem((vpHighlightFoodPlacesImages.getCurrentItem()+1)%mBurppleFeatureImagesPagerAdapter.getCount());
                    }
                });
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 6000, 6000);

        vpHighlightFoodPlacesImages.setOffscreenPageLimit(mBurppleFeatureImagesPagerAdapter.getCount());
        pivHighLightImages.setNumPage(mBurppleFeatureImagesPagerAdapter.getCount());
        vpHighlightFoodPlacesImages.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                pivHighLightImages.setCurrentPage(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

}
