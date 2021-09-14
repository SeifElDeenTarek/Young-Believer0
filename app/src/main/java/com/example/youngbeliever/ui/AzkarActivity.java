package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.youngbeliever.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class AzkarActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar azkarToolbar;
    DrawerLayout azkarDrawer;
    NavigationView azkarNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.azkar_activity);

        azkarToolbar = findViewById(R.id.azkar_toolbar);
        azkarDrawer = findViewById(R.id.azkar_drawer_layout);
        azkarNavigation = findViewById(R.id.azkar_navigation_view);

        setSupportActionBar(azkarToolbar);

        azkarNavigation.setCheckedItem(R.id.azkar);
        azkarNavigation.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                azkarDrawer,
                azkarToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );

        azkarDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        azkarNavigation.setNavigationItemSelectedListener(this);

        ViewPager azkarViewPager = findViewById(R.id.azkar_view_pager);
        AzkarFragmentAdapter adapter = new AzkarFragmentAdapter(this, getSupportFragmentManager());

        azkarViewPager.setAdapter(adapter);

        TabLayout azkarTabLayout = findViewById(R.id.azkar_tabs);
        azkarTabLayout.setupWithViewPager(azkarViewPager);
    }

    @Override
    public void onBackPressed()
    {
        if(azkarDrawer.isDrawerOpen(GravityCompat.START))
        {
            azkarDrawer.closeDrawer(GravityCompat.START);
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
                azkarDrawer.closeDrawers();
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
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                azkarDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}