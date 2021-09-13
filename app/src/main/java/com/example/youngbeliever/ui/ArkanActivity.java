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

public class ArkanActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar arkanToolbar;
    DrawerLayout arkanDrawer;
    NavigationView arkanNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arkan_activity);

        arkanToolbar = findViewById(R.id.arkan_toolbar);
        arkanDrawer = findViewById(R.id.arkan_drawer_layout);
        arkanNavigation = findViewById(R.id.arkan_navigation_view);

        setSupportActionBar(arkanToolbar);

        arkanNavigation.setCheckedItem(R.id.arkan_eslam);
        arkanNavigation.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                arkanDrawer,
                arkanToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );

        arkanDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        arkanNavigation.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed()
    {
        if (arkanDrawer.isDrawerOpen(GravityCompat.START))
        {
            arkanDrawer.closeDrawer(GravityCompat.START);
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
                intent = new Intent(this, QuranActivity.class);
                startActivity(intent);
                break;
            case R.id.arkan_eslam:
                arkanDrawer.closeDrawers();
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
                arkanDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}