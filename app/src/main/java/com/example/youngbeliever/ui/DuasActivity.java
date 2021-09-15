package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.youngbeliever.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class DuasActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar duasToolbar;
    DrawerLayout duasDrawer;
    NavigationView duasNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.duas_activity);

        duasToolbar = findViewById(R.id.duas_toolbar);
        duasDrawer = findViewById(R.id.duas_drawer_layout);
        duasNavigation = findViewById(R.id.duas_navigation_view);

        setSupportActionBar(duasToolbar);

        duasNavigation.setCheckedItem(R.id.duas);
        duasNavigation.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                duasDrawer,
                duasToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );

        duasDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        duasNavigation.setNavigationItemSelectedListener(this);

        ViewPager duasViewPager = findViewById(R.id.duas_view_pager);
        DuasFragmentAdapter adapter = new DuasFragmentAdapter(this, getSupportFragmentManager());

        duasViewPager.setAdapter(adapter);

        TabLayout duasTabLayout = findViewById(R.id.duas_tabs);
        duasTabLayout.setupWithViewPager(duasViewPager);
    }

    @Override
    public void onBackPressed()
    {
        if (duasDrawer.isDrawerOpen(GravityCompat.START))
        {
            duasDrawer.closeDrawer(GravityCompat.START);
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
                intent = new Intent(this, ArkanActivity.class);
                startActivity(intent);
                break;
            case R.id.azkar:
                intent = new Intent(this, AzkarActivity.class);
                startActivity(intent);
                break;
            case R.id.duas:
                duasDrawer.closeDrawers();
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
                duasDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}