package com.example.youngbeliever.pojo;

public class HomeModel
{
    int sectionImage;
    int sectionName;

    public HomeModel(int sectionImage, int sectionName)
    {
        this.sectionImage = sectionImage;
        this.sectionName = sectionName;
    }

    public int getSectionImage()
    {
        return sectionImage;
    }

    public int getSectionName()
    {
        return sectionName;
    }
}