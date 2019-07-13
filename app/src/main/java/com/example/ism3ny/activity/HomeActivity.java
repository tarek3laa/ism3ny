package com.example.ism3ny.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.ism3ny.fragment.FavoriteFragment;
import com.example.ism3ny.fragment.HomeFragment;
import com.example.ism3ny.R;
import com.example.ism3ny.fragment.PlayListFragment;
import com.example.ism3ny.fragment.ProfileFragment;
import com.example.ism3ny.fragment.SearchFragment;
import com.example.ism3ny.adapter.SectionPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SectionPageAdapter sectionPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.container);
        tabLayout.setupWithViewPager(viewPager);
        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        setUpTabs();

    }

    private void setUpTabs() {
        sectionPageAdapter.addFragment(new HomeFragment(), "Home");
        sectionPageAdapter.addFragment(new SearchFragment(), "Search");
        sectionPageAdapter.addFragment(new FavoriteFragment(), "Favorite");
        sectionPageAdapter.addFragment(new PlayListFragment(), "play list");
        sectionPageAdapter.addFragment(new ProfileFragment(), "mee");
        viewPager.setAdapter(sectionPageAdapter);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_50dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_search);
        tabLayout.getTabAt(2).setIcon(R.drawable.favorite_35dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_playlist);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_user);
    }
}