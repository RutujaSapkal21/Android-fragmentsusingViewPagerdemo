package com.example.viewpagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
   TabLayout tabLayout;
   ViewPager viewPager;
    PageAdapter pageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);

        viewPager = findViewById(R.id.viewpager);


        FragmentManager fragmentManager = getSupportFragmentManager();


        pageAdapter = new PageAdapter(fragmentManager);


        pageAdapter.add(new Page1(), "Page1");
        pageAdapter.add(new Page2(), "Page2");
        pageAdapter.add(new Page3(), "Page3");


        viewPager.setAdapter(pageAdapter);

        tabLayout.setupWithViewPager(viewPager);


    }


    }