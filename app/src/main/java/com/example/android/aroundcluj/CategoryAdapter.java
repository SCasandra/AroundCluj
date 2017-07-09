package com.example.android.aroundcluj;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.aroundcluj.fragments.FoodFragment;
import com.example.android.aroundcluj.fragments.MuseumFragment;
import com.example.android.aroundcluj.fragments.ParkFragment;
import com.example.android.aroundcluj.fragments.ShoppingFragment;

/**
 * Created by Casi on 09.07.2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MuseumFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ParkFragment();
            default:
                return new ShoppingFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.museum);
            case 1:
                return context.getString(R.string.food);
            case 2:
                return context.getString(R.string.park);
            default:
                return context.getString(R.string.shopping);
        }
    }
}
