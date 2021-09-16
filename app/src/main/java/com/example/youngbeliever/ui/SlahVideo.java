package com.example.youngbeliever.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.youngbeliever.R;

public class SlahVideo extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slah_video_activity);

        VideoView slahVideoView = findViewById(R.id.slah_video_view);

        MediaController mediaController = new MediaController(this);
        slahVideoView.setMediaController(mediaController);
        mediaController.setAnchorView(slahVideoView);

        String videoPath;
        Uri uri;

        int name = getIntent().getIntExtra("name", R.string.slah_way_1);


        switch (name)
        {
            case R.string.slah_way_1:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.one;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_2:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.two;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_3:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.three;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_4:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.four;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_5:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.five;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_6:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.six;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_7:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.seven;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_8:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.eight;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_9:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.nine;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_10:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.ten;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;
            case R.string.slah_way_11:
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.eleven;
                uri = Uri.parse(videoPath);
                slahVideoView.setVideoURI(uri);
                break;

        }
    }
}