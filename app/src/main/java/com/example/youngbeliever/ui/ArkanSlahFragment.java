package com.example.youngbeliever.ui;

import android.content.Intent;
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
import com.example.youngbeliever.pojo.ArkanSlahModel;

import java.util.ArrayList;

public class ArkanSlahFragment extends Fragment
{
    ArkanSlahViewModel arkanSlahViewModel;

    public ArkanSlahFragment()
    {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.arkan_slah_list, container, false);

        arkanSlahViewModel = ViewModelProviders.of(this).get(ArkanSlahViewModel.class);

        RecyclerView slahRecycler = rootView.findViewById(R.id.arkan_slah_recycler);

        ArkanSlahAdapter adapter = new ArkanSlahAdapter();
        slahRecycler.setAdapter(adapter);

        arkanSlahViewModel.getSlahWay();

        arkanSlahViewModel.slahWay.observe(getViewLifecycleOwner(), new Observer<ArrayList<ArkanSlahModel>>()
        {
            @Override
            public void onChanged(ArrayList<ArkanSlahModel> arkanSlahModels)
            {
                adapter.setList(arkanSlahModels, new ArkanSlahAdapter.itemClickListener()
                {
                    @Override
                    public void onItemClick(ArkanSlahModel arkanSlahModel)
                    {
                        intent(arkanSlahModel.getSlahWay());
                    }
                });
            }
        });

        slahRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        slahRecycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        return rootView;
    }

    private void intent(int name)
    {
        Intent intent = new Intent(getContext(), SlahVideo.class);
        intent.putExtra("name" , name);
        startActivity(intent);
    }
}
