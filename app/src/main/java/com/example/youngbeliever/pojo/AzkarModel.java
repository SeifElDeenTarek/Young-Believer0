package com.example.youngbeliever.pojo;

public class AzkarModel
{
    int zekrTimes;
    int zekr;
    String bsmla = NO_TEXT_PROVIDED1;
    int zekrReward = NO_TEXT_PROVIDED;
    static final int NO_TEXT_PROVIDED = -1;
    static final String NO_TEXT_PROVIDED1 = "-1";

    public AzkarModel(int zekrTimes, int zekr)
    {
        this.zekrTimes = zekrTimes;
        this.zekr = zekr;
    }

    public AzkarModel(int zekrTimes, int zekr, int zekrReward)
    {
        this.zekrTimes = zekrTimes;
        this.zekr = zekr;
        this.zekrReward = zekrReward;
    }

    public AzkarModel(int zekrTimes, int zekr, String bsmla)
    {
        this.zekrTimes = zekrTimes;
        this.zekr = zekr;
        this.bsmla = bsmla;
    }

    public AzkarModel(int zekrTimes, int zekr, String bsmla, int zekrReward)
    {
        this.zekrTimes = zekrTimes;
        this.zekr = zekr;
        this.bsmla = bsmla;
        this.zekrReward = zekrReward;
    }

    public void setZekrTimes(int zekrTimes)
    {
        this.zekrTimes = zekrTimes;
    }

    public String getBsmla()
    {
        return bsmla;
    }

    public int getZekrReward()
    {
        return zekrReward;
    }

    public int getZekrTimes()
    {
        return zekrTimes;
    }

    public int getZekr()
    {
        return zekr;
    }

    public boolean bsmlaHasText()
    {
        return bsmla != NO_TEXT_PROVIDED1;
    }

    public boolean zakrRewardHasText()
    {
        return zekrReward != NO_TEXT_PROVIDED;
    }
}
