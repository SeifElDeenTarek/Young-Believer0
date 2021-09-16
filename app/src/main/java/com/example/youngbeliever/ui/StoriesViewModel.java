package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.StoriesModel;

import java.util.ArrayList;

public class StoriesViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<StoriesModel>> storiesData = new MutableLiveData<>();

    public void getStoryData()
    {
        storiesData.setValue(getStoryDataFromDataBase());
    }

    private ArrayList<StoriesModel> getStoryDataFromDataBase()
    {
        ArrayList<StoriesModel> storiesModel = new ArrayList<>();
        storiesModel.add(new StoriesModel(R.string.prophets_stories1));
        storiesModel.add(new StoriesModel(R.string.prophets_stories2));
        storiesModel.add(new StoriesModel(R.string.prophets_stories3));
        storiesModel.add(new StoriesModel(R.string.prophets_stories4));
        storiesModel.add(new StoriesModel(R.string.prophets_stories5));
        storiesModel.add(new StoriesModel(R.string.prophets_stories6));
        storiesModel.add(new StoriesModel(R.string.prophets_stories7));
        storiesModel.add(new StoriesModel(R.string.prophets_stories8));
        storiesModel.add(new StoriesModel(R.string.prophets_stories9));
        storiesModel.add(new StoriesModel(R.string.prophets_stories10));
        storiesModel.add(new StoriesModel(R.string.prophets_stories11));
        storiesModel.add(new StoriesModel(R.string.prophets_stories12));
        storiesModel.add(new StoriesModel(R.string.prophets_stories13));
        storiesModel.add(new StoriesModel(R.string.prophets_stories14));
        storiesModel.add(new StoriesModel(R.string.prophets_stories15));
        storiesModel.add(new StoriesModel(R.string.prophets_stories16));
        storiesModel.add(new StoriesModel(R.string.prophets_stories17));
        storiesModel.add(new StoriesModel(R.string.prophets_stories18));
        storiesModel.add(new StoriesModel(R.string.prophets_stories19));
        storiesModel.add(new StoriesModel(R.string.prophets_stories20));
        return storiesModel;
    }
}
