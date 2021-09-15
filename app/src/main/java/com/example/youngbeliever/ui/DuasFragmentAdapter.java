package com.example.youngbeliever.ui;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.youngbeliever.R;

public class DuasFragmentAdapter extends FragmentPagerAdapter
{
    private Context mContext;
    public DuasFragmentAdapter(Context context, @NonNull FragmentManager fragmentActivity)
    {
        super(fragmentActivity);
        mContext = context;
    }


    @Override
    public int getCount()
    {
        return 3;
    }

    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return mContext.getString(R.string.quran_dua);
        }
        else if (position == 1)
        {
            return mContext.getString(R.string.rasol_dua);
        }
        else {
            return mContext.getString(R.string.rosl_dua);
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new DuasQuranFragment();
        }
        else if (position == 1)
        {
            return new DuasRasolFragment();
        }
        else {
            return new DuasRoslFragment();
        }
    }
}
