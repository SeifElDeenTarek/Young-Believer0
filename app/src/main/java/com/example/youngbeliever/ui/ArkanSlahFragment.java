package com.example.youngbeliever.ui;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.ArkanSlahModel;
import com.github.barteksc.pdfviewer.util.Util;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

public class ArkanSlahFragment extends Fragment
{
    ArkanSlahViewModel arkanSlahViewModel;

    MediaController mediaController;
    VideoView slahVideoView;
    String videoPath;
    int videoName;
    Uri uri;
    MaterialCardView slahContainer;
    RelativeLayout layout;
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

        FloatingActionButton floatingActionButton = rootView.findViewById(R.id.fab);

        layout = rootView.findViewById(R.id.page);

        slahVideoView = rootView.findViewById(R.id.slah_video_view);
        slahContainer = rootView.findViewById(R.id.slah_video_container);

        mediaController = new MediaController(getActivity());
        slahVideoView.setMediaController(mediaController);
        mediaController.setAnchorView(slahVideoView);

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
                        videoName = arkanSlahModel.getSlahWay();
                        slahContainer.setVisibility(View.VISIBLE);
                        floatingActionButton.setVisibility(View.VISIBLE);

                        setUserVisibleHint(true);
                    }
                });
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                slahContainer.setVisibility(View.GONE);
                slahVideoView.stopPlayback();
                floatingActionButton.setVisibility(View.GONE);
            }
        });

        slahRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        slahRecycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        return rootView;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser)
    {
        super.setUserVisibleHint(isVisibleToUser);
        if (this.isVisible())
        {
            if (!isVisibleToUser)
            {
                slahVideoView.stopPlayback();
            } else {
                switch (videoName)
                {
                    case R.string.slah_way_1:
                        videoPath = "android.resource://" + requireActivity().getPackageName() + "/" + R.raw.one;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        slahVideoView.start();
                        break;
                    case R.string.slah_way_2:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.two;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        slahVideoView.start();
                        break;
                    case R.string.slah_way_3:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.three;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_4:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.four;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_5:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.five;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_6:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.six;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_7:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.seven;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_8:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.eight;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_9:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.nine;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_10:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.ten;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                    case R.string.slah_way_11:
                        videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.eleven;
                        uri = Uri.parse(videoPath);
                        slahVideoView.setVideoURI(uri);
                        break;
                }
            }
        }
    }
}
