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
import android.view.Menu;
import android.view.MenuItem;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.StoriesModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class StoriesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar storiesToolbar;
    DrawerLayout storiesDrawer;
    NavigationView storiesNavigation;
    RecyclerView storyRecycler;
    StoriesViewModel storiesViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stories_activity);

        storiesToolbar = findViewById(R.id.stories_toolbar);
        storiesDrawer = findViewById(R.id.stories_drawer_layout);
        storiesNavigation = findViewById(R.id.stories_navigation_view);
        storyRecycler = findViewById(R.id.stories_recycler);

        storiesViewModel = ViewModelProviders.of(this).get(StoriesViewModel.class);

        setSupportActionBar(storiesToolbar);

        storiesNavigation.setCheckedItem(R.id.qess_rosl);
        storiesNavigation.bringToFront();

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                storiesDrawer,
                storiesToolbar,
                R.string.openNavigationDrawer,
                R.string.closeNavigationDrawer
        );

        storiesDrawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        storiesNavigation.setNavigationItemSelectedListener(this);

        StoriesAdapter adapter = new StoriesAdapter();
        storyRecycler.setAdapter(adapter);

        storiesViewModel.getStoryData();

        storiesViewModel.storiesData.observe(this, new Observer<ArrayList<StoriesModel>>()
        {
            @Override
            public void onChanged(ArrayList<StoriesModel> storiesModels)
            {
                adapter.setList(storiesModels, new StoriesAdapter.itemClickListener()
                {
                    @Override
                    public void onItemClick(StoriesModel storiesModel)
                    {
                        intent(storiesModel.getStoryName());
                    }
                });
            }
        });

        storyRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    private void intent(int name)
    {
        Intent intent = new Intent(this, StoriesPDF.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        if (storiesDrawer.isDrawerOpen(GravityCompat.START))
        {
            storiesDrawer.closeDrawer(GravityCompat.START);
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
                intent = new Intent(this, DuasActivity.class);
                startActivity(intent);
                break;
            case R.id.qess_rosl:
                storiesDrawer.closeDrawers();
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
                storiesDrawer.closeDrawers();
            }
        },200);
        return true;
    }
}