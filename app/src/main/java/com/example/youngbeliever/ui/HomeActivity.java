package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
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

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.HomeModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    HomeViewModel homeViewModel;
    Toolbar toolbar;
    DrawerLayout mainDrawer;
    NavigationView mainNavigation;
    RecyclerView homeRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        toolbar = findViewById(R.id.main_toolbar);
        mainDrawer = findViewById(R.id.home_drawer_layout);
        mainNavigation = findViewById(R.id.home_navigation_view);
        homeRecycler = findViewById(R.id.home_recycler);
        //Link the ViewModel with Activity
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

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

        //Set Adapter
        HomeAdapter adapter = new HomeAdapter();
        homeRecycler.setAdapter(adapter);

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
                            case "Holy Quran":
                                intent = new Intent(getApplicationContext(), QuranActivity.class);
                                startActivity(intent);
                                break;
                        }
                    }
                });
            }
        });

        //Recycler Layout and setting the data
        int nomOfCol = 2;
        homeRecycler.setLayoutManager(new GridLayoutManager(this, nomOfCol));
        homeViewModel.getSectionData();
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