package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AzkarModel;

import java.util.ArrayList;

public class AzkarSbahViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<AzkarModel>> azkarData = new MutableLiveData<>();

    public void getSbahZekr()
    {
        azkarData.setValue(getZekrFromDataBase());
    }

    private ArrayList<AzkarModel> getZekrFromDataBase()
    {
        ArrayList<AzkarModel> azkarList = new ArrayList<>();
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr1));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr2));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr3));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr4));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr5));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr6));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr7));
        azkarList.add(new AzkarModel(4, R.string.sbah_zekr8));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr9));
        azkarList.add(new AzkarModel(7, R.string.sbah_zekr10));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr11));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr12));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr13));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr14));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr15));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr16));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr17));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr18));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr19));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr20));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr21));
        azkarList.add(new AzkarModel(10, R.string.sbah_zekr22));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr23));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr24));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr25));
        azkarList.add(new AzkarModel(3, R.string.sbah_zekr26));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr27));
        azkarList.add(new AzkarModel(1, R.string.sbah_zekr28));
        azkarList.add(new AzkarModel(100, R.string.sbah_zekr29));
        azkarList.add(new AzkarModel(100, R.string.sbah_zekr30));
        azkarList.add(new AzkarModel(100, R.string.sbah_zekr31));
        return azkarList;
    }
}
