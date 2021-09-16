package com.example.youngbeliever.ui;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.youngbeliever.R;

public class ArkanFragmentAdapter extends FragmentPagerAdapter
{
    private Context mContext;
    public ArkanFragmentAdapter(Context context, @NonNull FragmentManager fragmentActivity)
    {
        super(fragmentActivity);
        mContext = context;
    }


    @Override
    public int getCount()
    {
        return 5;
    }

    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return mContext.getString(R.string.islam_pillar1);
        }
        else if (position == 1)
        {
            return mContext.getString(R.string.islam_pillar2);
        }
        else if (position == 2)
        {
            return mContext.getString(R.string.islam_pillar3);
        }
        else if (position == 3)
        {
            return mContext.getString(R.string.islam_pillar4);
        }
        else {
            return mContext.getString(R.string.islam_pillar5);
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new ArkanShhadaFragment();
        }
        else if (position == 1)
        {
            return new ArkanSlahFragment();
        }
        else if (position == 2)
        {
            return new ArkanZkahFragment();
        }
        else if (position == 3)
        {
            return new ArkanSomFragment();
        }
        else {
            return new ArkanHagFragment();
        }
    }
}
