package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.youngbeliever.R;
import com.google.android.material.navigation.NavigationView;

public class QuranActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar quranToolbar;
    DrawerLayout quranDrawer;
    NavigationView quranNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran_activity);

        quranToolbar = findViewById(R.id.quran_toolbar);
        quranDrawer = findViewById(R.id.quran_drawer_layout);
        quranNavigation = findViewById(R.id.quran_navigation_view);

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