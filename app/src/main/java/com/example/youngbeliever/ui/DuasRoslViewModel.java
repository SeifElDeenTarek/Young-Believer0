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
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        duasList.add(new DuasModel(R.drawable.color_white, R.string.asm_meaning24, R.string.asm_meaning19));
        return duasList;
    }
}
