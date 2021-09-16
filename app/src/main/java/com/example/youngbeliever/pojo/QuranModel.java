package com.example.youngbeliever.pojo;

public class QuranModel
{
    int suraNum;
    int suraName;
    int suraRevelation;
    int suraAyahNum;

    public QuranModel(int suraNum, int suraName, int suraRevelation, int suraAyahNum)
    {
        this.suraNum = suraNum;
        this.suraName = suraName;
        this.suraRevelation = suraRevelation;
        this.suraAyahNum = suraAyahNum;
    }

    public int getSuraNum()
    {
        return suraNum;
    }

    public int getSuraName()
    {
        return suraName;
    }

    public int getSuraRevelation()
    {
        return suraRevelation;
    }

    public int getSuraAyahNum()
    {
        return suraAyahNum;
    }
}
