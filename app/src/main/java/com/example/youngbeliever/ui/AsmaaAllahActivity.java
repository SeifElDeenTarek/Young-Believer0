package com.example.youngbeliever.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.youngbeliever.R;
import com.example.youngbeliever.pojo.AsmaaAllahModel;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class AsmaaAllahActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    Toolbar asmaaAllahToolbar;
    DrawerLayout asmaaAllahDrawer;
    NavigationView asmaaAllahNavigation;
    AsmaaAllahViewModel asmaaAllahViewModel;
    RecyclerView asmaaAllahRecycler;
    MaterialCardView dynamicCardView;
    TextView asmAllahMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asmaa_allah_activity);

        asmaaAllahToolbar = findViewById(R.id.asmaa_allah_toolbar);
        asmaaAllahDrawer = findViewById(R.id.asmaa_allah_drawer_layout);
        asmaaAllahNavigation = findViewById(R.id.asmaa_allah_navigation_view);
        dynamicCardView = findViewById(R.id.card_view);
        asmAllahMeaning = findViewById(R.id.asm_allah_meaning);
        asmaaAllahRecycler = findViewById(R.id.asmaa_allah_recycler);
        asmaaAllahViewModel = ViewModelProviders.of(this).get(AsmaaAllahViewModel.class);

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

        AsmaaAllahAdapter adapter = new AsmaaAllahAdapter();
        asmaaAllahRecycler.setAdapter(adapter);

        asmaaAllahViewModel.getAsmaaAllah();

        asmaaAllahViewModel.asmAllahData.observe(this, new Observer<ArrayList<AsmaaAllahModel>>()
        {
            @Override
            public void onChanged(ArrayList<AsmaaAllahModel> asmaaAllahModels)
            {
                adapter.setList(asmaaAllahModels, new AsmaaAllahAdapter.itemClickListener()
                {
                    @Override
                    public void onItemClick(AsmaaAllahModel asmaaAllahModel)
                    {
                        dynamicCardView.setVisibility(View.VISIBLE);
                        asmAllahMeaning.setText(asmaaAllahModel.getAsmAllahMeaning());
                    }
                });
            }
        });

        int noOfCol = 3;
        asmaaAllahRecycler.setLayoutManager(new GridLayoutManager(this, noOfCol));
        asmaaAllahRecycler.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }

    @Override
    public void onBackPressed()
    {
        if(asmaaAllahDrawer.isDrawerOpen(GravityCompat.START))
        {
            asmaaAllahDrawer.closeDrawer(GravityCompat.START);
        }
        else if(dynamicCardView.isShown())
        {
            dynamicCardView.setVisibility(View.GONE);
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
                intent = new Intent(this, StoriesActivity.class);
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