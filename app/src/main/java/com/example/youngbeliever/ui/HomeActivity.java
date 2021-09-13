package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.HomeModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    HomeViewModel homeViewModel;
    Toolbar mainToolbar;
    DrawerLayout homeDrawer;
    NavigationView mainNavigation;
    RecyclerView homeRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        mainToolbar = findViewById(R.id.home_toolbar);
        homeDrawer = findViewById(R.id.home_drawer_layout);
        mainNavigation = findViewById(R.id.home_navigation_view);
        homeRecycler = findViewById(R.id.home_recycler);
        //Link the ViewModel with Activity
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);

        //Add ActionBar
        setSupportActionBar(mainToolbar);

        //Bring the NavigationView Forward
        mainNavigation.bringToFront();

        //Connect DrawerLayout with ActionBar
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                homeDrawer,
                mainToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );
        //Add Drawer Listener
        homeDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        //Set Listener
        mainNavigation.setNavigationItemSelectedListener(this);
        //CheckItem
        mainNavigation.setCheckedItem(R.id.home_page);

        //Set Adapter
        HomeAdapter adapter = new HomeAdapter();
        homeRecycler.setAdapter(adapter);
        //set the data
        homeViewModel.getSectionData();

        //Observe for data Change && Clicks
        homeViewModel.sectionData.observe(this, new Observer<ArrayList<HomeModel>>()
        {
            @Override
            public void onChanged(ArrayList<HomeModel> homeModels)
            {
                adapter.setList(homeModels, new HomeAdapter.itemClickListener()
                {
                    @Override
                    public void onItemClick(HomeModel homeModel)
                    {
                        Intent intent;
                        switch (homeModel.getSectionName())
                        {
                            case R.string.holy_quran:
                                intent = new Intent(getApplicationContext(), QuranActivity.class);
                                startActivity(intent);
                                break;
                            case R.string.islam_pillars:
                                intent = new Intent(getApplicationContext(), ArkanActivity.class);
                                startActivity(intent);
                                break;
                            case R.string.al_azkar:
                                intent = new Intent(getApplicationContext(), AzkarActivity.class);
                                startActivity(intent);
                                break;
                            case R.string.duas:
                                intent = new Intent(getApplicationContext(), DuasActivity.class);
                                startActivity(intent);
                                break;
                            case R.string.prophets_stories:
                                intent = new Intent(getApplicationContext(), StoriesActivity.class);
                                startActivity(intent);
                                break;
                            case R.string.god_names:
                                intent = new Intent(getApplicationContext(), AsmaaAllahActivity.class);
                                startActivity(intent);
                                break;
                        }
                    }
                });
            }
        });

        //Recycler Layout
        int nomOfCol = 2;
        homeRecycler.setLayoutManager(new GridLayoutManager(this, nomOfCol));
        //direction to RTL
        homeRecycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }

    //BackPress Close DrawerLayout
    @Override
    public void onBackPressed()
    {
        if(homeDrawer.isDrawerOpen(GravityCompat.START))
        {
            homeDrawer.closeDrawer(GravityCompat.START);
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
            case R.id.home_page:
                homeDrawer.closeDrawers();
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
        }
        //Control Close Duration
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                homeDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}