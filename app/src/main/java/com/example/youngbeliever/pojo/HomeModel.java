package com.example.youngbeliever.pojo;

public class HomeModel
{
    int sectionImage;
    String sectionName;

    public HomeModel(int sectionImage, String sectionName)
    {
        this.sectionImage = sectionImage;
        this.sectionName = sectionName;
    }

    public int getSectionImage()
    {
        return sectionImage;
    }

    public void setSectionImage(int sectionImage)
    {
        this.sectionImage = sectionImage;
    }

    public String getSectionName()
    {
        return sectionName;
    }

    public void setSectionName(String sectionName)
    {
        this.sectionName = sectionName;
    }
}