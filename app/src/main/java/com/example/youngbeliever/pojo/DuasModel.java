package com.example.youngbeliever.pojo;

public class DuasModel
{
    int dua;
    int duaInfo;
    int duaProphet = NO_IMAGE_PROVIDED;
    static final int NO_IMAGE_PROVIDED = -1;

    public DuasModel(int dua, int duaInfo)
    {
        this.dua = dua;
        this.duaInfo = duaInfo;
    }

    public DuasModel(int duaProphet, int dua, int duaInfo)
    {
        this.duaProphet = duaProphet;
        this.dua = dua;
        this.duaInfo = duaInfo;
    }

    public int getDuaProphet()
    {
        return duaProphet;
    }

    public boolean hasImage()
    {
        return duaProphet != NO_IMAGE_PROVIDED;
    }

    public int getDua()
    {
        return dua;
    }

    public int getDuaInfo()
    {
        return duaInfo;
    }
}
