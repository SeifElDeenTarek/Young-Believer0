package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.QuranModel;

import java.util.ArrayList;

public class QuranViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<QuranModel>> suraDate = new MutableLiveData<>();

    public void getSuraData()
    {
        suraDate.setValue(getSuraFromDateBase());
    }

    private ArrayList<QuranModel> getSuraFromDateBase()
    {
        ArrayList<QuranModel> suras = new ArrayList<>();
        suras.add(new QuranModel(R.string.sura_num1, R.string.sura_name1, R.string.sura_revelation, R.string.sura_ayah_num));
        return suras;
    }
}
