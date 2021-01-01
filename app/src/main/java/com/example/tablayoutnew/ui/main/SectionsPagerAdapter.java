package com.example.tablayoutnew.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayoutnew.BirthdayFragment;
import com.example.tablayoutnew.FriendshipFragment;
import com.example.tablayoutnew.GodFragment;
import com.example.tablayoutnew.GujratiFragment;
import com.example.tablayoutnew.HindiFragment;
import com.example.tablayoutnew.Love;
import com.example.tablayoutnew.PopularFragment;
import com.example.tablayoutnew.R;
import com.example.tablayoutnew.SadFragment;
import com.example.tablayoutnew.WeddingFragment;
import com.example.tablayoutnew.WishFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.birthday,R.string.firendship,R.string.god,R.string.gujrati,R.string.hindi,R.string.love,R.string.popular,R.string.sad,R.string.wedding,R.string.wish};
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
                fragment=new BirthdayFragment();
                break;

            case 1:
                fragment=new FriendshipFragment();
                break;

            case 2:
                fragment=new GodFragment();
                break;

            case 3:
                fragment=new GujratiFragment();
                break;

            case 4:
                fragment=new HindiFragment();
                break;

            case 5:
                fragment=new Love();
                break;
            case 6:
                fragment=new PopularFragment();
                break;

            case 7:
                fragment=new SadFragment();
                break;

            case 8:
                fragment=new WeddingFragment();
                break;

            case 9:
                fragment=new WishFragment();
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
        return 10;
    }
}