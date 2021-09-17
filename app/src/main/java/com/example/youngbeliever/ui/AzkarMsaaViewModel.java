package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AzkarModel;

import java.util.ArrayList;

public class AzkarMsaaViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<AzkarModel>> azkarData = new MutableLiveData<>();

    public void getMsaaZekr()
    {
        azkarData.setValue(getZekrFromDataBase());
    }

    private ArrayList<AzkarModel> getZekrFromDataBase()
    {
        ArrayList<AzkarModel> azkarList = new ArrayList<>();
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr1, "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم", R.string.msaa_zekr_reward1));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr2, "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم", R.string.msaa_zekr_reward2));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr3, "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم", R.string.msaa_zekr_reward3));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr4, "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم"));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr5, "بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم"));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr6));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr7, R.string.msaa_zekr_reward7));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr8, R.string.msaa_zekr_reward8));
        azkarList.add(new AzkarModel(4, R.string.msaa_zekr9, R.string.msaa_zekr_reward9));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr10, R.string.msaa_zekr_reward10));
        azkarList.add(new AzkarModel(7, R.string.msaa_zekr11, R.string.msaa_zekr_reward11));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr12, R.string.msaa_zekr_reward12));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr13));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr14));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr15));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr16));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr17));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr18));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr19));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr20));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr21));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr22));
        azkarList.add(new AzkarModel(10, R.string.msaa_zekr23, R.string.msaa_zekr_reward23));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr24));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr25));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr26));
        azkarList.add(new AzkarModel(3, R.string.msaa_zekr27));
        azkarList.add(new AzkarModel(100, R.string.msaa_zekr28, R.string.msaa_zekr_reward28));
        azkarList.add(new AzkarModel(1, R.string.msaa_zekr29, R.string.msaa_zekr_reward29));
        azkarList.add(new AzkarModel(100, R.string.msaa_zekr30, R.string.msaa_zekr_reward30));
        return azkarList;
    }
}
