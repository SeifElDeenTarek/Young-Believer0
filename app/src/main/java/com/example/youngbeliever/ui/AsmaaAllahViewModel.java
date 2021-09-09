package com.example.youngbeliever.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AsmaaAllahModel;

import java.util.ArrayList;

public class AsmaaAllahViewModel extends ViewModel
{
    public MutableLiveData<ArrayList<AsmaaAllahModel>> asmAllahData = new MutableLiveData<>();

    public void getAsmaaAllah()
    {
        asmAllahData.setValue(getAsmAllahFromDataBase());
    }

    private ArrayList<AsmaaAllahModel> getAsmAllahFromDataBase()
    {
        ArrayList<AsmaaAllahModel> asmaaAllahData = new ArrayList<>();
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm1, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm2, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm3, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm4, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm5, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm6, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm7, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm8, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm9, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm10, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm11, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm12, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm13, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm14, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm15, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm16, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm17, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm18, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm19, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm20, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm21, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm22, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm23, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm24, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm25, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm26, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm27, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm28, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm29, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm30, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm31, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm32, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm33, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm34, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm35, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm36, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm37, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm38, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm39, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm40, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm41, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm42, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm43, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm44, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm45, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm46, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm47, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm48, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm49, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm50, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm51, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm52, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm53, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm54, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm55, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm56, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm57, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm58, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm59, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm60, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm61, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm62, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm63, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm64, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm65, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm66, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm67, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm68, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm69, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm70, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm71, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm72, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm73, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm74, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm75, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm76, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm77, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm78, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm79, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm80, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm81, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm82, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm83, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm84, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm85, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm86, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm87, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm88, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm89, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm90, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm91, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm92, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm93, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm94, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm95, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm96, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm97, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm98, R.string.asm1));
        asmaaAllahData.add(new AsmaaAllahModel(R.string.asm99, R.string.asm1));
        return asmaaAllahData;
    }
}