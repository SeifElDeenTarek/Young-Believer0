package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.DuasModel;

import java.util.ArrayList;

public class DuasQuranViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<DuasModel>> duaData = new MutableLiveData<>();

    public void getQuranDua()
    {
        duaData.setValue(getDuaFromDataBase());
    }

    private ArrayList<DuasModel> getDuaFromDataBase()
    {
        ArrayList<DuasModel> duasList = new ArrayList<>();
        duasList.add(new DuasModel(R.string.quran_dua1,R.string.quran_dua_info1));
        duasList.add(new DuasModel(R.string.quran_dua2,R.string.quran_dua_info2));
        duasList.add(new DuasModel(R.string.quran_dua3,R.string.quran_dua_info3));
        duasList.add(new DuasModel(R.string.quran_dua4,R.string.quran_dua_info4));
        duasList.add(new DuasModel(R.string.quran_dua5,R.string.quran_dua_info5));
        duasList.add(new DuasModel(R.string.quran_dua6,R.string.quran_dua_info6));
        duasList.add(new DuasModel(R.string.quran_dua7,R.string.quran_dua_info7));
        duasList.add(new DuasModel(R.string.quran_dua8,R.string.quran_dua_info8));
        duasList.add(new DuasModel(R.string.quran_dua9,R.string.quran_dua_info9));
        duasList.add(new DuasModel(R.string.quran_dua10,R.string.quran_dua_info10));
        duasList.add(new DuasModel(R.string.quran_dua11,R.string.quran_dua_info11));
        duasList.add(new DuasModel(R.string.quran_dua12,R.string.quran_dua_info12));
        duasList.add(new DuasModel(R.string.quran_dua13,R.string.quran_dua_info13));
        duasList.add(new DuasModel(R.string.quran_dua14,R.string.quran_dua_info14));
        duasList.add(new DuasModel(R.string.quran_dua15,R.string.quran_dua_info15));
        duasList.add(new DuasModel(R.string.quran_dua16,R.string.quran_dua_info16));
        duasList.add(new DuasModel(R.string.quran_dua17,R.string.quran_dua_info17));
        duasList.add(new DuasModel(R.string.quran_dua18,R.string.quran_dua_info18));
        duasList.add(new DuasModel(R.string.quran_dua19,R.string.quran_dua_info19));
        duasList.add(new DuasModel(R.string.quran_dua20,R.string.quran_dua_info20));
        duasList.add(new DuasModel(R.string.quran_dua21,R.string.quran_dua_info21));
        duasList.add(new DuasModel(R.string.quran_dua22,R.string.quran_dua_info22));
        duasList.add(new DuasModel(R.string.quran_dua23,R.string.quran_dua_info23));
        duasList.add(new DuasModel(R.string.quran_dua24,R.string.quran_dua_info24));
        duasList.add(new DuasModel(R.string.quran_dua25,R.string.quran_dua_info25));
        duasList.add(new DuasModel(R.string.quran_dua26,R.string.quran_dua_info26));
        return duasList;
    }
}
