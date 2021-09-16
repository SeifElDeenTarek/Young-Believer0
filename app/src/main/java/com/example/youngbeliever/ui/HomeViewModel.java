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
        sectionList.add(new HomeModel(R.drawable.holy_quran, R.string.holy_quran));
        sectionList.add(new HomeModel(R.drawable.arkaneslam, R.string.islam_pillars));
        sectionList.add(new HomeModel(R.drawable.azkar, R.string.al_azkar));
        sectionList.add(new HomeModel(R.drawable.duas1, R.string.duas));
        sectionList.add(new HomeModel(R.drawable.qess_rosl, R.string.prophets_stories));
        sectionList.add(new HomeModel(R.drawable.asmaaallah, R.string.god_names));
        return sectionList;
    }
}