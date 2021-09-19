package com.example.youngbeliever.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.QuranModel;
import com.github.barteksc.pdfviewer.PDFView;

public class QuranPDF extends AppCompatActivity
{
    PDFView quranPDF;

    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener()
    {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer)
        {
            releaseMediaPlayer();
        }
    };
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener()
    {
        @Override
        public void onAudioFocusChange(int focusChange)
        {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)
            {
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN)
            {
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS)
            {
                releaseMediaPlayer();
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran_pdf_activity);

        quranPDF = findViewById(R.id.quran_pdf_view);
        mAudioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        int pageNum = getIntent().getIntExtra("page_number", 1);
        int suraAudio = getIntent().getIntExtra("sura_audio", R.raw.fatiha1);

        quranPDF.fromAsset("holy_quran.pdf")
                .defaultPage(pageNum)
                 //.swipeHorizontal(true)
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();

        int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

        if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
        {
            mMediaPlayer = MediaPlayer.create(QuranPDF.this, suraAudio);
            mMediaPlayer.start();
            mMediaPlayer.setOnCompletionListener(mCompletionListener);
        }
    }
    private void releaseMediaPlayer()
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
    @Override
    public void onPause()
    {
        super.onPause();
        releaseMediaPlayer();
    }
}