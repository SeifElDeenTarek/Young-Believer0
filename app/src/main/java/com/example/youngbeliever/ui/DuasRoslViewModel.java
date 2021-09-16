package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.DuasModel;

import java.util.ArrayList;

public class DuasRoslViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<DuasModel>> duaData = new MutableLiveData<>();

    public void getRoslDua()
    {
        duaData.setValue(getDuaFromDataBase());
    }

    private ArrayList<DuasModel> getDuaFromDataBase()
    {
        ArrayList<DuasModel> duasList = new ArrayList<>();
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua1, R.string.rosl_dua_info1));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua2, R.string.rosl_dua_info2));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua3, R.string.rosl_dua_info3));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua4, R.string.rosl_dua_info4));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua5, R.string.rosl_dua_info5));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua6, R.string.rosl_dua_info6));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua7, R.string.rosl_dua_info7));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua8, R.string.rosl_dua_info8));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua9, R.string.rosl_dua_info9));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua10, R.string.rosl_dua_info10));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua11, R.string.rosl_dua_info11));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua12, R.string.rosl_dua_info12));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.rosl_dua13, R.string.rosl_dua_info13));
        return duasList;
    }
}
