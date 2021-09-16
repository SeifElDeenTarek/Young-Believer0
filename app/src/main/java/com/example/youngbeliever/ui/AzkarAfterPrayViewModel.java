package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AzkarModel;

import java.util.ArrayList;

public class AzkarAfterPrayViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<AzkarModel>> azkarData = new MutableLiveData<>();

    public void getAfterPrayZekr()
    {
        azkarData.setValue(getZekrFromDataBase());
    }

    private ArrayList<AzkarModel> getZekrFromDataBase()
    {
        ArrayList<AzkarModel> azkarList = new ArrayList<>();
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr1));
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr2));
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr3));
        azkarList.add(new AzkarModel(33, R.string.after_pray_zekr4));
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr5));
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr6));
        azkarList.add(new AzkarModel(10, R.string.after_pray_zekr7));
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr8));
        azkarList.add(new AzkarModel(7, R.string.after_pray_zekr9));
        azkarList.add(new AzkarModel(1, R.string.after_pray_zekr10));
        return azkarList;
    }
}
