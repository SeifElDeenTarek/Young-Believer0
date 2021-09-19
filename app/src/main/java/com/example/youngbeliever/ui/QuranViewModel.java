package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.QuranModel;

import java.util.ArrayList;

public class QuranViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<QuranModel>> suraDate = new MutableLiveData<>();

    public void getSuraData()
    {
        suraDate.setValue(getSuraFromDateBase());
    }

    private ArrayList<QuranModel> getSuraFromDateBase()
    {
        ArrayList<QuranModel> suras = new ArrayList<>();
        suras.add(new QuranModel(R.string.sura_num1, R.string.sura_name1, R.string.sura_revelation1, R.string.sura_ayah_num1,0, R.raw.fatiha1));
        suras.add(new QuranModel(R.string.sura_num2, R.string.sura_name2, R.string.sura_revelation2, R.string.sura_ayah_num2, 1, R.raw.albqara));
        suras.add(new QuranModel(R.string.sura_num3, R.string.sura_name3, R.string.sura_revelation3, R.string.sura_ayah_num3, 44, R.raw.alemran));
/*
        suras.add(new QuranModel(R.string.sura_num4, R.string.sura_name4, R.string.sura_revelation4, R.string.sura_ayah_num4, 68, R.raw.nesaa4));
        suras.add(new QuranModel(R.string.sura_num5, R.string.sura_name5, R.string.sura_revelation5, R.string.sura_ayah_num5, 94, R.raw.maaeda5));
        suras.add(new QuranModel(R.string.sura_num6, R.string.sura_name6, R.string.sura_revelation6, R.string.sura_ayah_num6, 114, R.raw.anam6));
        suras.add(new QuranModel(R.string.sura_num7, R.string.sura_name7, R.string.sura_revelation7, R.string.sura_ayah_num7, 135, R.raw.aaraf7));
        suras.add(new QuranModel(R.string.sura_num8, R.string.sura_name8, R.string.sura_revelation8, R.string.sura_ayah_num8, 159, R.raw.anfal8));
        suras.add(new QuranModel(R.string.sura_num9, R.string.sura_name9, R.string.sura_revelation9, R.string.sura_ayah_num9, 168, R.raw.eltoba9));
        suras.add(new QuranModel(R.string.sura_num10, R.string.sura_name10, R.string.sura_revelation10, R.string.sura_ayah_num10, 168, R.raw.yoness10));
        suras.add(new QuranModel(R.string.sura_num11, R.string.sura_name11, R.string.sura_revelation11, R.string.sura_ayah_num11, 198, R.raw.hood11));
        suras.add(new QuranModel(R.string.sura_num12, R.string.sura_name12, R.string.sura_revelation12, R.string.sura_ayah_num12, 211, R.raw.youssef12));
        suras.add(new QuranModel(R.string.sura_num13, R.string.sura_name13, R.string.sura_revelation13, R.string.sura_ayah_num13, 224, R.raw.elraad13));
        suras.add(new QuranModel(R.string.sura_num14, R.string.sura_name14, R.string.sura_revelation14, R.string.sura_ayah_num14, 230, R.raw.ibrahim14));
        suras.add(new QuranModel(R.string.sura_num15, R.string.sura_name15, R.string.sura_revelation15, R.string.sura_ayah_num15, 236, R.raw.elhagar15));
        suras.add(new QuranModel(R.string.sura_num16, R.string.sura_name16, R.string.sura_revelation16, R.string.sura_ayah_num16, 241, R.raw.elnahl16));
        suras.add(new QuranModel(R.string.sura_num17, R.string.sura_name17, R.string.sura_revelation17, R.string.sura_ayah_num17, 254, R.raw.elesraa17));
        suras.add(new QuranModel(R.string.sura_num18, R.string.sura_name18, R.string.sura_revelation18, R.string.sura_ayah_num18, 265, R.raw.elkahf18));
        suras.add(new QuranModel(R.string.sura_num19, R.string.sura_name19, R.string.sura_revelation19, R.string.sura_ayah_num19, 276, R.raw.mariam19));
        suras.add(new QuranModel(R.string.sura_num20, R.string.sura_name20, R.string.sura_revelation20, R.string.sura_ayah_num20, 283, R.raw.taha20));
        suras.add(new QuranModel(R.string.sura_num21, R.string.sura_name21, R.string.sura_revelation21, R.string.sura_ayah_num21, 293, R.raw.elanbyaa21));
        suras.add(new QuranModel(R.string.sura_num22, R.string.sura_name22, R.string.sura_revelation22, R.string.sura_ayah_num22, 301, R.raw.elhag22));
        suras.add(new QuranModel(R.string.sura_num23, R.string.sura_name23, R.string.sura_revelation23, R.string.sura_ayah_num23, 310, R.raw.elmomenon23));
        suras.add(new QuranModel(R.string.sura_num24, R.string.sura_name24, R.string.sura_revelation24, R.string.sura_ayah_num24, 318, R.raw.elnoor24));
        suras.add(new QuranModel(R.string.sura_num25, R.string.sura_name25, R.string.sura_revelation25, R.string.sura_ayah_num25, 328, R.raw.elforkan25));
        suras.add(new QuranModel(R.string.sura_num26, R.string.sura_name26, R.string.sura_revelation26, R.string.sura_ayah_num26, 334, R.raw.elshoaraa26));
        suras.add(new QuranModel(R.string.sura_num27, R.string.sura_name27, R.string.sura_revelation27, R.string.sura_ayah_num27, 344, R.raw.elnaml27));
        suras.add(new QuranModel(R.string.sura_num28, R.string.sura_name28, R.string.sura_revelation28, R.string.sura_ayah_num28, 353, R.raw.elkss28));
        suras.add(new QuranModel(R.string.sura_num29, R.string.sura_name29, R.string.sura_revelation29, R.string.sura_ayah_num29, 363, R.raw.elankabot29));
        suras.add(new QuranModel(R.string.sura_num30, R.string.sura_name30, R.string.sura_revelation30, R.string.sura_ayah_num30, 370, R.raw.elroom30));
        suras.add(new QuranModel(R.string.sura_num31, R.string.sura_name31, R.string.sura_revelation31, R.string.sura_ayah_num31, 376, R.raw.lokman31));
        suras.add(new QuranModel(R.string.sura_num32, R.string.sura_name32, R.string.sura_revelation32, R.string.sura_ayah_num32, 380, R.raw.elsagda32));
        suras.add(new QuranModel(R.string.sura_num33, R.string.sura_name33, R.string.sura_revelation33, R.string.sura_ayah_num33, 382, R.raw.elahzab33));
        suras.add(new QuranModel(R.string.sura_num34, R.string.sura_name34, R.string.sura_revelation34, R.string.sura_ayah_num34, 392, R.raw.sba34));
        suras.add(new QuranModel(R.string.sura_num35, R.string.sura_name35, R.string.sura_revelation35, R.string.sura_ayah_num35, 398, R.raw.fatr35));
        suras.add(new QuranModel(R.string.sura_num36, R.string.sura_name36, R.string.sura_revelation36, R.string.sura_ayah_num36, 403, R.raw.yassen36));
        suras.add(new QuranModel(R.string.sura_num37, R.string.sura_name37, R.string.sura_revelation37, R.string.sura_ayah_num37, 409, R.raw.elsafat37));
        suras.add(new QuranModel(R.string.sura_num38, R.string.sura_name38, R.string.sura_revelation38, R.string.sura_ayah_num38, 416, R.raw.sad38));
        suras.add(new QuranModel(R.string.sura_num39, R.string.sura_name39, R.string.sura_revelation39, R.string.sura_ayah_num39, 421, R.raw.elzomor39));
        suras.add(new QuranModel(R.string.sura_num40, R.string.sura_name40, R.string.sura_revelation40, R.string.sura_ayah_num40, 430, R.raw.ghafer40));
        suras.add(new QuranModel(R.string.sura_num41, R.string.sura_name41, R.string.sura_revelation41, R.string.sura_ayah_num41, 438, R.raw.fslt41));
        suras.add(new QuranModel(R.string.sura_num42, R.string.sura_name42, R.string.sura_revelation42, R.string.sura_ayah_num42, 444, R.raw.elshora42));
        suras.add(new QuranModel(R.string.sura_num43, R.string.sura_name43, R.string.sura_revelation43, R.string.sura_ayah_num43, 450, R.raw.elzkhrf43));
        suras.add(new QuranModel(R.string.sura_num44, R.string.sura_name44, R.string.sura_revelation44, R.string.sura_ayah_num44, 456, R.raw.eldkhan44));
        suras.add(new QuranModel(R.string.sura_num45, R.string.sura_name45, R.string.sura_revelation45, R.string.sura_ayah_num45, 459, R.raw.elgathya45));
        suras.add(new QuranModel(R.string.sura_num46, R.string.sura_name46, R.string.sura_revelation46, R.string.sura_ayah_num46, 463, R.raw.elzkhrf43));
        suras.add(new QuranModel(R.string.sura_num47, R.string.sura_name47, R.string.sura_revelation47, R.string.sura_ayah_num47, 467, R.raw.mohamed47));
        suras.add(new QuranModel(R.string.sura_num48, R.string.sura_name48, R.string.sura_revelation48, R.string.sura_ayah_num48, 471, R.raw.elfath48));
        suras.add(new QuranModel(R.string.sura_num49, R.string.sura_name49, R.string.sura_revelation49, R.string.sura_ayah_num49, 476, R.raw.elhograt49));
        suras.add(new QuranModel(R.string.sura_num50, R.string.sura_name50, R.string.sura_revelation50, R.string.sura_ayah_num50, 478, R.raw.kaf50));
        suras.add(new QuranModel(R.string.sura_num51, R.string.sura_name51, R.string.sura_revelation51, R.string.sura_ayah_num51, 481, R.raw.elzaryat51));
        suras.add(new QuranModel(R.string.sura_num52, R.string.sura_name52, R.string.sura_revelation52, R.string.sura_ayah_num52, 484, R.raw.eltoor52));
        suras.add(new QuranModel(R.string.sura_num53, R.string.sura_name53, R.string.sura_revelation53, R.string.sura_ayah_num53, 486, R.raw.elnegm53));
        suras.add(new QuranModel(R.string.sura_num54, R.string.sura_name54, R.string.sura_revelation54, R.string.sura_ayah_num54, 489, R.raw.elkmr54));
        suras.add(new QuranModel(R.string.sura_num55, R.string.sura_name55, R.string.sura_revelation55, R.string.sura_ayah_num55, 492, R.raw.elrahman55));
        suras.add(new QuranModel(R.string.sura_num56, R.string.sura_name56, R.string.sura_revelation56, R.string.sura_ayah_num56, 495, R.raw.elwakaa56));
        suras.add(new QuranModel(R.string.sura_num57, R.string.sura_name57, R.string.sura_revelation57, R.string.sura_ayah_num57, 498, R.raw.elhaded57));
        suras.add(new QuranModel(R.string.sura_num58, R.string.sura_name58, R.string.sura_revelation58, R.string.sura_ayah_num58, 503, R.raw.elmogadla58));
        suras.add(new QuranModel(R.string.sura_num59, R.string.sura_name59, R.string.sura_revelation59, R.string.sura_ayah_num59, 506, R.raw.elhashr59));
        suras.add(new QuranModel(R.string.sura_num60, R.string.sura_name60, R.string.sura_revelation60, R.string.sura_ayah_num60, 509, R.raw.elmomtnha60));
        suras.add(new QuranModel(R.string.sura_num61, R.string.sura_name61, R.string.sura_revelation61, R.string.sura_ayah_num61, 512, R.raw.elsf61));
        suras.add(new QuranModel(R.string.sura_num62, R.string.sura_name62, R.string.sura_revelation62, R.string.sura_ayah_num62, 514, R.raw.elgomaa62));
        suras.add(new QuranModel(R.string.sura_num63, R.string.sura_name63, R.string.sura_revelation63, R.string.sura_ayah_num63, 515, R.raw.elmonafekon63));
        suras.add(new QuranModel(R.string.sura_num64, R.string.sura_name64, R.string.sura_revelation64, R.string.sura_ayah_num64, 517, R.raw.eltghabon64));
        suras.add(new QuranModel(R.string.sura_num65, R.string.sura_name65, R.string.sura_revelation65, R.string.sura_ayah_num65, 519, R.raw.eltalak65));
        suras.add(new QuranModel(R.string.sura_num66, R.string.sura_name66, R.string.sura_revelation66, R.string.sura_ayah_num66, 521, R.raw.elthreem66));
        suras.add(new QuranModel(R.string.sura_num67, R.string.sura_name67, R.string.sura_revelation67, R.string.sura_ayah_num67, 523, R.raw.tbarak67));
        suras.add(new QuranModel(R.string.sura_num68, R.string.sura_name68, R.string.sura_revelation68, R.string.sura_ayah_num68, 525, R.raw.elklam68));
        suras.add(new QuranModel(R.string.sura_num69, R.string.sura_name69, R.string.sura_revelation69, R.string.sura_ayah_num69, 528, R.raw.elhaka69));
        suras.add(new QuranModel(R.string.sura_num70, R.string.sura_name70, R.string.sura_revelation70, R.string.sura_ayah_num70, 530, R.raw.elmaareg70));
        suras.add(new QuranModel(R.string.sura_num71, R.string.sura_name71, R.string.sura_revelation71, R.string.sura_ayah_num71, 532, R.raw.noh71));
        suras.add(new QuranModel(R.string.sura_num72, R.string.sura_name72, R.string.sura_revelation72, R.string.sura_ayah_num72, 533, R.raw.eljen72));
        suras.add(new QuranModel(R.string.sura_num73, R.string.sura_name73, R.string.sura_revelation73, R.string.sura_ayah_num73, 536, R.raw.elmozmel73));
        suras.add(new QuranModel(R.string.sura_num74, R.string.sura_name74, R.string.sura_revelation74, R.string.sura_ayah_num74, 537, R.raw.elmodsr74));
        suras.add(new QuranModel(R.string.sura_num75, R.string.sura_name75, R.string.sura_revelation75, R.string.sura_ayah_num75, 539, R.raw.elkyama75));
        suras.add(new QuranModel(R.string.sura_num76, R.string.sura_name76, R.string.sura_revelation76, R.string.sura_ayah_num76, 541, R.raw.alensan76));
        suras.add(new QuranModel(R.string.sura_num77, R.string.sura_name77, R.string.sura_revelation77, R.string.sura_ayah_num77, 543, R.raw.almorsalat77));
        suras.add(new QuranModel(R.string.sura_num78, R.string.sura_name78, R.string.sura_revelation78, R.string.sura_ayah_num78, 544, R.raw.elnaba78));
        suras.add(new QuranModel(R.string.sura_num79, R.string.sura_name79, R.string.sura_revelation79, R.string.sura_ayah_num79, 546, R.raw.alnazat79));
        suras.add(new QuranModel(R.string.sura_num80, R.string.sura_name80, R.string.sura_revelation80, R.string.sura_ayah_num80, 547, R.raw.abs80));
        suras.add(new QuranModel(R.string.sura_num81, R.string.sura_name81, R.string.sura_revelation81, R.string.sura_ayah_num81, 549, R.raw.altkwer81));
        suras.add(new QuranModel(R.string.sura_num82, R.string.sura_name82, R.string.sura_revelation82, R.string.sura_ayah_num82, 550, R.raw.alenftar82));
        suras.add(new QuranModel(R.string.sura_num83, R.string.sura_name83, R.string.sura_revelation83, R.string.sura_ayah_num83, 551, R.raw.almotffen83));
        suras.add(new QuranModel(R.string.sura_num84, R.string.sura_name84, R.string.sura_revelation84, R.string.sura_ayah_num84, 552, R.raw.alenshkak84));
        suras.add(new QuranModel(R.string.sura_num85, R.string.sura_name85, R.string.sura_revelation85, R.string.sura_ayah_num85, 553, R.raw.albrooj85));
        suras.add(new QuranModel(R.string.sura_num86, R.string.sura_name86, R.string.sura_revelation86, R.string.sura_ayah_num86, 554, R.raw.altarek86));
        suras.add(new QuranModel(R.string.sura_num87, R.string.sura_name87, R.string.sura_revelation87, R.string.sura_ayah_num87, 555, R.raw.alalaa87));
        suras.add(new QuranModel(R.string.sura_num88, R.string.sura_name88, R.string.sura_revelation88, R.string.sura_ayah_num88, 555, R.raw.alghashya88));
        suras.add(new QuranModel(R.string.sura_num89, R.string.sura_name89, R.string.sura_revelation89, R.string.sura_ayah_num89, 556, R.raw.alghashya88));
        suras.add(new QuranModel(R.string.sura_num90, R.string.sura_name90, R.string.sura_revelation90, R.string.sura_ayah_num90, 558, R.raw.albld90));
        suras.add(new QuranModel(R.string.sura_num91, R.string.sura_name91, R.string.sura_revelation91, R.string.sura_ayah_num91, 558, R.raw.alshams91));
        suras.add(new QuranModel(R.string.sura_num92, R.string.sura_name92, R.string.sura_revelation92, R.string.sura_ayah_num92, 559, R.raw.ellil92));
        suras.add(new QuranModel(R.string.sura_num93, R.string.sura_name93, R.string.sura_revelation93, R.string.sura_ayah_num93, 560, R.raw.eldoha93));
        suras.add(new QuranModel(R.string.sura_num94, R.string.sura_name94, R.string.sura_revelation94, R.string.sura_ayah_num94, 560, R.raw.elsharh94));
        suras.add(new QuranModel(R.string.sura_num95, R.string.sura_name95, R.string.sura_revelation95, R.string.sura_ayah_num95, 561, R.raw.alteen95));
        suras.add(new QuranModel(R.string.sura_num96, R.string.sura_name96, R.string.sura_revelation96, R.string.sura_ayah_num96, 561, R.raw.alalak96));
        suras.add(new QuranModel(R.string.sura_num97, R.string.sura_name97, R.string.sura_revelation97, R.string.sura_ayah_num97, 562, R.raw.alkdr97));
        suras.add(new QuranModel(R.string.sura_num98, R.string.sura_name98, R.string.sura_revelation98, R.string.sura_ayah_num98, 562, R.raw.albyna98));
        suras.add(new QuranModel(R.string.sura_num99, R.string.sura_name99, R.string.sura_revelation99, R.string.sura_ayah_num99, 563, R.raw.alzlzla99));
        suras.add(new QuranModel(R.string.sura_num100, R.string.sura_name100, R.string.sura_revelation100, R.string.sura_ayah_num100, 563, R.raw.eladyat100));
        suras.add(new QuranModel(R.string.sura_num101, R.string.sura_name101, R.string.sura_revelation101, R.string.sura_ayah_num101, 564, R.raw.elkaraa101));
        suras.add(new QuranModel(R.string.sura_num102, R.string.sura_name102, R.string.sura_revelation102, R.string.sura_ayah_num102, 564, R.raw.altkasor102));
        suras.add(new QuranModel(R.string.sura_num103, R.string.sura_name103, R.string.sura_revelation103, R.string.sura_ayah_num103, 565, R.raw.alasr103));
        suras.add(new QuranModel(R.string.sura_num104, R.string.sura_name104, R.string.sura_revelation104, R.string.sura_ayah_num104, 565, R.raw.alhamza104));
        suras.add(new QuranModel(R.string.sura_num105, R.string.sura_name105, R.string.sura_revelation105, R.string.sura_ayah_num105, 565, R.raw.alfeel105));
        suras.add(new QuranModel(R.string.sura_num106, R.string.sura_name106, R.string.sura_revelation106, R.string.sura_ayah_num106, 566, R.raw.korysh106));
        suras.add(new QuranModel(R.string.sura_num107, R.string.sura_name107, R.string.sura_revelation107, R.string.sura_ayah_num107, 566, R.raw.almaoom107));
        suras.add(new QuranModel(R.string.sura_num108, R.string.sura_name108, R.string.sura_revelation108, R.string.sura_ayah_num108, 566, R.raw.alkwsr108));
        suras.add(new QuranModel(R.string.sura_num109, R.string.sura_name109, R.string.sura_revelation109, R.string.sura_ayah_num109, 567, R.raw.alkaferon109));
        suras.add(new QuranModel(R.string.sura_num110, R.string.sura_name110, R.string.sura_revelation110, R.string.sura_ayah_num110, 567, R.raw.alnasar110));
        suras.add(new QuranModel(R.string.sura_num111, R.string.sura_name111, R.string.sura_revelation111, R.string.sura_ayah_num111, 567, R.raw.almsd111));
        suras.add(new QuranModel(R.string.sura_num112, R.string.sura_name112, R.string.sura_revelation112, R.string.sura_ayah_num112, 567, R.raw.elekhlas112));
        suras.add(new QuranModel(R.string.sura_num113, R.string.sura_name113, R.string.sura_revelation113, R.string.sura_ayah_num113, 567, R.raw.elflk113));
        suras.add(new QuranModel(R.string.sura_num114, R.string.sura_name114, R.string.sura_revelation114, R.string.sura_ayah_num114, 567, R.raw.elnas114));
        */
        return suras;
    }
}