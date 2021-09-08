package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.HomeModel;

import java.util.ArrayList;

// get the data from the model && notify when data arrived
public class HomeViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<HomeModel>> sectionData = new MutableLiveData<>();

    public void getSectionData()
    {
        sectionData.setValue(getSectionFromDataBase());
    }

    private ArrayList<HomeModel> getSectionFromDataBase()
    {
        ArrayList<HomeModel> sectionList = new ArrayList<>();
        sectionList.add(new HomeModel(R.drawable.color_white, "Holy Quran"));
        sectionList.add(new HomeModel(R.drawable.color_white, "Islam's Pillars"));
        sectionList.add(new HomeModel(R.drawable.color_white, "Al-Azkar"));
        sectionList.add(new HomeModel(R.drawable.color_white, "Duas"));
        sectionList.add(new HomeModel(R.drawable.color_white, "Prophet's Stories"));
        return sectionList;
    }
}