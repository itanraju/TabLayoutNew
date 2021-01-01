package com.example.tablayoutnew.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayoutnew.ComedyFragment;
import com.example.tablayoutnew.LoveFragment;
import com.example.tablayoutnew.MastiFragment;
import com.example.tablayoutnew.R;
import com.example.tablayoutnew.SadFragment;
import com.example.tablayoutnew.crazyFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.crazy,R.string.love,R.string.masti,R.string.comedy,R.string.sad};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        switch (position)
        {
            case 0:
                fragment=new crazyFragment();
                break;

            case 1:
                fragment=new LoveFragment();
                break;

            case 2:
                fragment=new MastiFragment();
                break;

            case 3:
                fragment=new ComedyFragment();
                break;

            case 4:
                fragment=new SadFragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }
}