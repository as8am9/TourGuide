package com.example.elkingabomaher.sohagtourguide;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    AppBarLayout appBarLayout;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appBarLayout = (AppBarLayout)findViewById(R.id.htab_appbar);
        tabLayout = (TabLayout)findViewById(R.id.htab_tabs);
        viewPager = (ViewPager)findViewById(R.id.htab_viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new PlacesFragment(),"Places");
        viewPagerAdapter.addFragment(new ResFragment(),"Restaurants");
        viewPagerAdapter.addFragment(new HotelsFragment(),"Hotels");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        //to set icons for tabs
        int[] icons = {R.drawable.places,R.drawable.restaurant,R.drawable.hotel};
        for (int i = 0; i < 3; i++)
        {
           tabLayout.getTabAt(i).setIcon(icons[i]);
        }
    }
}
