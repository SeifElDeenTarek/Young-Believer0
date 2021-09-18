package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.QuranModel;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class QuranActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar quranToolbar;
    DrawerLayout quranDrawer;
    NavigationView quranNavigation;
    RecyclerView quranRecycler;
    QuranViewModel quranViewModel;
    PDFView quranPDf;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran_activity);

        quranToolbar = findViewById(R.id.quran_toolbar);
        quranDrawer = findViewById(R.id.quran_drawer_layout);
        quranNavigation = findViewById(R.id.quran_navigation_view);
        quranRecycler = findViewById(R.id.quran_recycler_view);
        quranPDf = findViewById(R.id.quran_pdf_view);

        quranViewModel = ViewModelProviders.of(this).get(QuranViewModel.class);

        setSupportActionBar(quranToolbar);

        quranNavigation.setCheckedItem(R.id.holy_quran);
        quranNavigation.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                quranDrawer,
                quranToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );

        quranDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        quranNavigation.setNavigationItemSelectedListener(this);

        QuranAdapter adapter = new QuranAdapter();
        quranRecycler.setAdapter(adapter);

        quranViewModel.getSuraData();

        quranViewModel.suraDate.observe(this, new Observer<ArrayList<QuranModel>>()
        {
            @Override
            public void onChanged(ArrayList<QuranModel> quranModels)
            {
                adapter.setList(quranModels, new QuranAdapter.itemClickListener()
                {
                    @Override
                    public void onItemCLick(QuranModel quranModel)
                    {
                        QuranPDF(quranModel.getSuraPage(), quranModel.getSuraAudio());
                    }
                });
            }
        });

        quranRecycler.setLayoutManager(new LinearLayoutManager(this));
        quranRecycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }

    public void QuranPDF(int pageNum, int suraAudio)
    {
        Intent intent = new Intent(this, QuranPDF.class);
        intent.putExtra("page_number", pageNum);
        intent.putExtra("sura_audio", suraAudio);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        if (quranDrawer.isDrawerOpen(GravityCompat.START))
        {
            quranDrawer.closeDrawer(GravityCompat.START);
        }
        else {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        Intent intent;
        switch (item.getItemId())
        {
            case R.id.home_page:
                intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.holy_quran:
                quranDrawer.closeDrawers();
                break;
            case R.id.arkan_eslam:
                intent = new Intent(this, ArkanActivity.class);
                startActivity(intent);
                break;
            case R.id.azkar:
                intent = new Intent(this, AzkarActivity.class);
                startActivity(intent);
                break;
            case R.id.duas:
                intent = new Intent(this, DuasActivity.class);
                startActivity(intent);
                break;
            case R.id.qess_rosl:
                intent = new Intent(this, StoriesActivity.class);
                startActivity(intent);
                break;
            case R.id.god_names:
                intent = new Intent(this, AsmaaAllahActivity.class);
                startActivity(intent);
                break;
            default:
                return true;
        }
        //Control Close Duration
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                quranDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}