package com.example.youngbeliever.pojo;

public class AzkarModel
{
    int zekrTimes;
    int zekr;

    public AzkarModel(int zekrTimes, int zekr)
    {
        this.zekrTimes = zekrTimes;
        this.zekr = zekr;
    }

    public void setZekrTimes(int zekrTimes)
    {
        this.zekrTimes = zekrTimes;
    }

    public int getZekrTimes()
    {
        return zekrTimes;
    }

    public int getZekr()
    {
        return zekr;
    }
}
