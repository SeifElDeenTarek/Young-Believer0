package com.example.youngbeliever.ui;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

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
    public int getCount()
    {
        return 4;
    }

    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return mContext.getString(R.string.sbah_zekr);
        }
        else if (position == 1)
        {
            return mContext.getString(R.string.msaa_zekr);
        }
        else if (position == 2)
        {
            return mContext.getString(R.string.wdoo_zekr);
        }
        else {
            return mContext.getString(R.string.after_pray_zekr);
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
        {
            return new AzkarSbahFragment();
        }
        else if (position == 1)
        {
            return new AzkarMsaaFragment();
        }
        else if (position == 2)
        {
            return new AzkarWdooFragment();
        }
        else {
            return new AzkarAfterPrayFragment();
        }
    }
}
