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

public class AsmaaAllah extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar asmaaAllahToolbar;
    DrawerLayout asmaaAllahDrawer;
    NavigationView asmaaAllahNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asmaa_allah_activity);

        asmaaAllahToolbar = findViewById(R.id.asmaa_allah_toolbar);
        asmaaAllahDrawer = findViewById(R.id.asmaa_allah_drawer_layout);
        asmaaAllahNavigation = findViewById(R.id.asmaa_allah_navigation_view);

        setSupportActionBar(asmaaAllahToolbar);
        asmaaAllahNavigation.setCheckedItem(R.id.god_names);

        asmaaAllahNavigation.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                asmaaAllahDrawer,
                asmaaAllahToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );
        asmaaAllahDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        asmaaAllahNavigation.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed()
    {
        if(asmaaAllahDrawer.isDrawerOpen(GravityCompat.START))
        {
            asmaaAllahDrawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

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
            case R.id.god_names:
                asmaaAllahDrawer.closeDrawers();
                break;
            default:
                return true;
        }
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                asmaaAllahDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}