package com.denieall.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class SectionPageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;

    public SectionPageAdapter(FragmentManager fm, ArrayList<Fragment> f) {
        super(fm);

        fragments = f;
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
