package com.example.youngbeliever.ui;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.youngbeliever.R;

public class AzkarFragmentAdapter extends FragmentPagerAdapter
{
    private Context mContext;
    public AzkarFragmentAdapter(Context context, @NonNull FragmentManager fragmentActivity)
    {
        super(fragmentActivity);
        mContext = context;
    }


    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return mContext.getString(R.string.al_azkar);
        }
        return mContext.getString(R.string.al_azkar);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new AzkarSbahFragment();
        }
        return new AzkarSbahFragment();
    }
}
