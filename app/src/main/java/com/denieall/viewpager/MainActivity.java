package com.denieall.viewpager;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Section2Fragment.Section2ClickListener {

    ViewPager viewPager;
    SectionPageAdapter adapterViewPager;

    private ArrayList<Fragment> fragments = new ArrayList<>();

    // Image Array
    ArrayList<Integer> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images.add(R.drawable.cloud);
        images.add(R.drawable.dice);
        images.add(R.drawable.infinity);
        images.add(R.mipmap.ic_launcher);

        int i = 1;

        for (int image : images) {
            fragments.add(Section1Fragment.newInstance("Image " + i, image));
            i++;
        }

        fragments.add(Section2Fragment.newInstance("Image 5", R.drawable.infinity, R.drawable.dice));

        viewPager = findViewById(R.id.vp_Pager);

        adapterViewPager = new SectionPageAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapterViewPager);
    }

    @Override
    public void changeFragment2() {
        fragments.clear();

        int i = 1;
        for (int image : images) {
            fragments.add(Section1Fragment.newInstance("Image " + i, image));
            i++;
        }

        adapterViewPager = new SectionPageAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(adapterViewPager);
    }
}
