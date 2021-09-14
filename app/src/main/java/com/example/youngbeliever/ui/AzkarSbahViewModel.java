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
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        azkarList.add(new AzkarModel(3, R.string.asm_meaning95));
        return azkarList;
    }
}
