package com.app.uevents;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.viewpager.widget.ViewPager;

import com.app.uevents.Adapters.ViewPagerAdapter;
import com.app.uevents.Fragments.FragmentHome;
import com.app.uevents.Fragments.FragmentNearBy;
import com.app.uevents.Fragments.FragmentSuggested;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    /* access modifiers changed from: private */
    private TextView placeholder;
    /* access modifiers changed from: private */
    private SearchView searchView;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerVViews();
    }

    private void registerVViews() {
        this.placeholder = (TextView) findViewById(R.id.tv_search_placeholder);
        this.searchView = (SearchView) findViewById(R.id.search_view);
        this.searchView.setFocusable(true);
        this.searchView.setFocusableInTouchMode(true);
        this.placeholder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.placeholder.setVisibility(View.GONE);
                MainActivity.this.searchView.onActionViewExpanded();
            }
        });
        this.viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(this.viewPager);
        this.tabLayout = (TabLayout) findViewById(R.id.tabs);
        this.tabLayout.setupWithViewPager(this.viewPager);
    }

    private void setupViewPager(ViewPager viewPager2) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), 1);
        adapter.addFragment(new FragmentHome(), "Home");
        adapter.addFragment(new FragmentNearBy(), "Near You");
        adapter.addFragment(new FragmentSuggested(), "Suggested");
        viewPager2.setAdapter(adapter);
    }
}