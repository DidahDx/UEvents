package com.app.uevents.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList();
    private final List<String> mFragmentTitleList = new ArrayList();

    public ViewPagerAdapter(@NonNull FragmentManager manager, int behavior) {
        super(manager, behavior);
    }

    public Fragment getItem(int position) {
        return this.mFragmentList.get(position);
    }

    public int getCount() {
        return this.mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        this.mFragmentList.add(fragment);
        this.mFragmentTitleList.add(title);
    }

    public CharSequence getPageTitle(int position) {
        return this.mFragmentTitleList.get(position);
    }
}
