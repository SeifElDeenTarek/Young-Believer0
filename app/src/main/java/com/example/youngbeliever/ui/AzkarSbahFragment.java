package com.example.youngbeliever.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AzkarModel;

import java.util.ArrayList;

public class AzkarSbahFragment extends Fragment
{
    AzkarSbahViewModel azkarSbahViewModel;
    public AzkarSbahFragment()
    {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.azkar_list, container, false);
        azkarSbahViewModel = ViewModelProviders.of(this).get(AzkarSbahViewModel.class);

        RecyclerView azkarSbahRecycler = rootView.findViewById(R.id.azkar_recycler);
        AzkarAdapter adapter = new AzkarAdapter();

        azkarSbahRecycler.setAdapter(adapter);

        azkarSbahViewModel.getZekr();

        azkarSbahViewModel.azkarData.observe(getViewLifecycleOwner(), new Observer<ArrayList<AzkarModel>>()
        {
            @Override
            public void onChanged(ArrayList<AzkarModel> azkarModels)
            {
                adapter.setList(azkarModels, new AzkarAdapter.itemClickListener()
                {
                    @Override
                    public void onItemClick(AzkarModel azkarModel)
                    {
                    }
                });
            }
        });

        azkarSbahRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        azkarSbahRecycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        return rootView;
    }
}
