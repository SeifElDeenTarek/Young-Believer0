package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.example.youngbeliever.R;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar toolbar;
    DrawerLayout mainDrawer;
    NavigationView mainNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        toolbar = findViewById(R.id.main_toolbar);
        mainDrawer = findViewById(R.id.home_drawer_layout);
        mainNavigation = findViewById(R.id.home_navigation_view);

        //Add ActionBar
        setSupportActionBar(toolbar);

        //Bring the NavigationView Forward
        mainNavigation.bringToFront();

        //Connect DrawerLayout with ActionBar
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                mainDrawer,
                toolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );
        //Add Drawer Listener
        mainDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        //Set Listener
        mainNavigation.setNavigationItemSelectedListener(this);
    }

    //BackPress Close DrawerLayout
    @Override
    public void onBackPressed()
    {
        if(mainDrawer.isDrawerOpen(GravityCompat.START))
        {
            mainDrawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }
    //Handle NavigationView Listener
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        Intent intent;
        switch (item.getItemId())
        {
            case R.id.holy_quran:
                intent = new Intent(this, QuranActivity.class);
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
                mainDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}