package com.app.uevents.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.uevents.Activities.CategoryView;
import com.app.uevents.Activities.EventViewActivity;
import com.app.uevents.Adapters.CategoryAdapter;
import com.app.uevents.Adapters.EventsAdapter;
import com.app.uevents.Models.Category;
import com.app.uevents.R;
import com.app.uevents.Utils.RecyclerItemClickListener;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    private ArrayList<Category> categories = new ArrayList<>();

    /* renamed from: v */
    private View f52v;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.f52v = inflater.inflate(R.layout.frag_home, container, false);
        setViews();
        return this.f52v;
    }

    private void setViews() {
        RecyclerView recyclerView = (RecyclerView) this.f52v.findViewById(R.id.recycler_categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        this.categories.add(new Category("Entertainment"));
        this.categories.add(new Category("Outdoor Events"));
        this.categories.add(new Category("Festivals"));
        this.categories.add(new Category("Sports"));
        this.categories.add(new Category("Jazz"));
        this.categories.add(new Category("Soulful"));
        this.categories.add(new Category("Quiz night"));
        this.categories.add(new Category("Nature"));
        recyclerView.setAdapter(new CategoryAdapter(getContext(), this.categories));
        recyclerView.addOnItemTouchListener((RecyclerView.OnItemTouchListener) new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentHome.this.startActivity(new Intent(FragmentHome.this.getContext(), CategoryView.class));
            }
        }));
        RecyclerView eventsRecycler = (RecyclerView) this.f52v.findViewById(R.id.recycler_events);
        eventsRecycler.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        eventsRecycler.setAdapter(new EventsAdapter(getContext()));
        eventsRecycler.addOnItemTouchListener((RecyclerView.OnItemTouchListener) new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentHome.this.startActivity(new Intent(FragmentHome.this.getContext(), EventViewActivity.class));
            }
        }));
        RecyclerView trendingRecycler = (RecyclerView) this.f52v.findViewById(R.id.recycler_trending);
        trendingRecycler.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        trendingRecycler.setAdapter(new EventsAdapter(getContext()));
        trendingRecycler.addOnItemTouchListener((RecyclerView.OnItemTouchListener) new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentHome.this.startActivity(new Intent(FragmentHome.this.getContext(), EventViewActivity.class));
            }
        }));
        RecyclerView popularRecycler = (RecyclerView) this.f52v.findViewById(R.id.recycler_popular_category);
        popularRecycler.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        popularRecycler.setAdapter(new EventsAdapter(getContext()));
        popularRecycler.addOnItemTouchListener((RecyclerView.OnItemTouchListener) new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            public void onItemClick(View view, int position) {
                FragmentHome.this.startActivity(new Intent(FragmentHome.this.getContext(), EventViewActivity.class));
            }
        }));
    }
}
