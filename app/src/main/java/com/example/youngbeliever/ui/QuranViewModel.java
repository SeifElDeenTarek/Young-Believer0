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
        suras.add(new QuranModel(R.string.sura_num1, R.string.sura_name1, R.string.sura_revelation1, R.string.sura_ayah_num1));
        suras.add(new QuranModel(R.string.sura_num2, R.string.sura_name2, R.string.sura_revelation2, R.string.sura_ayah_num2));
        suras.add(new QuranModel(R.string.sura_num3, R.string.sura_name3, R.string.sura_revelation3, R.string.sura_ayah_num3));
        suras.add(new QuranModel(R.string.sura_num4, R.string.sura_name4, R.string.sura_revelation4, R.string.sura_ayah_num4));
        suras.add(new QuranModel(R.string.sura_num5, R.string.sura_name5, R.string.sura_revelation5, R.string.sura_ayah_num5));
        suras.add(new QuranModel(R.string.sura_num6, R.string.sura_name6, R.string.sura_revelation6, R.string.sura_ayah_num6));
        suras.add(new QuranModel(R.string.sura_num7, R.string.sura_name7, R.string.sura_revelation7, R.string.sura_ayah_num7));
        suras.add(new QuranModel(R.string.sura_num8, R.string.sura_name8, R.string.sura_revelation8, R.string.sura_ayah_num8));
        suras.add(new QuranModel(R.string.sura_num9, R.string.sura_name9, R.string.sura_revelation9, R.string.sura_ayah_num9));
        suras.add(new QuranModel(R.string.sura_num10, R.string.sura_name10, R.string.sura_revelation10, R.string.sura_ayah_num10));
        suras.add(new QuranModel(R.string.sura_num11, R.string.sura_name11, R.string.sura_revelation11, R.string.sura_ayah_num11));
        suras.add(new QuranModel(R.string.sura_num12, R.string.sura_name12, R.string.sura_revelation12, R.string.sura_ayah_num12));
        suras.add(new QuranModel(R.string.sura_num13, R.string.sura_name13, R.string.sura_revelation13, R.string.sura_ayah_num13));
        suras.add(new QuranModel(R.string.sura_num14, R.string.sura_name14, R.string.sura_revelation14, R.string.sura_ayah_num14));
        suras.add(new QuranModel(R.string.sura_num15, R.string.sura_name15, R.string.sura_revelation15, R.string.sura_ayah_num15));
        return suras;
    }
}
