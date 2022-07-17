package com.example.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 1:
                return new FavouriteFragment();
            case 2:
                return new MyPageFragment();
            case 0:
            default:
                return new HomeFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
