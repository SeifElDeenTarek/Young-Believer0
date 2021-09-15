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
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        duasList.add(new DuasModel(R.string.asm_meaning1,R.string.asm_meaning2));
        return duasList;
    }
}
