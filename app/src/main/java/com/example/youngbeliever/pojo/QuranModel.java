package com.example.youngbeliever.pojo;

public class QuranModel
{
    int suraNum;
    int suraName;
    int suraRevelation;
    int suraAyahNum;
    int suraPage;
    int suraAudio;

    public QuranModel(int suraNum, int suraName, int suraRevelation, int suraAyahNum,int suraPage, int suraAudio)
    {
        this.suraNum = suraNum;
        this.suraName = suraName;
        this.suraRevelation = suraRevelation;
        this.suraAyahNum = suraAyahNum;
        this.suraPage = suraPage;
        this.suraAudio = suraAudio;
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

    public int getSuraPage()
    {
        return suraPage;
    }

    public int getSuraAudio()
    {
        return suraAudio;
    }
}
