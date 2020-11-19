package com.app.uevents.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.app.uevents.Adapters.FeaturedAdapter;
import com.app.uevents.Adapters.ViewPagerAdapter;
import com.app.uevents.Fragments.FragFeatured;
import com.app.uevents.MainActivity;
import com.app.uevents.Models.Event;
import com.app.uevents.R;
import com.app.uevents.Utils.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class SplashFeatured extends AppCompatActivity {
    /* access modifiers changed from: private */
    private ViewPager viewPager;

    /* access modifiers changed from: protected */
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        List<Event> events = new ArrayList<>();
        events.add(new Event());
        events.add(new Event());
        events.add(new Event());
        events.add(new Event());
        recyclerView.setAdapter(new FeaturedAdapter(getBaseContext(), events));
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getBaseContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                SplashFeatured.this.viewPager.setCurrentItem(position, true);
            }
        }));
        this.viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager();
        findViewById(R.id.btn_skip).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SplashFeatured.this.getBaseContext(), MainActivity.class);
//                intent.setFlags(268468224);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                SplashFeatured.this.startActivity(intent);
            }
        });
        findViewById(R.id.btn_view).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SplashFeatured.this.startActivity(new Intent(SplashFeatured.this.getBaseContext(), EventViewActivity.class));
            }
        });
    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), 1);
        FragFeatured frag1 = new FragFeatured();
        Bundle bundle = new Bundle();
        bundle.putInt("banner", R.drawable.background);
        frag1.setArguments(bundle);
        adapter.addFragment(frag1, "One");
        FragFeatured frag2 = new FragFeatured();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("banner", R.drawable.background);
        frag2.setArguments(bundle2);
        adapter.addFragment(frag2, "Two");
        FragFeatured frag3 = new FragFeatured();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("banner", R.drawable.background);
        frag3.setArguments(bundle3);
        adapter.addFragment(frag3, "3");
        FragFeatured frag4 = new FragFeatured();
        Bundle bundle4 = new Bundle();
        bundle4.putInt("banner", R.drawable.background);
        frag4.setArguments(bundle4);
        adapter.addFragment(frag4, "4");
        this.viewPager.setAdapter(adapter);
    }
}
