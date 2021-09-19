package com.example.youngbeliever.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.QuranModel;
import com.github.barteksc.pdfviewer.PDFView;

import java.util.Timer;
import java.util.TimerTask;

public class QuranPDF extends AppCompatActivity
{
    PDFView quranPDF;

    private MediaPlayer QuranPlayer;
    private AudioManager mAudioManager;

    SeekBar quranSeekBar;
    ImageButton quranPlay;
    ImageButton quranPause;

    private Handler mHandler;
    private Runnable mRunnable;
    private Context mContext;
    private Activity mActivity;

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
                QuranPlayer.pause();
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN)
            {
                QuranPlayer.start();
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

        mContext = getApplicationContext();
        mActivity = QuranPDF.this;

        quranPDF = findViewById(R.id.quran_pdf_view);
        mAudioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        quranSeekBar = findViewById(R.id.quran_seekbar);
        quranPlay = findViewById(R.id.quran_play);
        quranPause = findViewById(R.id.quran_pause);

        int pageNum = getIntent().getIntExtra("page_number", 1);
        int suraAudio = getIntent().getIntExtra("sura_audio", R.raw.fatiha1);

        quranPDF.fromAsset("holy_quran.pdf")
                .defaultPage(pageNum)
                 //.swipeHorizontal(true)
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();

        mHandler = new Handler();

        quranPlay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) 
            {
                quranPause.setVisibility(View.VISIBLE);
                // If media player another instance already running then stop it first
                releaseMediaPlayer();
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                {
                    // Initialize media player
                    QuranPlayer = MediaPlayer.create(mContext, suraAudio);

                    // Start the media player
                    QuranPlayer.start();

                    // Get the current audio stats
                    getAudioStats();
                    // Initialize the seek bar
                    initializeSeekBar();
                }
            }
        });

        quranPause.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                quranPlay.setVisibility(View.VISIBLE);
                quranPause.setVisibility(View.GONE);
                releaseMediaPlayer();
            }
        });
/*
        int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

        if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
        {
            QuranPlayer = MediaPlayer.create(QuranPDF.this, suraAudio);
            QuranPlayer.start();
            QuranPlayer.setOnCompletionListener(mCompletionListener);
        }
*/
        quranSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            /*
                void onProgressChanged (SeekBar seekBar, int progress, boolean fromUser)
                    Notification that the progress level has changed. Clients can use the fromUser
                    parameter to distinguish user-initiated changes from those that occurred programmatically.

                Parameters
                    seekBar SeekBar : The SeekBar whose progress has changed
                    progress int : The current progress level. This will be in the range min..max
                                   where min and max were set by setMin(int) and setMax(int),
                                   respectively. (The default values for min is 0 and max is 100.)
                    fromUser boolean : True if the progress change was initiated by the user.
            */
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                if(QuranPlayer != null && b)
                {
                    /*
                        void seekTo (int msec)
                            Seeks to specified time position. Same as seekTo(long, int)
                            with mode = SEEK_PREVIOUS_SYNC.

                        Parameters
                            msec int: the offset in milliseconds from the start to seek to

                        Throws
                            IllegalStateException : if the internal player engine has not been initialized
                    */
                    QuranPlayer.seekTo(i*1000);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }
    private void releaseMediaPlayer()
    {
        if (QuranPlayer != null)
        {
            QuranPlayer.release();
            QuranPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
    @Override
    public void onPause()
    {
        super.onPause();
        releaseMediaPlayer();
        quranPause.setVisibility(View.GONE);
    }
    protected void getAudioStats()
    {
        int duration  = QuranPlayer.getDuration()/1000; // In milliseconds
        int due = (QuranPlayer.getDuration() - QuranPlayer.getCurrentPosition())/1000;
        int pass = duration - due;
/*
        mPass.setText("" + pass + " seconds");
        mDuration.setText("" + duration + " seconds");
        mDue.setText("" + due + " seconds");
    */}
    protected void initializeSeekBar()
    {
        quranSeekBar.setMax(QuranPlayer.getDuration()/1000);
        mRunnable = new Runnable()
        {
            @Override
            public void run()
            {
                if(QuranPlayer!=null)
                {
                    int mCurrentPosition = QuranPlayer.getCurrentPosition()/1000; // In milliseconds
                    quranSeekBar.setProgress(mCurrentPosition);
                    getAudioStats();
                }
                mHandler.postDelayed(mRunnable,1000);
            }
        };
        mHandler.postDelayed(mRunnable,1000);
    }
}